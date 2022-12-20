package net.class101.automateduitest.resources.testcases.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.pages.plus.OrderPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 커머스 - 주문 및 배송 - 진입 - 마이페이지에서 주문 및 배송 진입한 상태 - 주문 및 배송 페이지 확인
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 키트 주문 이력이 있는 계정으로 로그인 한다
 */
public class CheckOrderHistory implements TestCase {

    @Override
    public TestCase proceed() {
        MyPage.Actions.openPage();
        MyPage.orderTab().click();
        return this;
    }

    @Override
    public void validate() {
        OrderPage.orderHistoryTitle().shouldBe(Condition.visible);
        OrderPage.shippingInfoButton().shouldBe(Condition.visible);
        OrderPage.orderViewDetailButton().shouldBe(Condition.visible);
    }
}
