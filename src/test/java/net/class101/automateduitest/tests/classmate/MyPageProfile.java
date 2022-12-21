package net.class101.automateduitest.tests.classmate;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.classmate.CheckCashTab;
import net.class101.automateduitest.resources.testcases.core.LoginAsNonSubscriber;
import net.class101.automateduitest.resources.testcases.core.Logout;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class MyPageProfile {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
    }

    @AfterAll
    void tearDown() {
        SF.get(Logout.class).proceed();
    }

    @Test
    void verifyCashTab() {
        SF.get(LoginAsNonSubscriber.class).proceed().validate();
        SF.get(CheckCashTab.class).proceed().validate();
    }
}
