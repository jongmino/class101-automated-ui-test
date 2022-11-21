package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckProductList implements TestScenario {

    private static CheckProductList instance = null;

    public static CheckProductList getInstance() {
        if (instance == null) {
            instance = new CheckProductList();
        }
        return instance;
    }

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
