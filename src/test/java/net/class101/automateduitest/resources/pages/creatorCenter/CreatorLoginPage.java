package net.class101.automateduitest.resources.pages.creatorCenter;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class CreatorLoginPage {

    private static final String EMAIL_INPUT_FIELD = "input[name='email']";
    private static final String PASSWORD_INPUT_FIELD = "input[name='password']";
    private static final String LOGIN_BUTTON = "button[type='submit']";

    public static SelenideElement emailInputElement() {
        return $(EMAIL_INPUT_FIELD).shouldBe(Condition.visible);
    }

    public static SelenideElement passwordInputElement() {
        return $(PASSWORD_INPUT_FIELD).shouldBe(Condition.visible);
    }

    public static SelenideElement loginButtonElement() {
        return $(LOGIN_BUTTON).shouldBe(Condition.visible);
    }

    public class Actions {
        public static void login(final String email, final String password) {
            CreatorLoginPage.emailInputElement().sendKeys(email);
            CreatorLoginPage.passwordInputElement().sendKeys(password);
            CreatorLoginPage.loginButtonElement().click();
        }
    }
}
