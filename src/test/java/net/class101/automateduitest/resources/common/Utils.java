package net.class101.automateduitest.resources.common;

import com.codeborne.selenide.SelenideElement;
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

    public static void waitFor(final SelenideElement element) {
        waitFor(element, 5000, 100);
    }

    public static void waitFor(final SelenideElement element, final long timeout) {
        waitFor(element, timeout, 100);
    }

    public static void waitFor(final SelenideElement element, final long timeout, final long sleepAmount) {
        final long count = (timeout / sleepAmount) + 1;
        for (int i = 0; i < count; ++i) {
            if (element.exists()) {
                break;
            }
            try {
                Thread.sleep(sleepAmount);
            } catch (Exception e) {
            }
        }
    }
}
