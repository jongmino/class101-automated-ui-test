package net.class101.automateduitest.resources.testcases.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.GoogleLoginPage;
import net.class101.automateduitest.resources.pages.plus.SignUpPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 *  국내 - 회원가입 - 간편수단 - 간편수단으로 시작하기 - 회원가입 시도 - 구글
 *
 *  Prerequisite:
 *  1) 홈페이지를 연다
 */
public class CheckGoogleLoginPage implements TestCase {

    @Override
    public TestCase proceed() {
        SignUpPage.Actions.openPage();
        SignUpPage.Elements.googleButton().shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        GoogleLoginPage.Elements.googleLoginTitle().shouldBe(Condition.visible);
    }
}
