package net.class101.automateduitest.resources.testcases.creator;

import net.class101.automateduitest.resources.pages.creatorCenter.CreatorOrderAndShippingPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명: 크리에이터 센터 '주문 및 배송' 페이지에서 '결제완료'탭 클릭시 결제 완료 필드가 정상 노출되는지 테스트한다
 * @분류: 크리에이터 센터 - 주문 및 배송 - 배송/반품 관리 탭 - 결제완료 탭 클릭
 * @테스트_선행조건:
 *  1) 크리에이터 홈으로 진입한다
 *  2) 로그인 한다
 */
public class CheckPaymentCompleted implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorOrderAndShippingPage.paymentCompletedTab().click();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(CreatorOrderAndShippingPage.paymentCompletedTitle().exists());
    }
}