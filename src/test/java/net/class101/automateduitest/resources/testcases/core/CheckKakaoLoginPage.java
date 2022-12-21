package net.class101.automateduitest.resources.testcases.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.KakaoLoginPage;
import net.class101.automateduitest.resources.pages.plus.SignUpPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * @설명: 간편수단 회원가입 중 카카오로 시작하기 버튼을 클릭했을 때 정상적으로 카카오 로그인 페이지로 이동되는지 테스트한다
 * @분류: 국내 - 회원가입 - 간편수단 - 간편수단으로 시작하기 - 회원가입 시도 - 카카오
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 */
public class CheckKakaoLoginPage implements TestCase {

    @Override
    public TestCase proceed() {
        SignUpPage.Actions.openPage();
        SignUpPage.kakaoButton().shouldNotBe(Condition.disabled).click();
        KakaoLoginPage.kakaoLogo();
        return this;
    }

    @Override
    public void validate() {
        KakaoLoginPage.kakaoLogo();
    }
}
