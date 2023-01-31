package net.class101.automateduitest.resources.testcases.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.LoginPage;
import net.class101.automateduitest.resources.pages.plus.SignUpPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명: 로그인 페이지에서 회원가입 버튼을 눌렀을 때 회원가입 페이지로 정상적으로 이동되는지 테스트한다
 * @분류: 국내 - 회원가입 - 공통 - 회원가입 버튼 클릭
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 */
public class CheckSignUpPage implements TestCase {

    @Override
    public TestCase proceed() {
        Home.loginButton().shouldNotBe(Condition.disabled).click();
        LoginPage.signUpButton().shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(SignUpPage.appleButton().exists());
        assertTrue(SignUpPage.facebookButton().exists());
        assertTrue(SignUpPage.googleButton().exists());
        assertTrue(SignUpPage.kakaoButton().exists());
        assertTrue(SignUpPage.naverButton().exists());
        assertTrue(SignUpPage.emailButton().exists());
    }
}
