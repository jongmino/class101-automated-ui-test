package net.class101.automateduitest.resources.actions.classmate;

import static net.class101.automateduitest.common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.pages.plus.OrderPage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 마이페이지 - 메뉴영역 - 각 메뉴 페이지 이동 확인 - 각 메뉴 별 페이지 랜딩 확인 - 주문 및 배송 메뉴
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 로그인 한다
 */
public class CheckOrderTab implements TestAction {

    @Override
    public TestAction execute() {
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