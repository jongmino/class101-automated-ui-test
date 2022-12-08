package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.pages.creatorCenter.CreatorReferralPage;
import net.class101.automateduitest.scenarios.TestScenario;

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
