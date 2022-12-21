package net.class101.automateduitest.resources.testcases.classmate;

import static net.class101.automateduitest.resources.common.Utils.urlContains;
import static net.class101.automateduitest.resources.common.Utils.waitFor;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.pages.plus.OrderPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * @설명: 마이페이지 주문 및 배송 메뉴를 클릭했을 때 페이지가 정상적으로 이동되는지 테스트한다
 * @분류: 마이페이지 - 메뉴영역 - 각 메뉴 페이지 이동 확인 - 각 메뉴 별 페이지 랜딩 확인 - 주문 및 배송 메뉴
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 로그인 한다
 */
public class CheckOrderTab implements TestCase {

    @Override
    public TestCase proceed() {
        MyPage.Actions.openPage();
        waitFor(MyPage.orderTab()).click();
        waitFor(OrderPage.shippingInfoButton()).shouldBe(Condition.visible);
        return this;
    }

    @Override
    public void validate() {
        assertTrue(urlContains("orders"));
    }
}