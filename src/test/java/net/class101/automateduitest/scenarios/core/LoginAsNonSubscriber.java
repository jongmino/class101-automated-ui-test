package net.class101.automateduitest.scenarios.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.AllLoginPage;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.pages.plus.LoginPage;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 * 자체 로그인 검증 Non-Subscriber
 */
public class LoginAsNonSubscriber implements TestScenario {
    private static LoginAsNonSubscriber instance;
    public static LoginAsNonSubscriber getInstance() {
        if (instance == null) {
            instance = new LoginAsNonSubscriber();
        }
        return instance;
    }

    private LoginAsNonSubscriber() {}

    public LoginAsNonSubscriber proceed() {

        //유저 네비게이션 우상단 로그인 버튼 클릭
        Home.Elements.loginButton().click();
        //다른 방법으로 로그인 버튼 클릭
        LoginPage.Elements.allLoginButton().click();
        AllLoginPage.Actions.loginAsNonSubscriber();
        return this;
    }

    public void validate() {

        Home.Elements.userProfileImg().shouldBe(Condition.visible).hover();
    }
}
