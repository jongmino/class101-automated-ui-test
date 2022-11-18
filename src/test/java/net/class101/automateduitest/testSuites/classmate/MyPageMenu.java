package net.class101.automateduitest.testSuites.classmate;

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
        LoginAsNonSubscriber.getInstance().proceed().validate();
        CheckOrderTab.getInstance().proceed().validate();
        CheckReferralTab.getInstance().proceed().validate();
        CheckCreatorCenterTab.getInstance().proceed().validate();
        CheckFAQTab.getInstance().proceed().validate();
        CheckEnquiryTab.getInstance().proceed().validate();
        CheckSettingTab.getInstance().proceed().validate();
    }
}
