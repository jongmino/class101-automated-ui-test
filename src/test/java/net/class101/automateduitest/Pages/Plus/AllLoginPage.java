package net.class101.automateduitest.Pages.Plus;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public final class AllLoginPage {
    private static final String NON_SUBSCRIBED_USER_ID = "referral_1@101.inc";
    private static final String NON_SUBSCRIBED_PASSWORD = "class101!";
    private static final String CLASS101_EMAIL_INPUT_FIELD = "input[name='email']";
    private static final String CLASS101_PASSWORD_INPUT_FIELD = "input[name='password']";
    private static final String SUBSCRIBED_USER_ID = "sbtestc422@101.inc";
    private static final String SUBSCRIBED_PASSWORD = "test001!";
    private static final String LOGIN_BUTTON = "button[type='submit']";
    private static final By ALL_LOGIN_NAVER = withText("네이버");
    private static final By ALL_LOGIN_FACEBOOK = withText("페이스북");

    public static SelenideElement emailInputElement() {
        return $(CLASS101_EMAIL_INPUT_FIELD);
    }

    public static SelenideElement passwordInputElement() {
        return $(CLASS101_PASSWORD_INPUT_FIELD);
    }

    public static void loginWithEmail(String email, String password) {
        emailInputElement().sendKeys(email);
        passwordInputElement().sendKeys(password);
        $(LOGIN_BUTTON).click();
    }

    public static void loginWithNonSubscribedUser() {
        loginWithEmail(NON_SUBSCRIBED_USER_ID, NON_SUBSCRIBED_PASSWORD);
    }

    public static void loginWithSubscribedUser() {
        loginWithEmail(SUBSCRIBED_USER_ID, SUBSCRIBED_PASSWORD);
    }

    public static SelenideElement loginWithNaverButton() {
        return $(ALL_LOGIN_NAVER);
    }

    public static SelenideElement loginWithFaceBookButton() {
        return $(ALL_LOGIN_FACEBOOK);
    }
}
