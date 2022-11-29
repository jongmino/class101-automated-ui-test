package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorOrderAndShippingPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckPaymentCompleted implements TestScenario {

    private static CheckPaymentCompleted instance = null;

    public static CheckPaymentCompleted getInstance() {
        if (instance == null) {
            instance = new CheckPaymentCompleted();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        CreatorOrderAndShippingPage.Elements.paymentCompletedTab().shouldBe(Condition.visible).click();
        return this;
    }

    @Override
    public void validate() {
        CreatorOrderAndShippingPage.Elements.paymentCompletedTitle().shouldBe(Condition.visible);
    }
}