package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.pages.creatorCenter.CreatorPlusSettlementPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckPlusSettlement implements TestScenario {

    private static CheckPlusSettlement instance = null;

    public static CheckPlusSettlement getInstance() {
        if(instance == null){
            instance = new CheckPlusSettlement();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        CreatorLeftNavigation.Elements.classSettlementTab().click();
        CreatorLeftNavigation.Elements.plusClassSettlementTab().shouldBe(Condition.visible).click();
        CreatorPlusSettlementPage.Elements.settlementDetailsButton().shouldBe(Condition.visible).click();
        return this;
    }

    @Override
    public void validate() {
        CreatorPlusSettlementPage.Elements.settlementDetailsModalTitle().shouldBe(Condition.visible);
    }
}
