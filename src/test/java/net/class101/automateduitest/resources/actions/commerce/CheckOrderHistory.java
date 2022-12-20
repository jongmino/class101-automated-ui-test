package net.class101.automateduitest.resources.actions.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.pages.plus.OrderPage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 커머스 - 주문 및 배송 - 진입 - 마이페이지에서 주문 및 배송 진입한 상태 - 주문 및 배송 페이지 확인
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 키트 주문 이력이 있는 계정으로 로그인 한다
 */
public class CheckOrderHistory implements TestAction {

    @Override
    public TestAction execute() {
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
