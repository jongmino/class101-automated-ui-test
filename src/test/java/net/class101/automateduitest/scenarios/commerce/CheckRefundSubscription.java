package net.class101.automateduitest.scenarios.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.RefundSubscriptionPage;
import net.class101.automateduitest.pages.plus.SubscriptionPage;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 *  커머스 - 결제 및 환불 - 환불 - 연간 구독 중 - 연간 구독 중 환불 확인
 *
 *  Prerequisite:
 *  1) 홈페이지를 연다
 *  2) 연간 구독 계정으로 로그인 한다
 */
public class CheckRefundSubscription implements TestScenario {

    @Override
    public TestScenario proceed() {
        SubscriptionPage.Actions.openPage();
        SubscriptionPage.Elements.cancelSubscriptionButton().shouldBe(Condition.visible).scrollIntoView(true);
        SubscriptionPage.Elements.refundButton().shouldBe(Condition.enabled).scrollIntoView(true).click();

        return this;
    }

    @Override
    public void validate() {
        RefundSubscriptionPage.Elements.refundPageTitle().shouldBe(Condition.visible);
    }
}
