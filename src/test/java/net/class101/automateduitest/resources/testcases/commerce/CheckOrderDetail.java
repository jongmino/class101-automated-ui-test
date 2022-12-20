package net.class101.automateduitest.resources.testcases.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.pages.plus.OrderDetailPage;
import net.class101.automateduitest.resources.pages.plus.OrderPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 커머스 - 주문 및 배송 - 주문상세 - 자세히보기 > 진입한 상태 - 주문 상세 페이지 확인
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 키트 주문 이력이 있는 계정으로 로그인 한다
 */
public class CheckOrderDetail implements TestCase {

    @Override
    public TestCase proceed() {
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
