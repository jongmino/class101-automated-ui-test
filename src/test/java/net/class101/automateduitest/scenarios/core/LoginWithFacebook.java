package net.class101.automateduitest.scenarios.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.AllLoginPage;
import net.class101.automateduitest.pages.plus.FaceBookLoginPage;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.pages.plus.LoginPage;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 * 페이스북 로그인 검증
 */
public class LoginWithFacebook implements TestScenario {

    private static LoginWithFacebook instance = null;

    public static LoginWithFacebook getInstance() {
        if (instance == null) {
            instance = new LoginWithFacebook();
        }
        return instance;
    }

    private LoginWithFacebook() {
    }

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
