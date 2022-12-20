package net.class101.automateduitest.resources.testcases.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.SelectPlanPage;
import net.class101.automateduitest.resources.pages.plus.SubscriptionPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 커머스 - 결제 및 환불 - 무료체험 - 신규 계정 - 무료체험 시 결제 확인
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 신규 계정으로 로그인 한다
 */
public class CheckFreeTrial implements TestCase {

    @Override
    public TestCase proceed() {
        SubscriptionPage.Actions.openPage();
        SubscriptionPage.Elements.subscribeButton().shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        SelectPlanPage.Elements.spanContainsFreeTrial().shouldBe(Condition.visible);
    }
}
