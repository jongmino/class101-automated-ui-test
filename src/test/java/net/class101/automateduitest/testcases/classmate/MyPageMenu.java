package net.class101.automateduitest.testcases.classmate;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.actions.classmate.CheckCreatorCenterTab;
import net.class101.automateduitest.resources.actions.classmate.CheckEnquiryTab;
import net.class101.automateduitest.resources.actions.classmate.CheckFAQTab;
import net.class101.automateduitest.resources.actions.classmate.CheckOrderTab;
import net.class101.automateduitest.resources.actions.classmate.CheckReferralTab;
import net.class101.automateduitest.resources.actions.classmate.CheckSettingTab;
import net.class101.automateduitest.resources.actions.core.LoginAsNonSubscriber;
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
        SF.get(LoginAsNonSubscriber.class).execute().validate();
        SF.get(CheckOrderTab.class).execute().validate();
        SF.get(CheckReferralTab.class).execute().validate();
        SF.get(CheckCreatorCenterTab.class).execute().validate();
        SF.get(CheckFAQTab.class).execute().validate();
        SF.get(CheckEnquiryTab.class).execute().validate();
        SF.get(CheckSettingTab.class).execute().validate();
    }
}
