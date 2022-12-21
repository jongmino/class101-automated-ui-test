package net.class101.automateduitest.resources.testcases.creator;

import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorPlusSettlementPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.Assert.assertTrue;

/**
 * @설명: 크리에이터 센터에서 '클래스 정산'메뉴 아래 '클래스 101+ 수익' 메뉴 클릭시 해당 페이지로 정상 이동되는지 테스트한다
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
        CreatorLeftNavigation.plusClassSettlementTab().click();
        CreatorPlusSettlementPage.settlementDetailsButton().click();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(CreatorPlusSettlementPage.settlementDetailsModalTitle().exists());
    }
}
