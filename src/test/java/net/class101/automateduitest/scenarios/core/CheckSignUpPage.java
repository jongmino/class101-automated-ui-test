package net.class101.automateduitest.scenarios.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.pages.plus.LoginPage;
import net.class101.automateduitest.pages.plus.SignUpPage;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 *  국내 - 회원가입 - 공통 - 회원가입 버튼 클릭
 *
 *  Prerequisite:
 *  1) 홈페이지를 연다
 */
public class CheckSignUpPage implements TestScenario {

    @Override
    public TestScenario proceed() {
        Home.Elements.loginButton().shouldNotBe(Condition.disabled).click();
        LoginPage.Elements.signUpButton().shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        SignUpPage.Elements.appleButton().shouldBe(Condition.visible);
        SignUpPage.Elements.facebookButton().shouldBe(Condition.visible);
        SignUpPage.Elements.googleButton().shouldBe(Condition.visible);
        SignUpPage.Elements.kakaoButton().shouldBe(Condition.visible);
        SignUpPage.Elements.naverButton().shouldBe(Condition.visible);
        SignUpPage.Elements.emailButton().shouldBe(Condition.visible);
    }
}
