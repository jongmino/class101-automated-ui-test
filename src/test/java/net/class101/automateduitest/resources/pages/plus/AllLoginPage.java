package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class AllLoginPage {

    private static final String CLASS101_EMAIL_INPUT_FIELD = "input[name='email']";
    private static final String CLASS101_PASSWORD_INPUT_FIELD = "input[name='password']";
    private static final String LOGIN_BUTTON = "button[type='submit']";
    private static final By ALL_LOGIN_NAVER = withText("네이버");
    private static final By ALL_LOGIN_FACEBOOK = withText("페이스북");

    public static SelenideElement emailInputField() {
        return $(CLASS101_EMAIL_INPUT_FIELD);
    }

    public static SelenideElement passwordInputField() {
        return $(CLASS101_PASSWORD_INPUT_FIELD);
    }

    public static SelenideElement loginWithNaverButton() {
        return $(ALL_LOGIN_NAVER);
    }

    public static SelenideElement loginWithFaceBookButton() {
        return $(ALL_LOGIN_FACEBOOK);
    }

    public static SelenideElement loginButton() {
        return $(LOGIN_BUTTON);
    }

    public class Actions {
        public static void login(final String email, final String password) {
            AllLoginPage.emailInputField().sendKeys(email);
            AllLoginPage.passwordInputField().sendKeys(password);
            AllLoginPage.loginButton().click();
        }
    }
}
