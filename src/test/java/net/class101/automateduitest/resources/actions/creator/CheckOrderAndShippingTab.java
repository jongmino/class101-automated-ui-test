package net.class101.automateduitest.resources.actions.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorOrderAndShippingPage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 크리에이터 센터 - 주문 및 배송 - 진입 - SNB > 주문 및 배송 > 등록된 스토어 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 로그인 한다
 */
public class CheckOrderAndShippingTab implements TestAction {

    @Override
    public TestAction execute() {
        CreatorLeftNavigation.Elements.orderAndShippingTab().click();
        CreatorLeftNavigation.Elements.orderAndShippingShopTab().click();
        return this;
    }

    @Override
    public void validate() {
        CreatorOrderAndShippingPage.Elements.orderAndShippingTitle().shouldBe(Condition.visible);
    }
}