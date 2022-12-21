package net.class101.automateduitest.resources.testcases.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.EmailSignUpPage;
import net.class101.automateduitest.resources.pages.plus.SignUpPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * @설명: 간편수단 회원가입 중 이메일 주소로 시작하기 버튼을 클릭했을 때 정상적으로 이메일 회원가입 페이지로 이동되는지 테스트한다
 * @분류: 국내 - 회원가입 - 간편수단 - 간편수단으로 시작하기 - 회원가입 시도 - 이메일
 * @테스트_선행조건기
 *  1) 홈페이지를 연다
 */
public class CheckEmailSignUpPage implements TestCase {

    @Override
    public TestCase proceed() {
        SignUpPage.Actions.openPage();
        SignUpPage.emailButton().click();
        return this;
    }

    @Override
    public void validate() {
        EmailSignUpPage.signUpTitle().shouldBe(Condition.visible);
        EmailSignUpPage.emailInput().shouldBe(Condition.visible);
        EmailSignUpPage.passwordInput().shouldBe(Condition.visible);
        EmailSignUpPage.confirmPasswordInput().shouldBe(Condition.visible);
        EmailSignUpPage.nextButton().shouldBe(Condition.visible);
        EmailSignUpPage.kakaoSignUpButton().shouldBe(Condition.visible);
        EmailSignUpPage.moreOptionButton().shouldBe(Condition.visible);
    }
}
