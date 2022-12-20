package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class LoginPage {

    public class Elements {
        private static final By ALL_LOGIN_BUTTON = byXpath("//a[contains(@href,'login/all')]");
        private static final By SIGN_UP_BUTTON = byXpath("//h6[text()='회원가입']");

        public static SelenideElement allLoginButton() {
            return $(ALL_LOGIN_BUTTON);
        }

        public static SelenideElement signUpButton() {
            return $(SIGN_UP_BUTTON);
        }
    }
}
