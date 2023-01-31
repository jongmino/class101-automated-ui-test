package net.class101.automateduitest.resources.testcases.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.plus.RefundSubscriptionPage;
import net.class101.automateduitest.resources.pages.plus.SubscriptionPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * @설명: 연간 구독 중 환불이 정상적으로 되는지 테스트한다
 * @분류: 커머스 - 결제 및 환불 - 환불 - 연간 구독 중 - 연간 구독 중 환불 확인
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 연간 구독 계정으로 로그인 한다
 */
public class CheckRefundSubscription implements TestCase {

    @Override
    public TestCase proceed() {
        SubscriptionPage.Actions.openPage();
        SubscriptionPage.cancelSubscriptionButton();
        Utils.sleep(1000);
        SubscriptionPage.refundButton().shouldBe(Condition.enabled).scrollIntoView(true).click();

        return this;
    }

    @Override
    public void validate() {
        assertTrue(RefundSubscriptionPage.refundPageTitle().exists());
    }
}
