package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorKitSettlementPage;
import net.class101.automateduitest.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckKitSettlement implements TestScenario {

    private static CheckKitSettlement instance = null;

    public static CheckKitSettlement getInstance() {
        if (instance == null) {
            instance = new CheckKitSettlement();
        }
        return instance;
    }

    private CheckKitSettlement() {
    }

    @Override
    public TestScenario proceed() {
        CreatorLeftNavigation.Elements.kitSettlementTab().click();
        CreatorLeftNavigation.Elements.kitSettlementSubTab().shouldBe(Condition.visible).click();
        return this;
    }

    @Override
    public void validate() {
        CreatorKitSettlementPage.Elements.settlementTable().shouldBe(Condition.visible);
    }
}
