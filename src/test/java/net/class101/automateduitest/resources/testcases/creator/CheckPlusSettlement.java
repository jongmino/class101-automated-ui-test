package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorPlusSettlementPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 크리에이터 센터 - 클래스 101+ 수익 (클래스 정산) - 진입 - SNB > 클래스 정산 > 클래스 101+ 수익 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 클래스 101+ 정산내역을 보유한 계정으로 로그인한다
 */
public class CheckPlusSettlement implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorLeftNavigation.classSettlementTab().click();
        CreatorLeftNavigation.plusClassSettlementTab().shouldBe(Condition.visible).click();
        CreatorPlusSettlementPage.settlementDetailsButton().shouldBe(Condition.visible).click();
        return this;
    }

    @Override
    public void validate() {
        CreatorPlusSettlementPage.settlementDetailsModalTitle().shouldBe(Condition.visible);
    }
}
