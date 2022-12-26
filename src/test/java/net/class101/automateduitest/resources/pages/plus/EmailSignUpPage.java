package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class EmailSignUpPage {

    private static final By SIGN_UP_TITLE = byXpath("//h3[text()='회원가입']");
    private static final By EMAIL_INPUT = byXpath("//input[@name='email']");
    private static final By PASSWORD_INPUT = byXpath("//input[@name='password']");
    private static final By CONFIRM_PASSWORD_INPUT = byXpath("//input[@name='confirmPassword']");
    private static final By NEXT_BUTTON = byXpath("//button[contains(.,'다음')]");
    private static final By KAKAO_SIGN_UP_BUTTON = byXpath("//p[text()='카카오로 3초 만에 시작하기']");
    private static final By MORE_OPTIONS_BUTTON = byXpath("//a[contains(@href, '/ko/register')]");

    public static SelenideElement signUpTitle() {
        return $(SIGN_UP_TITLE).shouldBe(Condition.visible);
    }

    public static SelenideElement emailInput() {
        return $(EMAIL_INPUT).shouldBe(Condition.visible);
    }

    public static SelenideElement passwordInput() {
        return $(PASSWORD_INPUT).shouldBe(Condition.visible);
    }

    public static SelenideElement confirmPasswordInput() {
        return $(CONFIRM_PASSWORD_INPUT).shouldBe(Condition.visible);
    }

    public static SelenideElement nextButton() {
        return $(NEXT_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement kakaoSignUpButton() {
        return $(KAKAO_SIGN_UP_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement moreOptionButton() {
        return $(MORE_OPTIONS_BUTTON).shouldBe(Condition.visible);
    }
}
