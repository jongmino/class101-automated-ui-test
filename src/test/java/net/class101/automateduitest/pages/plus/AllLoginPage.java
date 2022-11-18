package net.class101.automateduitest.pages.plus;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import java.util.Map;
import net.class101.automateduitest.common.Properties.Account;
import net.class101.automateduitest.common.PropertyLoader;
import org.openqa.selenium.By;

public class AllLoginPage {

    public class Elements {

        private static final String CLASS101_EMAIL_INPUT_FIELD = "input[name='email']";
        private static final String CLASS101_PASSWORD_INPUT_FIELD = "input[name='password']";
        private static final String LOGIN_BUTTON = "button[type='submit']";
        private static final By ALL_LOGIN_NAVER = withText("네이버");
        private static final By ALL_LOGIN_FACEBOOK = withText("페이스북");

        public static SelenideElement emailInputElement() {
            return $(CLASS101_EMAIL_INPUT_FIELD);
        }

        public static SelenideElement passwordInputElement() {
            return $(CLASS101_PASSWORD_INPUT_FIELD);
        }

        public static SelenideElement loginWithNaverButton() {
            return $(ALL_LOGIN_NAVER);
        }

        public static SelenideElement loginWithFaceBookButton() {
            return $(ALL_LOGIN_FACEBOOK);
        }
    }

    public class Actions {

        private static final Map<String, Account> accounts = PropertyLoader.getProperties().accounts;
        private static final String NON_SUBSCRIBED_USER_ID = accounts.get("plusNonSubscribed").id;
        private static final String NON_SUBSCRIBED_PASSWORD = accounts.get("plusNonSubscribed").pw;
        private static final String SUBSCRIBED_USER_ID = accounts.get("plusSubscribed").id;
        private static final String SUBSCRIBED_PASSWORD = accounts.get("plusSubscribed").pw;

        private static void loginWithEmail(String email, String password) {
            AllLoginPage.Elements.emailInputElement().sendKeys(email);
            AllLoginPage.Elements.passwordInputElement().sendKeys(password);
            $(AllLoginPage.Elements.LOGIN_BUTTON).click();
        }

        public static void loginAsNonSubscriber() {
            loginWithEmail(NON_SUBSCRIBED_USER_ID, NON_SUBSCRIBED_PASSWORD);
        }

        public static void loginAsSubscriber() {
            loginWithEmail(SUBSCRIBED_USER_ID, SUBSCRIBED_PASSWORD);
        }
    }
}
