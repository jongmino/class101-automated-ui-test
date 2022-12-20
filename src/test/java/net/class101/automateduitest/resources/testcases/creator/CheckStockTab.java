package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorStockPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 크리에이터 센터 - 재고 - 진입 - SNB > 재고 > 전체 재고 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 클래스를 보유한 계정으로 로그인한다
 */
public class CheckStockTab implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorLeftNavigation.stockTab().shouldBe(Condition.enabled).click();
        CreatorLeftNavigation.stockAllTab().shouldBe(Condition.visible).click();
        return this;
    }

    @Override
    public void validate() {
        CreatorStockPage.stockTable().shouldBe(Condition.visible);
    }
}
