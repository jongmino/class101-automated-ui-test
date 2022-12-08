package net.class101.automateduitest.scenarios.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.PaymentPage;
import net.class101.automateduitest.pages.plus.SubscribePlanPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckYearlySubscription implements TestScenario {

    @Override
    public TestScenario proceed() {
        SubscribePlanPage.Actions.openPage();
        SubscribePlanPage.Elements.nextButton().shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        PaymentPage.Elements.paymentPrice().shouldBe(Condition.visible);
    }
}
