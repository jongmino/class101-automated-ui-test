package net.class101.automateduitest.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.common.PropertyLoader;
import org.openqa.selenium.By;

public class FaceBookLoginPage {

    public class Elements {

        private static final String EMAIL_INPUT_ELEMENT = "input[id='email']";
        private static final String PASSWORD_INPUT_ELEMENT = "input[name='pass']";
        private static final String FACEBOOK_LOGIN_BUTTON = "button[type='submit']";
        private static final By FACEBOOK_LOGO = byXpath("//i[contains(.,'Facebook')]");


        public static SelenideElement emailInputElement() {
            return $(EMAIL_INPUT_ELEMENT);
        }

        public static SelenideElement passwordInputElement() {
            return $(PASSWORD_INPUT_ELEMENT);
        }

        public static SelenideElement loginButton() {
            return $(FACEBOOK_LOGIN_BUTTON);
        }

        public static SelenideElement facebookLogo() {
            return $(FACEBOOK_LOGO);
        }
    }

    public class Actions {

        private static final String FACEBOOK_USER_ID = PropertyLoader.getProperties().accounts.get("plusFacebook").id;
        private static final String FACEBOOK_PASSWORD = PropertyLoader.getProperties().accounts.get("plusFacebook").pw;

        public static void fillDefaultEmail() {
            FaceBookLoginPage.Elements.emailInputElement().sendKeys(FACEBOOK_USER_ID);
        }

        public static void fillDefaultPassword() {
            FaceBookLoginPage.Elements.passwordInputElement().sendKeys(FACEBOOK_PASSWORD);
        }

        public static void defaultLogin() {
            fillDefaultEmail();
            fillDefaultPassword();
            FaceBookLoginPage.Elements.loginButton().click();
        }
    }
}
