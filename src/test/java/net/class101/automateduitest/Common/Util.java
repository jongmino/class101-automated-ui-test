package net.class101.automateduitest.Common;

import com.codeborne.selenide.WebDriverRunner;

public final class Util {
    public static String getUrl() {
        return WebDriverRunner.url();
    }

    public static Boolean urlContains(String url){
        return getUrl().contains(url);
    }
}
