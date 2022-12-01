package net.class101.automateduitest.scenarios.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckOrderHistory implements TestScenario {

    private static CheckOrderHistory instance;

    public static CheckOrderHistory getInstance() {
        if(instance == null){
            instance = new CheckOrderHistory();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        MyPage.Actions.openPage();
        return this;
    }

    @Override
    public void validate() {
        MyPage.Elements.orderHistoryTitle().shouldBe(Condition.visible);
        MyPage.Elements.shippingInfoButton().shouldBe(Condition.visible);
    }
}
