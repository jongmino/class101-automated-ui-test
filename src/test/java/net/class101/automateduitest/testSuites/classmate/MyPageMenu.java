package net.class101.automateduitest.testSuites.classmate;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.classmate.CheckCreatorCenterTab;
import net.class101.automateduitest.scenarios.classmate.CheckEnquiryTab;
import net.class101.automateduitest.scenarios.classmate.CheckFAQTab;
import net.class101.automateduitest.scenarios.classmate.CheckOrderTab;
import net.class101.automateduitest.scenarios.classmate.CheckReferralTab;
import net.class101.automateduitest.scenarios.classmate.CheckSettingTab;
import net.class101.automateduitest.scenarios.core.LoginAsNonSubscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;


@TestInstance(Lifecycle.PER_CLASS)
public class MyPageMenu {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
    }

    @Test
    void verifyMyPageMenu() throws InterruptedException {
        SF.getInstance(LoginAsNonSubscriber.class).proceed().validate();
        SF.getInstance(CheckOrderTab.class).proceed().validate();
        SF.getInstance(CheckReferralTab.class).proceed().validate();
        SF.getInstance(CheckCreatorCenterTab.class).proceed().validate();
        SF.getInstance(CheckFAQTab.class).proceed().validate();
        SF.getInstance(CheckEnquiryTab.class).proceed().validate();
        SF.getInstance(CheckSettingTab.class).proceed().validate();
    }
}
