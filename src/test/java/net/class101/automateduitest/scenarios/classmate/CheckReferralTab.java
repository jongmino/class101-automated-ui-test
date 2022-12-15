package net.class101.automateduitest.scenarios.classmate;

import static net.class101.automateduitest.common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.ClassmateReferralPage;
import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckReferralTab implements TestScenario {

    @Override
    public TestScenario proceed() {
        MyPage.Actions.openPage();
        MyPage.Elements.referralTab().click();
        ClassmateReferralPage.Elements.copyReferralLinkButton().shouldBe(Condition.visible);

        return this;
    }

    @Override
    public void validate() {
        assertTrue(urlContains("classmate-referral"));
    }
}
