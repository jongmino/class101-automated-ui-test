package net.class101.automateduitest.scenarios.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.NaverLoginPage;
import net.class101.automateduitest.pages.plus.SignUpPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckNaverLoginPage implements TestScenario {

    @Override
    public TestScenario proceed() {
        SignUpPage.Actions.openPage();
        SignUpPage.Elements.naverButton().shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        NaverLoginPage.Elements.naverLogo().shouldBe(Condition.visible);
    }
}
