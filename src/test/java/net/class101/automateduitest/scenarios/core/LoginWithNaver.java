package net.class101.automateduitest.scenarios.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.AllLoginPage;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.pages.plus.LoginPage;
import net.class101.automateduitest.pages.plus.NaverLoginPage;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 * 네이버 로그인 검증
 * 네이버 로그인은 오토메이션을 잡아내기 때문에 클립보드를 이용하는 방법으로 우회
 */
public class LoginWithNaver implements TestScenario {

    private static LoginWithNaver instance = null;

    public static LoginWithNaver getInstance() {
        if(instance == null){
            instance = new LoginWithNaver();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {

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
