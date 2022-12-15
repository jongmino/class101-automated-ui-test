package net.class101.automateduitest.scenarios.classmate;

import static net.class101.automateduitest.common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorLoginPage;
import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckCreatorCenterTab implements TestScenario {

    @Override
    public TestScenario proceed() {
        MyPage.Actions.openPage();
        MyPage.Elements.creatorCenterTab().click();

        return this;
    }

    @Override
    public void validate() {
        CreatorLoginPage.Elements.emailInputElement().shouldBe(Condition.visible);
    }
}
