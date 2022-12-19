package net.class101.automateduitest.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Singleton Factory
 */
@SuppressWarnings({"unchecked"})
public class SF {
    private static Map<String, Object> instances = new HashMap<>();

    public static <T> T getInstance(Class<T> type) {
        try {
            final String typeName = type.getName();
            if (!instances.containsKey(typeName)) {
                createInstance(type);
            }
            return (T) instances.get(typeName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static synchronized <T> void createInstance(Class<T> type) {
        try {
            final String typeName = type.getName();
            if (!instances.containsKey(typeName)) {
                instances.put(typeName, type.getConstructor().newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static synchronized void clear() {
        instances.clear();
    }
}
