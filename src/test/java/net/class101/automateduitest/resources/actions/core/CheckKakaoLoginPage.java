package net.class101.automateduitest.resources.actions.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.KakaoLoginPage;
import net.class101.automateduitest.resources.pages.plus.SignUpPage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 *  국내 - 회원가입 - 간편수단 - 간편수단으로 시작하기 - 회원가입 시도 - 카카오
 *
 *  Prerequisite:
 *  1) 홈페이지를 연다
 */
public class CheckKakaoLoginPage implements TestAction {

    @Override
    public TestAction execute() {
        SignUpPage.Actions.openPage();
        SignUpPage.Elements.kakaoButton().shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        KakaoLoginPage.Elements.kakaoLogo().shouldBe(Condition.visible);
    }
}
