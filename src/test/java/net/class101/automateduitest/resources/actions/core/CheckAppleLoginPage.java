package net.class101.automateduitest.resources.actions.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.AppleLoginPage;
import net.class101.automateduitest.resources.pages.plus.SignUpPage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 *  국내 - 회원가입 - 간편수단 - 간편수단으로 시작하기 - 회원가입 시도 - 애플
 *
 *  Prerequisite:
 *  1) 홈페이지를 연다
 */
public class CheckAppleLoginPage implements TestAction {

    @Override
    public TestAction execute() {
        SignUpPage.Actions.openPage();
        SignUpPage.Elements.appleButton().shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        AppleLoginPage.Elements.appleLogo().shouldBe(Condition.visible);
    }
}
