package net.class101.automateduitest.resources.testcases.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.NaverLoginPage;
import net.class101.automateduitest.resources.pages.plus.SignUpPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명: 간편수단 회원가입 중 네이버로 시작하기 버튼을 클릭했을 때 정상적으로 네이버 로그인 페이지로 이동되는지 테스트한다
 * @분류: 국내 - 회원가입 - 간편수단 - 간편수단으로 시작하기 - 회원가입 시도 - 네이버
 * @테스트_선행조건:
 *  1) 홈페이지를 연다버
 */
public class CheckNaverLoginPage implements TestCase {

    @Override
    public TestCase proceed() {
        SignUpPage.Actions.openPage();
        SignUpPage.naverButton().shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(NaverLoginPage.naverLogo().exists());
    }
}
