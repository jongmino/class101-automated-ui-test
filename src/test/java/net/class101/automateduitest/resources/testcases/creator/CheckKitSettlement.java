package net.class101.automateduitest.resources.testcases.creator;

import net.class101.automateduitest.resources.pages.creatorCenter.CreatorKitSettlementPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명: 크리에이터 센터에서 '키트 정산' 메뉴 아래 키트 스토어 클릭시 해당 스토어의 키트 정산 페이지로 정상 이동되는지 테스트한다
 * @분류: 크리에이터 센터 - 키트 정산 - 진입 - SNB > 키트 정산 > 임의 키트 스토어 클릭
 * @테스트_선행조건:
 *  1) 크리에이터 홈으로 진입한다
 *  2) 클래스 보유 계정으로 로그인한다
 */
public class CheckKitSettlement implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorLeftNavigation.kitSettlementTab().click();
        CreatorLeftNavigation.kitSettlementSubTab().click();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(CreatorKitSettlementPage.settlementTable().exists());
    }
}
