package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class GoogleLoginPage {

    private static final By GOOGLE_LOGIN_TITLE = byXpath("//div[text()='Google 계정으로 로그인']");

    public static SelenideElement googleLoginTitle() {
        return $(GOOGLE_LOGIN_TITLE).shouldBe(Condition.visible);
    }
}
