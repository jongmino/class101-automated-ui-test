package net.class101.automateduitest.scenarios.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.RefundSubscriptionPage;
import net.class101.automateduitest.pages.plus.SubscriptionPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckRefundSubscription implements TestScenario {

    @Override
    public TestScenario proceed() {
        SubscriptionPage.Actions.openPage();
        SubscriptionPage.Elements.cancelSubscriptionButton().shouldBe(Condition.visible);
        SubscriptionPage.Elements.refundButton().shouldBe(Condition.visible).click();
        return this;
    }

    @Override
    public void validate() {
        RefundSubscriptionPage.Elements.refundPageTitle().shouldBe(Condition.visible);
    }
}
