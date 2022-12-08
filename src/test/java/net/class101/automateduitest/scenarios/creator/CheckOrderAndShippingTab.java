package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.pages.creatorCenter.CreatorOrderAndShippingPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckOrderAndShippingTab implements TestScenario {

    @Override
    public TestScenario proceed() {
        CreatorLeftNavigation.Elements.orderAndShippingTab().click();
        CreatorLeftNavigation.Elements.orderAndShippingShopTab().click();
        return this;
    }

    @Override
    public void validate() {
        CreatorOrderAndShippingPage.Elements.orderAndShippingTitle().shouldBe(Condition.visible);
    }
}