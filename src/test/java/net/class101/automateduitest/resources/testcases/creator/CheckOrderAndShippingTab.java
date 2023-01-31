package net.class101.automateduitest.resources.testcases.creator;

import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorOrderAndShippingPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명: 크리에이터 센터에서 '주문 및 배송' 아래 임의의 스토어 클릭 시 해당 스토어의 주문 및 배송 페이지로 정상 이동되는지 테스트한다
 * @분류: 크리에이터 센터 - 주문 및 배송 - 진입 - SNB > 주문 및 배송 > 등록된 스토어 클릭
 * @테스트_선행조건:
 *  1) 크리에이터 홈으로 진입한다
 *  2) 로그인 한다
 */
public class CheckOrderAndShippingTab implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorLeftNavigation.orderAndShippingTab().click();
        CreatorLeftNavigation.orderAndShippingShopTab().click();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(CreatorOrderAndShippingPage.orderAndShippingTitle().exists());
    }
}