package net.class101.automateduitest.resources.actions.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorPlusSettlementPage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 크리에이터 센터 - 클래스 101+ 수익 (클래스 정산) - 진입 - SNB > 클래스 정산 > 클래스 101+ 수익 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 클래스 101+ 정산내역을 보유한 계정으로 로그인한다
 */
public class CheckPlusSettlement implements TestAction {

    @Override
    public TestAction execute() {
        CreatorLeftNavigation.Elements.classSettlementTab().click();
        CreatorLeftNavigation.Elements.plusClassSettlementTab().shouldBe(Condition.visible).click();
        CreatorPlusSettlementPage.Elements.settlementDetailsButton().shouldBe(Condition.visible).click();
        return this;
    }

    @Override
    public void validate() {
        CreatorPlusSettlementPage.Elements.settlementDetailsModalTitle().shouldBe(Condition.visible);
    }
}
