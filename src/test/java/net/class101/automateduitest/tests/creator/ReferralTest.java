package net.class101.automateduitest.tests.creator;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.resources.common.PropertyLoader;
import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.testcases.core.Logout;
import net.class101.automateduitest.resources.testcases.creator.CheckCreatorReferralTab;
import net.class101.automateduitest.resources.testcases.creator.LoginAsCreatorHasClass;
import net.class101.automateduitest.resources.testcases.creator.LogoutCreatorCenter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class ReferralTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = PropertyLoader.getProperties().timeout;
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorHasClass.class).proceed();
    }

    @AfterAll
    static void afterAll() {
        SF.get(LogoutCreatorCenter.class).proceed();
    }

    @Test
    void testReferralTab() {
        SF.get(CheckCreatorReferralTab.class).proceed().validate();
    }
}
