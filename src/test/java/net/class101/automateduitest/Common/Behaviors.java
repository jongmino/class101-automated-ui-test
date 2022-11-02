package net.class101.automateduitest.Common;

import static com.codeborne.selenide.Selenide.$;

import net.class101.automateduitest.Constants;

public final class Behaviors {
    public static void loginWithEmail() {
        $(Constants.USER_NAVIGATION_LOGIN_BUTTON).click();
        $(Constants.LOGIN_PAGE_ALL_LOGIN_BUTTON).click();
        $(Constants.CLASS101_EMAIL_INPUT_FIELD).sendKeys(Constants.CLASS101_USER_ID);
        $(Constants.CLASS101_PASSWORD_INPUT_FIELD).sendKeys(Constants.CLASS101_PASSWORD);
        $(Constants.LOGIN_PAGE_LOGIN_BUTTON).click();
    }
}
