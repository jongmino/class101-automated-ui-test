package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckProductList implements TestScenario {

    @Override
    public TestScenario proceed() {
        CreatorProductPage.Actions.openPage();
        return this;
    }

    @Override
    public void validate() {
        CreatorProductPage.Elements.productList().shouldBe(Condition.visible);
    }
}
