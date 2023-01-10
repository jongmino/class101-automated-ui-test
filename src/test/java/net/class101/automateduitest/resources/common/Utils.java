package net.class101.automateduitest.resources.common;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import java.util.concurrent.Callable;
import org.openqa.selenium.Keys;

public class Utils {
    public static void setTestConfig() {
        String browser = System.getenv("browser") == null? "chrome" : System.getenv("browser");
        System.out.println(browser);
        Configuration.browser = browser;
        Configuration.timeout = PropertyLoader.getProperties().timeout;
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
    }
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

    public static void waitFor(final Callable<Boolean> func) {
        waitFor(func, 10000, 100);
    }

    public static void waitFor(final Callable<Boolean> func, final long timeout) {
        waitFor(func, timeout, 100);
    }

    public static void waitFor(final Callable<Boolean> func, final long timeout, final long sleepAmount) {
        final long count = (timeout / sleepAmount) + 1;
        for (int i = 0; i < count; ++i) {
            try {
                final Boolean status = func.call();
                if (status == true) {
                    return;
                }
                Thread.sleep(sleepAmount);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void sleep(final long sleepAmount) {
        try {
            Thread.sleep(sleepAmount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
