package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class LoginPage {

    private static final By ALL_LOGIN_BUTTON = byXpath("//a[contains(@href,'login/all')]");
    private static final By SIGN_UP_BUTTON = byXpath("//h6[text()='회원가입']");

    public static SelenideElement allLoginButton() {
        return $(ALL_LOGIN_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement signUpButton() {
        return $(SIGN_UP_BUTTON).shouldBe(Condition.visible);
    }
}
