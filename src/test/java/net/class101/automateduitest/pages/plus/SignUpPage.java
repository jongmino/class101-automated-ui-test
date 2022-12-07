package net.class101.automateduitest.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.common.PropertyLoader;
import org.openqa.selenium.By;

public class SignUpPage {

    public class Elements{

        private static final By KAKAO_BUTTON  = byXpath("//button[contains(.,'카카오로 3초 만에 시작하기')]");
        private static final By NAVER_BUTTON  = byXpath("//button[contains(.,'네이버로 시작하기')]");
        private static final By FACEBOOK_BUTTON  = byXpath("//button[contains(.,'페이스북으로 시작하기')]");
        private static final By GOOGLE_BUTTON  = byXpath("//button[contains(.,'구글로 시작하기')]");
        private static final By APPLE_BUTTON  = byXpath("//button[contains(.,'Apple로 시작하기')]");
        private static final By EMAIL_BUTTON = byXpath("//span[text()='이메일 주소로 시작하기']");

        public static SelenideElement kakaoButton() {
            return $(KAKAO_BUTTON);
        }

        public static SelenideElement naverButton() {
            return $(NAVER_BUTTON);
        }

        public static SelenideElement googleButton() {
            return $(GOOGLE_BUTTON);
        }

        public static SelenideElement facebookButton() {
            return $(FACEBOOK_BUTTON);
        }

        public static SelenideElement appleButton() {
            return $(APPLE_BUTTON);
        }

        public static SelenideElement emailButton() {
            return $(EMAIL_BUTTON);
        }
    }

    public class Actions{
        private static final String STAGING_SIGN_UP_PAGE_URL = PropertyLoader.getProperties().urls.get("plusSignUpPage").staging;
        public static void openPage(){
            open(STAGING_SIGN_UP_PAGE_URL);
        }
    }
}
