package net.class101.automateduitest.tests.commerce;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.commerce.CheckFreeTrial;
import net.class101.automateduitest.resources.testcases.core.LoginAsNewUser;
import net.class101.automateduitest.resources.testcases.core.Logout;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FreeTrialTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout=40000;
        Home.Actions.openPage();
        SF.get(LoginAsNewUser.class).proceed();
    }

    @AfterAll
    static void afterAll() {
        SF.get(Logout.class).proceed();
    }

    @Test
    void testFreeTrial() {
        SF.get(CheckFreeTrial.class).proceed().validate();
    }
}
