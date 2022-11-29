package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.pages.creatorCenter.CreatorStockPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckStockTab implements TestScenario {

    private static CheckStockTab instance = null;

    public static CheckStockTab getInstance() {
        if (instance == null) {
            instance = new CheckStockTab();
        }
        return instance;
    }


    @Override
    public TestScenario proceed() {
        CreatorLeftNavigation.Elements.stockTab().click();
        CreatorLeftNavigation.Elements.stockAllTab().shouldBe(Condition.visible).click();
        return this;
    }

    @Override
    public void validate() {
        CreatorStockPage.Elements.stockTable().shouldBe(Condition.visible);
    }
}
