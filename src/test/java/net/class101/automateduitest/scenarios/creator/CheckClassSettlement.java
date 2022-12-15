package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorClassSettlementPage;
import net.class101.automateduitest.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckClassSettlement implements TestScenario {

    @Override
    public TestScenario proceed() {
        CreatorLeftNavigation.Elements.classSettlementTab().click();
        CreatorLeftNavigation.Elements.individualClassSettlementTab().shouldBe(Condition.visible).click();

        return this;
    }

    @Override
    public void validate() {
        CreatorClassSettlementPage.Elements.settlementTable().shouldBe(Condition.visible);
    }
}
