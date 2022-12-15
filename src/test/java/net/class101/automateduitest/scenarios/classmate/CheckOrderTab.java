package net.class101.automateduitest.scenarios.classmate;

import static net.class101.automateduitest.common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.pages.plus.OrderPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckOrderTab implements TestScenario {

    @Override
    public TestScenario proceed() {
        MyPage.Actions.openPage();
        MyPage.Elements.orderTab().click();
        OrderPage.Elements.shippingInfoButton().shouldBe(Condition.visible);

        return this;
    }

    @Override
    public void validate() {
        assertTrue(urlContains("orders"));
    }
}
