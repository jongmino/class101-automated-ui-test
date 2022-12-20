package net.class101.automateduitest.resources.testcases.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.FaceBookLoginPage;
import net.class101.automateduitest.resources.pages.plus.SignUpPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 *  국내 - 회원가입 - 간편수단 - 간편수단으로 시작하기 - 회원가입 시도 - 페이스북
 *
 *  Prerequisite:
 *  1) 홈페이지를 연다
 */
public class CheckFacebookLoginPage implements TestCase {

    @Override
    public TestCase proceed() {
        SignUpPage.Actions.openPage();
        SignUpPage.Elements.facebookButton().shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        FaceBookLoginPage.Elements.facebookLogo().shouldNotBe(Condition.visible);
    }
}
