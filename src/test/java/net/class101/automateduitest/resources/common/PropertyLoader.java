package net.class101.automateduitest.resources.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.io.File;

public class PropertyLoader {

    private static final String PROPERTY_FILE_PATH = "src/test/resources/properties-%s.yaml";
    private static final String DEFAULT_PROFILE = "staging";
    private static Properties properties;
    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper(new YAMLFactory());
        mapper.findAndRegisterModules();
    }

    private static Properties load(String path) {
        try {
            return mapper.readValue(new File(path), Properties.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Properties getProperties() {
        String profile = System.getenv("activeProfile");
        System.out.println("ActiveProfile: " + profile);

        if (profile == null || profile.equals("")) {
            profile = DEFAULT_PROFILE;
        }
        System.out.println("ActiveProfile: " + profile);
        if (properties == null) {
            properties = load(String.format(PROPERTY_FILE_PATH, profile));
        }

        return properties;
    }
}
