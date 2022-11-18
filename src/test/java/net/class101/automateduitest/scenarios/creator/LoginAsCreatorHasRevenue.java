package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.pages.creatorCenter.CreatorLoginPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class LoginAsCreatorHasRevenue implements TestScenario {

    private static LoginAsCreatorHasRevenue instance = null;

    public static LoginAsCreatorHasRevenue getInstance() {
        if(instance == null){
            instance = new LoginAsCreatorHasRevenue();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        CreatorLoginPage.Actions.loginAsCreatorHasRevenue();
        return this;
    }

    @Override
    public void validate() {
        CreatorHome.Elements.profileImg().shouldBe(Condition.visible).hover();
    }
}
