package net.class101.automateduitest.resources.actions.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorStockPage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 크리에이터 센터 - 재고 - 진입 - SNB > 재고 > 전체 재고 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 클래스를 보유한 계정으로 로그인한다
 */
public class CheckStockTab implements TestAction {

    @Override
    public TestAction execute() {
        CreatorLeftNavigation.Elements.stockTab().shouldBe(Condition.enabled).click();
        CreatorLeftNavigation.Elements.stockAllTab().shouldBe(Condition.visible).click();
        return this;
    }

    @Override
    public void validate() {
        CreatorStockPage.Elements.stockTable().shouldBe(Condition.visible);
    }
}
