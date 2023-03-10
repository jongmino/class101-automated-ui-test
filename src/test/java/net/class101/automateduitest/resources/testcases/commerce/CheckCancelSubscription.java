package net.class101.automateduitest.resources.testcases.commerce;

import net.class101.automateduitest.resources.pages.plus.CancelSubscriptionPage;
import net.class101.automateduitest.resources.pages.plus.SubscriptionPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * @설명: 정기결제 중 구독 해지가 정상적으로 되는지 테스트한다
 * @분류: 커머스 - 결제 및 환불 - 해지 - 정기결제 중 해지 - 정기결제 중 구독 해지 예약하기
 * @테스트_선행조건: 1) 홈페이지를 연다
 * 2) 연간 구독 계정으로 로그인 한다
 */
public class CheckCancelSubscription implements TestCase {

    @Override
    public TestCase proceed() {
        SubscriptionPage.Actions.openPage();
        SubscriptionPage.cancelSubscriptionButton().click();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(CancelSubscriptionPage.cancelButton().exists());
    }
}
