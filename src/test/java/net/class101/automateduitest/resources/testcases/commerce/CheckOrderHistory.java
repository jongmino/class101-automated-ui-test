package net.class101.automateduitest.resources.testcases.commerce;

import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.pages.plus.OrderPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.Assert.assertTrue;

/**
 * @설명: 주문 및 배송 페이지에서 주문 정보가 제대로 표시되는지 테스트한다
 * @분류: 커머스 - 주문 및 배송 - 진입 - 마이페이지에서 주문 및 배송 진입한 상태 - 주문 및 배송 페이지 확인
 * @테스트_선행조건:
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
        assertTrue(OrderPage.orderHistoryTitle().exists());
        assertTrue(OrderPage.shippingInfoButton().exists());
        assertTrue(OrderPage.orderViewDetailButton().exists());
    }
}
