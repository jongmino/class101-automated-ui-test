package net.class101.automateduitest.resources.actions.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorKitSettlementPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 크리에이터 센터 - 키트 정산 - 진입 - SNB > 키트 정산 > 임의 키트 스토어 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 클래스 보유 계정으로 로그인한다
 */
public class CheckKitSettlement implements TestAction {

    @Override
    public TestAction execute() {
        CreatorLeftNavigation.Elements.kitSettlementTab().click();
        CreatorLeftNavigation.Elements.kitSettlementSubTab().shouldBe(Condition.visible).click();
        return this;
    }

    @Override
    public void validate() {
        CreatorKitSettlementPage.Elements.settlementTable().shouldBe(Condition.visible);
    }
}