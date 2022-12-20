package net.class101.automateduitest.resources.pages.creatorCenter;

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
}
