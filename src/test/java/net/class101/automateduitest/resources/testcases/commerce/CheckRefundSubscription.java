package net.class101.automateduitest.resources.testcases.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.RefundSubscriptionPage;
import net.class101.automateduitest.resources.pages.plus.SubscriptionPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 *  커머스 - 결제 및 환불 - 환불 - 연간 구독 중 - 연간 구독 중 환불 확인
 *
 *  Prerequisite:
 *  1) 홈페이지를 연다
 *  2) 연간 구독 계정으로 로그인 한다
 */
public class CheckRefundSubscription implements TestCase {

    @Override
    public TestCase proceed() {
        SubscriptionPage.Actions.openPage();
        SubscriptionPage.cancelSubscriptionButton().shouldBe(Condition.visible).scrollIntoView(true);
        SubscriptionPage.refundButton().shouldBe(Condition.enabled).scrollIntoView(true).click();

        return this;
    }

    @Override
    public void validate() {
        RefundSubscriptionPage.refundPageTitle().shouldBe(Condition.visible);
    }
}
