package net.class101.automateduitest.scenarios.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.AllLoginPage;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.pages.plus.LoginPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class LoginAsUserHasKit implements TestScenario {

    private static LoginAsUserHasKit instance;

    public static LoginAsUserHasKit getInstance() {
        if (instance == null) {
            instance = new LoginAsUserHasKit();
        }
        return instance;
    }

    private LoginAsUserHasKit() {
    }

    @Override
    public TestScenario proceed() {
        Home.Elements.loginButton().click();
        LoginPage.Elements.allLoginButton().click();
        AllLoginPage.Actions.loginAsUserHasKit();
        return this;
    }

    @Override
    public void validate() {
        Home.Elements.userProfileImg().shouldBe(Condition.visible).hover();
    }
}
