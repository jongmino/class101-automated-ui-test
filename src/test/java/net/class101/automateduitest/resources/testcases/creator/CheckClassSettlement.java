package net.class101.automateduitest.resources.testcases.creator;

import net.class101.automateduitest.resources.pages.creatorCenter.CreatorClassSettlementPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.Assert.assertTrue;

/**
 * @설명: 크리에이터 센터에서 개별 클래스 정산 메뉴 클릭시 개별 클래스 정산 페이지로 정상 이동 되는지 테스트한다
 * @분류: 크리에이터 센터 - 클래스 정산 - 진입 - SNB > 클래스 정산 > 임의 클래스 스토어 클릭
 * @테스트_선행조건:
 *  1) 크리에이터 홈으로 진입한다
 *  2) 클래스 보유 계정으로 로그인한다.
 */
public class CheckClassSettlement implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorLeftNavigation.classSettlementTab().click();
        CreatorLeftNavigation.individualClassSettlementTab().click();

        return this;
    }

    @Override
    public void validate() {
        assertTrue(CreatorClassSettlementPage.settlementTable().exists());
    }
}
