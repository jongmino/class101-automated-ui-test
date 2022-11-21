package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.pages.creatorCenter.CreatorLoginPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class LoginAsCreatorNew implements TestScenario {

    private static LoginAsCreatorNew instance = null;

    public static LoginAsCreatorNew getInstance() {
        if(instance == null){
            instance = new LoginAsCreatorNew();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        CreatorLoginPage.Actions.loginAsCreatorNew();
        return this;
    }

    @Override
    public void validate() {
        CreatorHome.Elements.profileImg().shouldBe(Condition.visible).hover();
    }
}
