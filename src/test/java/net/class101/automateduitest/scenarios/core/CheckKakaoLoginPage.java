package net.class101.automateduitest.scenarios.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.KakaoLoginPage;
import net.class101.automateduitest.pages.plus.SignUpPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckKakaoLoginPage implements TestScenario {

    private static CheckKakaoLoginPage instance;
    public static CheckKakaoLoginPage getInstance() {
        if (instance == null) {
            instance = new CheckKakaoLoginPage();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        SignUpPage.Actions.openPage();
        SignUpPage.Elements.kakaoButton().shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        KakaoLoginPage.Elements.kakaoLogo().shouldBe(Condition.visible);
    }
}
