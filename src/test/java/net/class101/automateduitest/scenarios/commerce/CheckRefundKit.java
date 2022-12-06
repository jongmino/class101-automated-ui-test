package net.class101.automateduitest.scenarios.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.pages.plus.OrderDetailPage;
import net.class101.automateduitest.pages.plus.OrderPage;
import net.class101.automateduitest.pages.plus.RefundPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckRefundKit implements TestScenario {

    private static CheckRefundKit instance;

    public static CheckRefundKit getInstance() {
        if(instance == null){
            instance = new CheckRefundKit();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        MyPage.Actions.openPage();
        MyPage.Elements.orderTab().click();
        OrderPage.Elements.refundableOrderDetailButton().shouldBe(Condition.enabled).click();
        OrderDetailPage.Elements.refundButton().shouldBe(Condition.enabled).click();
        return this;
    }

    @Override
    public void validate() {
        RefundPage.Elements.refundPageTitle().shouldBe(Condition.visible);
    }
}
