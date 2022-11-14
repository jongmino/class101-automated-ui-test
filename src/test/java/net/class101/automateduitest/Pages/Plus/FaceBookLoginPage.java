package net.class101.automateduitest.Pages.Plus;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.Common.Utils;

public final class FaceBookLoginPage {
    private static final String EMAIL_INPUT_ELEMENT = "input[id='email']";
    private static final String PASSWORD_INPUT_ELEMENT = "input[name='pass']";
    private static final String FACEBOOK_LOGIN_BUTTON = "button[type='submit']";
    private static final String FACEBOOK_USER_ID = Utils.getProperties().accounts.get("plusFacebook").id;
    private static final String FACEBOOK_PASSWORD = Utils.getProperties().accounts.get("plusFacebook").pw;

    public static SelenideElement emailInputElement() {
        return $(EMAIL_INPUT_ELEMENT);
    }

    public static SelenideElement passwordInputElement() {
        return $(PASSWORD_INPUT_ELEMENT);
    }

    public static SelenideElement loginButton() {
        return $(FACEBOOK_LOGIN_BUTTON);
    }

    public static void fillDefaultEmail() {
        emailInputElement().sendKeys(FACEBOOK_USER_ID);
    }

    public static void fillDefaultPassword() {
        passwordInputElement().sendKeys(FACEBOOK_PASSWORD);
    }

    public static void defaultLogin() {
        fillDefaultEmail();
        fillDefaultPassword();
        loginButton().click();
    }
}
