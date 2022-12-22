package net.class101.automateduitest.tests.classmate;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.classmate.CheckCreatorCenterTab;
import net.class101.automateduitest.resources.testcases.classmate.CheckEnquiryTab;
import net.class101.automateduitest.resources.testcases.classmate.CheckFAQTab;
import net.class101.automateduitest.resources.testcases.classmate.CheckOrderTab;
import net.class101.automateduitest.resources.testcases.classmate.CheckReferralTab;
import net.class101.automateduitest.resources.testcases.classmate.CheckSettingTab;
import net.class101.automateduitest.resources.testcases.core.LoginAsNonSubscriber;
import net.class101.automateduitest.resources.testcases.core.Logout;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class MyPageMenu {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
    }

    @AfterAll
    void tearDown() {
        SF.get(Logout.class).proceed();
    }

    @Test
    void verifyMyPageMenu() {
        SF.get(LoginAsNonSubscriber.class).proceed();
        SF.get(CheckOrderTab.class).proceed().validate();
        SF.get(CheckReferralTab.class).proceed().validate();
        SF.get(CheckCreatorCenterTab.class).proceed().validate();
        SF.get(CheckFAQTab.class).proceed().validate();
        SF.get(CheckEnquiryTab.class).proceed().validate();
        SF.get(CheckSettingTab.class).proceed().validate();
    }
}
