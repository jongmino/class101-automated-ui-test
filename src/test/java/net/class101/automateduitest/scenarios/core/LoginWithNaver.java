package net.class101.automateduitest.scenarios.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.AllLoginPage;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.pages.plus.LoginPage;
import net.class101.automateduitest.pages.plus.NaverLoginPage;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 *  로그인 - 네이버 유저
 *
 *  Prerequisite:
 *  1) 홈페이지를 연다
 */
public class LoginWithNaver implements TestScenario {

    @Override
    public TestScenario proceed() {
        Home.Actions.openPage();
        Home.Elements.loginButton().click();
        LoginPage.Elements.allLoginButton().click();
        AllLoginPage.Elements.loginWithNaverButton().click();
        NaverLoginPage.Actions.defaultLogin();
        return this;
    }

    @Override
    public void validate() {
        Home.Elements.userProfileImg().shouldBe(Condition.visible).hover();
    }
}
