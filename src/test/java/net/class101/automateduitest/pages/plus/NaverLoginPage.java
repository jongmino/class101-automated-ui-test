package net.class101.automateduitest.pages.plus;

import static com.codeborne.selenide.ClipboardConditions.content;
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
            NaverLoginPage.Elements.emailInputElement().click();
            Selenide.clipboard().setText(NAVER_USER_ID);
            Selenide.clipboard().shouldHave(content(NAVER_USER_ID));
            NaverLoginPage.Elements.emailInputElement().sendKeys(Utils.paste());
        }

        public static void fillDefaultPassword() {
            NaverLoginPage.Elements.passwordInputElement().click();
            Selenide.clipboard().setText(NAVER_PASSWORD);
            Selenide.clipboard().shouldHave(content(NAVER_PASSWORD));
            NaverLoginPage.Elements.passwordInputElement().sendKeys(Utils.paste());
        }

        public static void defaultLogin() {
            fillDefaultEmail();
            fillDefaultPassword();
            NaverLoginPage.Elements.loginButton().click();
        }
    }
}
