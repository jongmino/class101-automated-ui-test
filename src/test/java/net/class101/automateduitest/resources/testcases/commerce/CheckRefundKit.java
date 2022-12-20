package net.class101.automateduitest.resources.testcases.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.pages.plus.OrderDetailPage;
import net.class101.automateduitest.resources.pages.plus.OrderPage;
import net.class101.automateduitest.resources.pages.plus.KitRefundPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 커머스 - 주문 및 배송 - 환불 - 주문상세페이지에서 상세보기 진입한 상태 - [환불하기] 버튼 클릭
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 키트 주문 이력이 있는 계정으로 로그인 한다
 */
public class CheckRefundKit implements TestCase {

    @Override
    public TestCase proceed() {
        MyPage.Actions.openPage();
        MyPage.Elements.orderTab().click();
        OrderPage.Elements.refundableOrderDetailButton().shouldBe(Condition.enabled).click();
        OrderDetailPage.Elements.refundButton().shouldBe(Condition.enabled).click();
        return this;
    }

    @Override
    public void validate() {
        KitRefundPage.Elements.kitRefundPageTitle().shouldBe(Condition.visible);
    }
}
