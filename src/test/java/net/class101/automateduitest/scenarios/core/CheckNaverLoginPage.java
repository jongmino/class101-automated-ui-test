package net.class101.automateduitest.scenarios.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.NaverLoginPage;
import net.class101.automateduitest.pages.plus.SignUpPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckNaverLoginPage implements TestScenario {

    private static CheckNaverLoginPage instance;

    public static CheckNaverLoginPage getInstance() {
        if (instance == null) {
            instance = new CheckNaverLoginPage();
        }
        return instance;
    }

    private CheckNaverLoginPage() {
    }

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
