package net.class101.automateduitest.tests.classmate;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.classmate.CheckCreatorCenterTab;
import net.class101.automateduitest.resources.testcases.classmate.CheckEnquiryTab;
import net.class101.automateduitest.resources.testcases.classmate.CheckFAQTab;
import net.class101.automateduitest.resources.testcases.classmate.CheckOrderTab;
import net.class101.automateduitest.resources.testcases.classmate.CheckReferralTab;
import net.class101.automateduitest.resources.testcases.classmate.CheckSettingTab;
import net.class101.automateduitest.resources.testcases.core.LoginAsNonSubscriber;
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
        SF.get(LoginAsNonSubscriber.class).proceed().validate();
        SF.get(CheckOrderTab.class).proceed().validate();
        SF.get(CheckReferralTab.class).proceed().validate();
        SF.get(CheckCreatorCenterTab.class).proceed().validate();
        SF.get(CheckFAQTab.class).proceed().validate();
        SF.get(CheckEnquiryTab.class).proceed().validate();
        SF.get(CheckSettingTab.class).proceed().validate();
    }
}
