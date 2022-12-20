package net.class101.automateduitest.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import net.class101.automateduitest.common.Properties;

import java.io.File;

public class PropertyLoader {

    private static final String propertiesFilePath = "src/test/resources/properties.yaml";
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
        if (properties == null) {
            properties = load(propertiesFilePath);
        }
        return properties;
    }
}
