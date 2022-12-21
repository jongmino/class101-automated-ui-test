package net.class101.automateduitest.resources.testcases.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.pages.plus.OrderDetailPage;
import net.class101.automateduitest.resources.pages.plus.OrderPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * @설명: 주문 상세페이지의 필수 정보가 모두 표시 되는지 테스트한다
 * @분류: 커머스 - 주문 및 배송 - 주문상세 - 자세히보기 > 진입한 상태 - 주문 상세 페이지 확인
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 키트 주문 이력이 있는 계정으로 로그인 한다
 */
public class CheckOrderDetail implements TestCase {

    @Override
    public TestCase proceed() {
        MyPage.Actions.openPage();
        MyPage.orderTab().click();
        OrderPage.orderViewDetailButton().shouldBe(Condition.visible).click();
        return this;
    }

    @Override
    public void validate() {
        OrderDetailPage.orderDetailPageTitle().shouldBe(Condition.visible);
        OrderDetailPage.paymentInfoSection().shouldBe(Condition.visible);
        OrderDetailPage.shippingInfoSection().shouldBe(Condition.visible);
        OrderDetailPage.orderedItemInfoSection().shouldBe(Condition.visible);
    }
}
