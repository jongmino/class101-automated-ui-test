package net.class101.automateduitest.Common;

import com.codeborne.selenide.WebDriverRunner;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.Keys;

public final class Utils {
    public static String getUrl() {
        return WebDriverRunner.url();
    }

    public static Boolean urlContains(String url){
        return getUrl().contains(url);
    }

    public static CharSequence paste() {

        Boolean isMac = System.getProperty("os.name").toLowerCase().contains("mac");

        return isMac? Keys.COMMAND + "v" : Keys.LEFT_CONTROL + "v";
    }

    public static Properties getProperties() {
        try{
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            mapper.findAndRegisterModules();
            Properties properties = mapper.readValue(new File("src/test/resources/properties.yaml"), Properties.class);

            return properties;
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}
