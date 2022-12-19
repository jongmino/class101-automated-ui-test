package net.class101.automateduitest.scenarios.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.AllLoginPage;
import net.class101.automateduitest.pages.plus.FaceBookLoginPage;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.pages.plus.LoginPage;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 *  로그인 - 페이스북 유저
 *
 *  Prerequisite:
 *  1) 홈페이지를 연다
 */
public class LoginWithFacebook implements TestScenario {

    @Override
    public TestScenario proceed() {
        Home.Elements.loginButton().click();
        LoginPage.Elements.allLoginButton().click();
        AllLoginPage.Elements.loginWithFaceBookButton().click();
        FaceBookLoginPage.Actions.defaultLogin();
        return this;
    }

    @Override
    public void validate() {
        Home.Elements.userProfileImg().shouldBe(Condition.visible).hover();
    }
}
