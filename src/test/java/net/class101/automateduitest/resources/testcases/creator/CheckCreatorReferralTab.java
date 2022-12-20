package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorReferralPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 크리에이터 센터 - 클래스101+ 초대 - 진입 - SNB > 클래스101+ 초대 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 약관에 동의한 계정으로 로그인한다
 */
public class CheckCreatorReferralTab implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorLeftNavigation.Elements.referralTab().click();
        return this;
    }

    @Override
    public void validate() {
        CreatorReferralPage.Elements.referralLinkCopyButton().shouldBe(Condition.visible);
    }
}
