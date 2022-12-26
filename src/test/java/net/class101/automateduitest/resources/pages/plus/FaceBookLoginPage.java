package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class FaceBookLoginPage {

    private static final By FACEBOOK_EMAIL_INPUT = byXpath("//input[@id='email']");
    private static final By FACEBOOK_PASSWORD_INPUT = byXpath("//input[@id='pass']");
    private static final By FACEBOOK_LOGIN_BUTTON = byXpath("//button[@name='login']");
    private static final By FACEBOOK_LOGO = byXpath("//i[contains(.,'Facebook')]");

    public static SelenideElement emailInputElement() {
        return $(FACEBOOK_EMAIL_INPUT).shouldBe(Condition.visible);
    }

    public static SelenideElement passwordInputElement() {
        return $(FACEBOOK_PASSWORD_INPUT).shouldBe(Condition.visible);
    }

    public static SelenideElement loginButton() {
        return $(FACEBOOK_LOGIN_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement facebookLogo() {
        return $(FACEBOOK_LOGO).shouldBe(Condition.visible);
    }
}
