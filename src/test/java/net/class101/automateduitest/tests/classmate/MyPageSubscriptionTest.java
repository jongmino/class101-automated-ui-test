package net.class101.automateduitest.tests.classmate;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.classmate.CheckSubscriptionStatusFalse;
import net.class101.automateduitest.resources.testcases.classmate.CheckSubscriptionStatusTrue;
import net.class101.automateduitest.resources.testcases.core.LoginAsNonSubscriber;
import net.class101.automateduitest.resources.testcases.core.LoginAsSubscriber;
import net.class101.automateduitest.resources.testcases.core.Logout;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;

public class MyPageSubscriptionTest {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
    }

    @AfterEach
    void tearDown() {
        SF.get(Logout.class).proceed();
    }

    @Test
    void testSubscriptionStatusWithNonSubscribed() {
        SF.get(LoginAsNonSubscriber.class).proceed();
        SF.get(CheckSubscriptionStatusFalse.class).proceed().validate();
    }

    @Test
    void testSubscriptionStatusWithSubscribed() {
        SF.get(LoginAsSubscriber.class).proceed();
        SF.get(CheckSubscriptionStatusTrue.class).proceed().validate();
    }
}
