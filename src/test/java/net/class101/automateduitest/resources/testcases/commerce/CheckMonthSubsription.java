package net.class101.automateduitest.resources.testcases.commerce;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.PaymentPage;
import net.class101.automateduitest.resources.pages.plus.SelectPlanPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명: 비 구독 계정으로 로그인하여 월 구독 결제를 시도한다.
 * @분류: 구독 홈 - 월 구독 결제 시도
 * @테스트_선행조건:
 *  1) 구독 홈으로 진입한다.
 *  2) 비 구독 계정으로 로그인하여 구독 배너를 통해 결제 플랜으로 진입하여 월 구독 결제를 시도한다.
 */

public class CheckMonthSubsription implements TestCase {

    @Override
    public TestCase proceed() {
        Home.homeSubscriptionButton().shouldBe(Condition.visible).click();
        SelectPlanPage.paymentMonth().shouldBe(Condition.visible).click();
        $(SelectPlanPage.nextButton().scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}"));
        SelectPlanPage.nextButton().shouldBe(Condition.visible).click();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(PaymentPage.subscriptionStart().exists());
    }
}
