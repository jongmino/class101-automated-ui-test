package net.class101.automateduitest.Common;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Keys;

public final class Util {
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
}
