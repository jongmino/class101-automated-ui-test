package net.class101.automateduitest.resources.testcases.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.pages.plus.OrderDetailPage;
import net.class101.automateduitest.resources.pages.plus.OrderPage;
import net.class101.automateduitest.resources.pages.plus.KitRefundPage;
import net.class101.automateduitest.resources.testcases.TestCase;


/**
 * @설명: 주문 상세 페이지에서 환불하기 버튼을 클릭했을 때 정상적으로 환불하기 페이지로 이동되는지 테스트한다
 * @분류: 커머스 - 주문 및 배송 - 환불 - 주문상세페이지에서 상세보기 진입한 상태 - [환불하기] 버튼 클릭
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 키트 주문 이력이 있는 계정으로 로그인 한다
 */
public class CheckRefundKit implements TestCase {

    @Override
    public TestCase proceed() {
        MyPage.Actions.openPage();
        MyPage.orderTab().click();
        OrderPage.refundableOrderDetailButton().shouldBe(Condition.enabled).click();
        OrderDetailPage.refundButton().shouldBe(Condition.enabled).click();
        return this;
    }

    @Override
    public void validate() {
        KitRefundPage.kitRefundPageTitle().shouldBe(Condition.visible);
    }
}
