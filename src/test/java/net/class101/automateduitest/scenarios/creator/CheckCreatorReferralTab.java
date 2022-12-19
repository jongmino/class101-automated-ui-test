package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.pages.creatorCenter.CreatorReferralPage;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 * 크리에이터 센터 - 클래스101+ 초대 - 진입 - SNB > 클래스101+ 초대 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 약관에 동의한 계정으로 로그인한다
 */
public class CheckCreatorReferralTab implements TestScenario {

    @Override
    public TestScenario proceed() {
        CreatorLeftNavigation.Elements.referralTab().click();
        return this;
    }

    @Override
    public void validate() {
        CreatorReferralPage.Elements.referralLinkCopyButton().shouldBe(Condition.visible);
    }
}
