package net.class101.automateduitest.resources.testcases.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.AllLoginPage;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.LoginPage;
import net.class101.automateduitest.resources.testcases.TestCase;


/**
 *  로그인 - 구독 유저 (월간)
 *
 *  Prerequisite:
 *  1) 홈페이지를 연다
 */
public class LoginAsSubscriber implements TestCase {

    @Override
    public TestCase proceed() {
        Home.Elements.loginButton().click();
        LoginPage.Elements.allLoginButton().click();
        AllLoginPage.Actions.loginAsSubscriber();
        return this;
    }

    @Override
    public void validate() {
        Home.Elements.userProfileImg().shouldBe(Condition.visible).hover();
    }
}
