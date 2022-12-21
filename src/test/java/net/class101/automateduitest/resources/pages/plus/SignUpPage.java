package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.resources.common.PropertyLoader;
import org.openqa.selenium.By;

public class SignUpPage {

    private static final By KAKAO_BUTTON = byXpath("//button[contains(.,'카카오로 3초 만에 시작하기')]");
    private static final By NAVER_BUTTON = byXpath("//button[contains(.,'네이버로 시작하기')]");
    private static final By FACEBOOK_BUTTON = byXpath("//button[contains(.,'페이스북으로 시작하기')]");
    private static final By GOOGLE_BUTTON = byXpath("//button[contains(.,'구글로 시작하기')]");
    private static final By APPLE_BUTTON = byXpath("//button[contains(.,'Apple로 시작하기')]");
    private static final By EMAIL_BUTTON = byXpath("//span[text()='이메일 주소로 시작하기']");

    public static SelenideElement kakaoButton() {
        return $(KAKAO_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement naverButton() {
        return $(NAVER_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement googleButton() {
        return $(GOOGLE_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement facebookButton() {
        return $(FACEBOOK_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement appleButton() {
        return $(APPLE_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement emailButton() {
        return $(EMAIL_BUTTON).shouldBe(Condition.visible);
    }

    public class Actions {
        public static void openPage() {
            final String plusSignUpPage = PropertyLoader.getProperties().urls.get("plusSignUpPage").staging;
            open(plusSignUpPage);
        }
    }
}
