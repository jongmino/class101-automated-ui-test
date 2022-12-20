package net.class101.automateduitest.resources.actions.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.AllLoginPage;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.LoginPage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 *  로그인 - 연간 구독 유저
 *
 *  Prerequisite:
 *  1) 홈페이지를 연다
 */
public class LoginAsYearlySubscriber implements TestAction {

    @Override
    public TestAction execute() {
        Home.Elements.loginButton().click();
        LoginPage.Elements.allLoginButton().click();
        AllLoginPage.Actions.loginAsYearlySubscriber();
        return this;
    }

    @Override
    public void validate() {
        Home.Elements.userProfileImg().shouldBe(Condition.visible).hover();
    }
}
