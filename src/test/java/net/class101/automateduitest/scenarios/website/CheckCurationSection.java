package net.class101.automateduitest.scenarios.website;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.pages.plus.ProductDetailPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckCurationSection implements TestScenario {
    @Override
    public TestScenario proceed() {
        Home.Elements.firstCurationItem().click();
        return this;
    }

    @Override
    public void validate() {
        ProductDetailPage.Elements.classInfoTab().shouldBe(Condition.visible);
        ProductDetailPage.Elements.creatorInfoTab().shouldBe(Condition.visible);
    }
}
