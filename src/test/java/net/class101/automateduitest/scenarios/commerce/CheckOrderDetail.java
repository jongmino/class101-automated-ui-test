package net.class101.automateduitest.scenarios.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.pages.plus.OrderDetailPage;
import net.class101.automateduitest.pages.plus.OrderPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckOrderDetail implements TestScenario {

    private static CheckOrderDetail instance;

    public static CheckOrderDetail getInstance() {
        if(instance == null){
            instance = new CheckOrderDetail();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        MyPage.Actions.openPage();
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
