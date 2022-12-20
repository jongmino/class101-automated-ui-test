package net.class101.automateduitest.resources.common;

import java.util.HashMap;
import java.util.Map;

public class RuntimeStatus {
    private static Map<String, Map<String, Object>> statusMap = new HashMap<>();

    private static String getMapKey() {
        return Thread.currentThread().getId() + "";
    }

    public static Map<String, Object> get(String key) {
        return statusMap.get(getMapKey());
    }

    public static void set(String key, Object value) {
        final String mapKey = getMapKey();
        if (!statusMap.containsKey(mapKey)) {
            statusMap.put(mapKey, new HashMap<>());
        }
        statusMap.get(mapKey).put(key, value);
    }
}
