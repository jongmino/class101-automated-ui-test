package net.class101.automateduitest.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.common.PropertyLoader;
import net.class101.automateduitest.common.Utils;
import org.openqa.selenium.By;

public class NaverLoginPage {

    public class Elements {

        private static final String EMAIL_INPUT_ELEMENT = "input[id='id']";
        private static final String PASSWORD_INPUT_ELEMENT = "input[id='pw']";
        private static final String NAVER_LOGIN_BUTTON = "button[class='btn_login']";
        private static final By NAVER_LOGO = byXpath("//a[contains(.,'NAVER')]");

        public static SelenideElement emailInputElement() {
            return $(EMAIL_INPUT_ELEMENT);
        }

        public static SelenideElement passwordInputElement() {
            return $(PASSWORD_INPUT_ELEMENT);
        }

        public static SelenideElement loginButton() {
            return $(NAVER_LOGIN_BUTTON);
        }

        public static SelenideElement naverLogo() {
            return $(NAVER_LOGO);
        }
    }

    public class Actions {

        private static final String NAVER_USER_ID = PropertyLoader.getProperties().accounts.get("plusNaver").id;
        private static final String NAVER_PASSWORD = PropertyLoader.getProperties().accounts.get("plusNaver").pw;

        public static void fillDefaultEmail() {
            try {
                NaverLoginPage.Elements.emailInputElement().click();
                Selenide.clipboard().setText(NAVER_USER_ID);
                Thread.sleep(1000);
                NaverLoginPage.Elements.emailInputElement().sendKeys(Utils.paste());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void fillDefaultPassword() {
            try {
                NaverLoginPage.Elements.passwordInputElement().click();
                Selenide.clipboard().setText(NAVER_PASSWORD);
                Thread.sleep(1000);
                NaverLoginPage.Elements.passwordInputElement().sendKeys(Utils.paste());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void defaultLogin() {
            fillDefaultEmail();
            fillDefaultPassword();
            NaverLoginPage.Elements.loginButton().click();
        }
    }
}
