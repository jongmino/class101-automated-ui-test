package net.class101.automateduitest.resources.actions.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorOrderAndShippingPage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 크리에이터 센터 - 주문 및 배송 - 배송/반품 관리 탭 - 결제완료 탭 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 로그인 한다
 */
public class CheckPaymentCompleted implements TestAction {

    @Override
    public TestAction execute() {
        CreatorOrderAndShippingPage.Elements.paymentCompletedTab().shouldBe(Condition.visible).click();
        return this;
    }

    @Override
    public void validate() {
        CreatorOrderAndShippingPage.Elements.paymentCompletedTitle().shouldBe(Condition.visible);
    }
}