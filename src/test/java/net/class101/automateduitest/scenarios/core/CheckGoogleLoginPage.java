package net.class101.automateduitest.scenarios.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.GoogleLoginPage;
import net.class101.automateduitest.pages.plus.SignUpPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckGoogleLoginPage implements TestScenario {

    @Override
    public TestScenario proceed() {
        SignUpPage.Actions.openPage();
        SignUpPage.Elements.googleButton().shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        GoogleLoginPage.Elements.googleLoginTitle().shouldBe(Condition.visible);
    }
}
