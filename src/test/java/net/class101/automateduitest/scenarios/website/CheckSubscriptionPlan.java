package net.class101.automateduitest.scenarios.website;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.ProductDetailPage;
import net.class101.automateduitest.pages.plus.SelectPlanPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckSubscriptionPlan implements TestScenario {

    @Override
    public TestScenario proceed() {

        ProductDetailPage.Elements.startSubscriptionButton().shouldBe(Condition.visible).shouldBe(Condition.enabled).click();
        return this;
    }

    @Override
    public void validate() {
        //플랜 선택 페이지 이동 확인
        SelectPlanPage.Elements.subscribePlanTitle().shouldBe(Condition.visible);
    }
}
