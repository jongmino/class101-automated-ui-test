package net.class101.automateduitest.resources.testcases.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.PaymentPage;
import net.class101.automateduitest.resources.pages.plus.SelectPlanPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명: 연간 결제가 정상적으로 되는지 테스트한다
 * @분류: 커머스 - 정기 결제 - 미구독 계정 - 연간 결제 확인
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 미구독 계정으로 로그인 한다
 */
public class CheckYearlySubscription implements TestCase {

    @Override
    public TestCase proceed() {
        SelectPlanPage.Actions.openPage();
        SelectPlanPage.nextButton().shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(PaymentPage.paymentPrice().exists());
    }
}
