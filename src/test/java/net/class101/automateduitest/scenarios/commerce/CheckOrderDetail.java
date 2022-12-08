package net.class101.automateduitest.scenarios.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.pages.plus.OrderDetailPage;
import net.class101.automateduitest.pages.plus.OrderPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckOrderDetail implements TestScenario {

    @Override
    public TestScenario proceed() {
        MyPage.Actions.openPage();
        MyPage.Elements.orderTab().click();
        OrderPage.Elements.orderViewDetailButton().shouldBe(Condition.visible).click();
        return this;
    }

    @Override
    public void validate() {
        OrderDetailPage.Elements.orderDetailPageTitle().shouldBe(Condition.visible);
        OrderDetailPage.Elements.paymentInfoSection().shouldBe(Condition.visible);
        OrderDetailPage.Elements.shippingInfoSection().shouldBe(Condition.visible);
        OrderDetailPage.Elements.orderedItemInfoSection().shouldBe(Condition.visible);
    }
}
