package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.pages.creatorCenter.CreatorStockPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckStockTab implements TestScenario {

    @Override
    public TestScenario proceed() {
        CreatorLeftNavigation.Elements.stockTab().shouldBe(Condition.enabled).click();
        CreatorLeftNavigation.Elements.stockAllTab().shouldBe(Condition.visible).click();
        return this;
    }

    @Override
    public void validate() {
        CreatorStockPage.Elements.stockTable().shouldBe(Condition.visible);
    }
}
