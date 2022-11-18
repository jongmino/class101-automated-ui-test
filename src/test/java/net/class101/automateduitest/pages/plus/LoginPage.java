package net.class101.automateduitest.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class LoginPage {

    public class Elements {
        private static final By ALL_LOGIN_BUTTON = byXpath("//a[contains(@href,'login/all')]");

        public static SelenideElement allLoginButton() {
            return $(ALL_LOGIN_BUTTON);
        }
    }

    public class Actions {}
}