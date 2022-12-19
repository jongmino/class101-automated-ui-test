package net.class101.automateduitest.pages.creatorCenter;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import java.util.Map;
import net.class101.automateduitest.common.Properties.Account;
import net.class101.automateduitest.common.PropertyLoader;

public class CreatorLoginPage {

    public class Elements {

        private static final String EMAIL_INPUT_FIELD = "input[name='email']";
        private static final String PASSWORD_INPUT_FIELD = "input[name='password']";
        private static final String LOGIN_BUTTON = "button[type='submit']";

        public static SelenideElement emailInputElement() {
            return $(EMAIL_INPUT_FIELD);
        }

        public static SelenideElement passwordInputElement() {
            return $(PASSWORD_INPUT_FIELD);
        }

        public static SelenideElement loginButtonElement() {
            return $(LOGIN_BUTTON);
        }
    }

    public class Actions {

        private static final Map<String, Account> accounts = PropertyLoader.getProperties().accounts;
        private static final String CREATOR_HAS_REVENUE_USER_ID = accounts.get("creatorHasRevenue").id;
        private static final String CREATOR_HAS_REVENUE_PASSWORD = accounts.get("creatorHasRevenue").pw;
        private static final String CREATOR_HAS_CLASS_USER_ID = accounts.get("creatorHasClass").id;
        private static final String CREATOR_HAS_CLASS_PASSWORD = accounts.get("creatorHasClass").pw;
        private static final String CREATOR_NEW_USER_ID = accounts.get("creatorNew").id;
        private static final String CREATOR_NEW_PASSWORD = accounts.get("creatorNew").pw;

        public static void loginWithEmail(String email, String password) {
            CreatorLoginPage.Elements.emailInputElement().sendKeys(email);
            CreatorLoginPage.Elements.passwordInputElement().sendKeys(password);
            CreatorLoginPage.Elements.loginButtonElement().click();
        }

        public static void loginAsCreatorHasClass() {
            loginWithEmail(CREATOR_HAS_CLASS_USER_ID, CREATOR_HAS_CLASS_PASSWORD);
        }

        public static void loginAsCreatorHasRevenue() {
            loginWithEmail(CREATOR_HAS_REVENUE_USER_ID, CREATOR_HAS_REVENUE_PASSWORD);
        }

        public static void loginAsCreatorNew() {
            loginWithEmail(CREATOR_NEW_USER_ID, CREATOR_NEW_PASSWORD);
        }
    }
}
