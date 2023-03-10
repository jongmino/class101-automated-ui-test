package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class AppleLoginPage {

    private static final By APPLE_LOGO = byXpath("(//*[contains(@class,'ac-gn-apple')])[2]");

    public static SelenideElement appleLogo() {
        return $(APPLE_LOGO).shouldBe(Condition.visible);
    }
}
