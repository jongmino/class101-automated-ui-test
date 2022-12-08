package net.class101.automateduitest.scenarios.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.pages.plus.OrderPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckOrderHistory implements TestScenario {
    @Override
    public TestScenario proceed() {
        MyPage.Actions.openPage();
        MyPage.Elements.orderTab().click();
        return this;
    }

    @Override
    public void validate() {
        OrderPage.Elements.orderHistoryTitle().shouldBe(Condition.visible);
        OrderPage.Elements.shippingInfoButton().shouldBe(Condition.visible);
        OrderPage.Elements.orderViewDetailButton().shouldBe(Condition.visible);
    }
}
