package net.class101.automateduitest.scenarios.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.pages.plus.LoginPage;
import net.class101.automateduitest.pages.plus.SignUpPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckSignUpPage implements TestScenario {

    private static CheckSignUpPage instance;

    public static CheckSignUpPage getInstance(){
        if(instance == null){
            instance = new CheckSignUpPage();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        Home.Elements.loginButton().shouldNotBe(Condition.disabled).click();
        LoginPage.Elements.signUpButton().shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        SignUpPage.Elements.appleButton().shouldBe(Condition.visible);
        SignUpPage.Elements.facebookButton().shouldBe(Condition.visible);
        SignUpPage.Elements.googleButton().shouldBe(Condition.visible);
        SignUpPage.Elements.kakaoButton().shouldBe(Condition.visible);
        SignUpPage.Elements.naverButton().shouldBe(Condition.visible);
        SignUpPage.Elements.emailButton().shouldBe(Condition.visible);
    }
}
