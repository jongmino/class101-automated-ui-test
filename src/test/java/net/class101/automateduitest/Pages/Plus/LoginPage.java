package net.class101.automateduitest.Pages.Plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public final class LoginPage {
    private static final By ALL_LOGIN_BUTTON = byXpath("//a[contains(@href,'login/all')]");

    public static SelenideElement allLoginButton() {
        return $(ALL_LOGIN_BUTTON);
    }

}
