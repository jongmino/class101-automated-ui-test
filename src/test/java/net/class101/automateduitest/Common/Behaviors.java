package net.class101.automateduitest.Common;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.Constants;

public final class Behaviors {
    public static void loginWithEmail(String userId, String password) {
        $(Constants.USER_NAVIGATION_LOGIN_BUTTON).click();
        $(Constants.LOGIN_PAGE_ALL_LOGIN_BUTTON).click();
        $(Constants.CLASS101_EMAIL_INPUT_FIELD).sendKeys(userId);
        $(Constants.CLASS101_PASSWORD_INPUT_FIELD).sendKeys(password);
        $(Constants.LOGIN_PAGE_LOGIN_BUTTON).click();
    }

    public static void openUrl(String url) {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 20000;
        Configuration.browserPosition = "0x0";
        open(url);
    }
}
