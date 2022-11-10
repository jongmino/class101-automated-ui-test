package net.class101.automateduitest.Pages.Plus;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.Common.Util;

public final class NaverLoginPage {
    private static final String EMAIL_INPUT_ELEMENT = "input[id='id']";
    private static final String PASSWORD_INPUT_ELEMENT = "input[id='pw']";
    private static final String NAVER_LOGIN_BUTTON = "button[class='btn_login']";
    private static final String NAVER_USER_ID = "candy6731";
    private static final String NAVER_PASSWORD = "class101!";

    public static SelenideElement emailInputElement() {
        return $(EMAIL_INPUT_ELEMENT);
    }

    public static SelenideElement passwordInputElement() {
        return $(PASSWORD_INPUT_ELEMENT);
    }

    public static SelenideElement loginButton() {
        return $(NAVER_LOGIN_BUTTON);
    }

    public static void fillDefaultEmail() {
        emailInputElement().click();
        Selenide.clipboard().setText(NAVER_USER_ID);
        emailInputElement().sendKeys(Util.paste());
    }

    public static void fillDefaultPassword() {
        passwordInputElement().click();
        Selenide.clipboard().setText(NAVER_PASSWORD);
        passwordInputElement().sendKeys(Util.paste());
    }

    public static void defaultLogin() throws InterruptedException {
        fillDefaultEmail();
        Thread.sleep(1000);
        fillDefaultPassword();
        Thread.sleep(1000);
        loginButton().click();
    }
}
