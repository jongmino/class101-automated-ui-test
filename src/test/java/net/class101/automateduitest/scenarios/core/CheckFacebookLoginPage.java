package net.class101.automateduitest.scenarios.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.FaceBookLoginPage;
import net.class101.automateduitest.pages.plus.SignUpPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckFacebookLoginPage implements TestScenario {

    private static CheckFacebookLoginPage instance;

    public static CheckFacebookLoginPage getInstance() {
        if (instance == null) {
            instance = new CheckFacebookLoginPage();
        }
        return instance;
    }

    private CheckFacebookLoginPage() {
    }

    @Override
    public TestScenario proceed() {
        SignUpPage.Actions.openPage();
        SignUpPage.Elements.facebookButton().shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        FaceBookLoginPage.Elements.facebookLogo().shouldNotBe(Condition.visible);
    }
}
