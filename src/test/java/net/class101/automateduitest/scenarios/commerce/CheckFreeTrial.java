package net.class101.automateduitest.scenarios.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.SelectPlanPage;
import net.class101.automateduitest.pages.plus.SubscriptionPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckFreeTrial implements TestScenario {

    @Override
    public TestScenario proceed() {
        SubscriptionPage.Actions.openPage();
        SubscriptionPage.Elements.subscribeButton().shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        SelectPlanPage.Elements.spanContainsFreeTrial().shouldBe(Condition.visible);
    }
}
