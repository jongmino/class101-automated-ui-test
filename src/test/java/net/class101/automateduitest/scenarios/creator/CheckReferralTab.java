package net.class101.automateduitest.scenarios.creator;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.common.Utils;
import net.class101.automateduitest.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.pages.creatorCenter.CreatorReferralPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckReferralTab implements TestScenario {

    private static CheckReferralTab instance = null;

    public static CheckReferralTab getInstance() {
        if(instance == null){
            instance = new CheckReferralTab();
        }
        return instance;
    }

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
