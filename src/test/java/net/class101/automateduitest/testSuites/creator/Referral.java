package net.class101.automateduitest.testSuites.creator;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.scenarios.creator.CheckCreatorReferralTab;
import net.class101.automateduitest.scenarios.creator.LoginAsCreatorHasClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Referral {

    @BeforeAll
    static void beforeAll() {
        CreatorHome.Actions.openPage();
        SF.getInstance(LoginAsCreatorHasClass.class).proceed().validate();
    }

    @Test
    void referralTab() {
        SF.getInstance(CheckCreatorReferralTab.class).proceed().validate();
    }
}
