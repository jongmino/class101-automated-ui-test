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

    public static SelenideElement waitFor(final SelenideElement element) {
        return waitFor(element, 10000, 100);
    }

    public static SelenideElement waitFor(final SelenideElement element, final long timeout) {
        return waitFor(element, timeout, 100);
    }

    public static SelenideElement waitFor(final SelenideElement element, final long timeout, final long sleepAmount) {
        final long count = (timeout / sleepAmount) + 1;
        boolean exists = false;
        for (int i = 0; i < count; ++i) {
            if (element.exists()) {
                exists = true;
                break;
            }
            try {
                Thread.sleep(sleepAmount);
            } catch (Exception e) {
            }
        }
        if (!exists) {
            throw new RuntimeException(element + " not exist");
        }
        return element;
    }

    public static void waitFor(final boolean condition) {
        waitFor(condition, 10000, 100);
    }

    public static void waitFor(final boolean condition, final long timeout) {
        waitFor(condition, timeout, 100);
    }

    public static void waitFor(final boolean condition, final long timeout, final long sleepAmount) {
        final long count = (timeout / sleepAmount) + 1;
        for (int i = 0; i < count; ++i) {
            if (condition) {
                break;
            }
            try {
                Thread.sleep(sleepAmount);
            } catch (Exception e) {
            }
        }
    }

    public static void sleep(final long sleepAmount) {
        try {
            Thread.sleep(sleepAmount);
        } catch (Exception e) {
        }
    }
}
