package net.class101.automateduitest.resources.common;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Keys;

public class Utils {
    public static String getUrl() {
        return WebDriverRunner.url();
    }

    public static boolean urlContains(String url) {
        return getUrl().contains(url);
    }

    public static CharSequence paste() {
        final boolean isMac = System.getProperty("os.name").toLowerCase().contains("mac");
        return isMac ? Keys.COMMAND + "v" : Keys.LEFT_CONTROL + "v";
    }
}
