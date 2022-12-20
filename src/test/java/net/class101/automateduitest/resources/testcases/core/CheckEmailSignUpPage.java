package net.class101.automateduitest.resources.testcases.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.EmailSignUpPage;
import net.class101.automateduitest.resources.pages.plus.SignUpPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 *  국내 - 회원가입 - 간편수단 - 간편수단으로 시작하기 - 회원가입 시도 - 이메일
 *
 *  Prerequisite:
 *  1) 홈페이지를 연다
 */
public class CheckEmailSignUpPage implements TestCase {

    @Override
    public TestCase proceed() {
        SignUpPage.Actions.openPage();
        SignUpPage.Elements.emailButton().click();
        return this;
    }

    @Override
    public void validate() {
        EmailSignUpPage.Elements.signUpTitle().shouldBe(Condition.visible);
        EmailSignUpPage.Elements.emailInput().shouldBe(Condition.visible);
        EmailSignUpPage.Elements.passwordInput().shouldBe(Condition.visible);
        EmailSignUpPage.Elements.confirmPasswordInput().shouldBe(Condition.visible);
        EmailSignUpPage.Elements.nextButton().shouldBe(Condition.visible);
        EmailSignUpPage.Elements.kakaoSignUpButton().shouldBe(Condition.visible);
        EmailSignUpPage.Elements.moreOptionButton().shouldBe(Condition.visible);
    }
}
