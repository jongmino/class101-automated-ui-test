package net.class101.automateduitest.scenarios.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.AllLoginPage;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.pages.plus.LoginPage;
import net.class101.automateduitest.scenarios.TestScenario;


/**
 *  로그인 - 미구독 유저
 *
 *  Prerequisite:
 *  1) 홈페이지를 연다
 */
public class LoginAsNonSubscriber implements TestScenario {

    @Override
    public TestScenario proceed() {
        Home.Actions.openPage();
        //유저 네비게이션 우상단 로그인 버튼 클릭
        Home.Elements.loginButton().click();
        //다른 방법으로 로그인 버튼 클릭
        LoginPage.Elements.allLoginButton().click();
        AllLoginPage.Actions.loginAsNonSubscriber();
        return this;
    }

    @Override
    public void validate() {
        Home.Elements.userProfileImg().shouldBe(Condition.visible).hover();
    }
}
