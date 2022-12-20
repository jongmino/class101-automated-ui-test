package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.common.PropertyLoader;
import org.openqa.selenium.By;

public class FaceBookLoginPage {

    public class Elements {

        private static final By FACEBOOK_EMAIL_INPUT = byXpath("//input[@name='email']");
        private static final By FACEBOOK_PASSWORD_INPUT = byXpath("//input[@name='pass']");
        private static final By FACEBOOK_LOGIN_BUTTON = byXpath("//button[@name='login']");
        private static final By FACEBOOK_LOGO = byXpath("//i[contains(.,'Facebook')]");

        public static SelenideElement emailInputElement() {
            return $(FACEBOOK_EMAIL_INPUT);
        }

        public static SelenideElement passwordInputElement() {
            return $(FACEBOOK_PASSWORD_INPUT);
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

        public static void defaultLogin() {
            FaceBookLoginPage.Elements.emailInputElement().sendKeys(FACEBOOK_USER_ID);
            FaceBookLoginPage.Elements.emailInputElement().shouldHave(text(FACEBOOK_USER_ID));
            FaceBookLoginPage.Elements.passwordInputElement().sendKeys(FACEBOOK_PASSWORD);
            FaceBookLoginPage.Elements.passwordInputElement().shouldHave(text(FACEBOOK_PASSWORD));
            FaceBookLoginPage.Elements.loginButton().click();
        }
    }
}
