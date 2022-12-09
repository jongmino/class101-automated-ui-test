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

        public static SelenideElement emailInputField() {
            return $(CLASS101_EMAIL_INPUT_FIELD);
        }

        public static SelenideElement passwordInputField() {
            return $(CLASS101_PASSWORD_INPUT_FIELD);
        }

        public static SelenideElement loginWithNaverButton() {
            return $(ALL_LOGIN_NAVER);
        }

        public static SelenideElement loginWithFaceBookButton() {
            return $(ALL_LOGIN_FACEBOOK);
        }

        public static SelenideElement loginButton() {
            return $(LOGIN_BUTTON);
        }
    }

    public class Actions {

        private static final Map<String, Account> accounts = PropertyLoader.getProperties().accounts;
        private static final String NON_SUBSCRIBED_USER_ID = accounts.get("plusNonSubscriber").id;
        private static final String NON_SUBSCRIBED_PASSWORD = accounts.get("plusNonSubscriber").pw;
        private static final String SUBSCRIBED_USER_ID = accounts.get("plusSubscriber").id;
        private static final String SUBSCRIBED_PASSWORD = accounts.get("plusSubscriber").pw;
        private static final String YEARLY_SUBSCRIBER_USER_ID = accounts.get("plusYearlySubscriber").id;
        private static final String YEARLY_SUBSCRIBER_PASSWORD = accounts.get("plusYearlySubscriber").pw;
        private static final String KIT_USER_ID = accounts.get("plusHasKit").id;
        private static final String KIT_PASSWORD = accounts.get("plusHasKit").pw;

        private static void loginWithEmail(String email, String password) {
            AllLoginPage.Elements.emailInputField().sendKeys(email);
            AllLoginPage.Elements.passwordInputField().sendKeys(password);
            AllLoginPage.Elements.loginButton().click();
        }

        public static void loginAsNonSubscriber() {
            loginWithEmail(NON_SUBSCRIBED_USER_ID, NON_SUBSCRIBED_PASSWORD);
        }

        public static void loginAsSubscriber() {
            loginWithEmail(SUBSCRIBED_USER_ID, SUBSCRIBED_PASSWORD);
        }

        public static void loginAsUserHasKit() {
            loginWithEmail(KIT_USER_ID, KIT_PASSWORD);
        }

        public static void loginAsYearlySubscriber() {
            loginWithEmail(YEARLY_SUBSCRIBER_USER_ID, YEARLY_SUBSCRIBER_PASSWORD);
        }
    }
}
