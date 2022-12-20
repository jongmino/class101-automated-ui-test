package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorOrderAndShippingPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 크리에이터 센터 - 주문 및 배송 - 진입 - SNB > 주문 및 배송 > 등록된 스토어 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 로그인 한다
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
        CreatorOrderAndShippingPage.orderAndShippingTitle().shouldBe(Condition.visible);
    }
}