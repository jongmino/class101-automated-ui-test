package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.pages.creatorCenter.CreatorLoginPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class LoginAsCreatorHasClass implements TestScenario {

    private static LoginAsCreatorHasClass instance = null;

    public static LoginAsCreatorHasClass getInstance() {
        if(instance == null){
            instance = new LoginAsCreatorHasClass();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        CreatorLoginPage.Actions.loginAsCreatorHasClass();
        return this;
    }

    @Override
    public void validate() {
        CreatorHome.Elements.profileImg().shouldBe(Condition.visible).hover();
    }
}
