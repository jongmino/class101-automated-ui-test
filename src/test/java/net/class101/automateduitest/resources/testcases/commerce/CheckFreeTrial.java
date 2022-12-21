package net.class101.automateduitest.resources.testcases.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.SelectPlanPage;
import net.class101.automateduitest.resources.pages.plus.SubscriptionPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static net.class101.automateduitest.resources.common.Utils.waitFor;

/**
 * @설명: 신규계정으로 로그인 시 무료체험이 정상적으로 되는지 테스트한다
 * @분류: 커머스 - 결제 및 환불 - 무료체험 - 신규 계정 - 무료체험 시 결제 확인
 * @테스트_선행조건: 1) 홈페이지를 연다
 * 2) 신규 계정으로 로그인 한다
 */
public class CheckFreeTrial implements TestCase {

    @Override
    public TestCase proceed() {
        SubscriptionPage.Actions.openPage();
        waitFor(SubscriptionPage.subscribeButton()).shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        waitFor(SelectPlanPage.spanContainsFreeTrial()).shouldBe(Condition.visible);
    }
}
