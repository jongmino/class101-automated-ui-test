package net.class101.automateduitest.scenarios.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.EmailSignUpPage;
import net.class101.automateduitest.pages.plus.SignUpPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckEmailSignUpPage implements TestScenario {

    @Override
    public TestScenario proceed() {
        SignUpPage.Actions.openPage();
        SignUpPage.Elements.emailButton().click();
        return this;
    }

    @Override
    public void validate() {
        EmailSignUpPage.Elements.signUpTitle().shouldBe(Condition.visible);
        EmailSignUpPage.Elements.emailInput().shouldBe(Condition.visible);
        EmailSignUpPage.Elements.passwordInput().shouldBe(Condition.visible);
        EmailSignUpPage.Elements.confirmPasswordInput().shouldBe(Condition.visible);
        EmailSignUpPage.Elements.nextButton().shouldBe(Condition.visible);
        EmailSignUpPage.Elements.kakaoSignUpButton().shouldBe(Condition.visible);
        EmailSignUpPage.Elements.moreOptionButton().shouldBe(Condition.visible);
    }
}
