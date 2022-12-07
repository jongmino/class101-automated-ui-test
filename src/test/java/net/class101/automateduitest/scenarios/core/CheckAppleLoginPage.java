package net.class101.automateduitest.scenarios.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.AppleLoginPage;
import net.class101.automateduitest.pages.plus.SignUpPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckAppleLoginPage implements TestScenario {

    private static CheckAppleLoginPage instance;
    public static CheckAppleLoginPage getInstance() {
        if (instance == null) {
            instance = new CheckAppleLoginPage();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        SignUpPage.Actions.openPage();
        SignUpPage.Elements.appleButton().shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        AppleLoginPage.Elements.appleLogo().shouldBe(Condition.visible);
    }
}
