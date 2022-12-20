package net.class101.automateduitest.tests.classmate;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.classmate.CheckSubscriptionStatusFalse;
import net.class101.automateduitest.resources.testcases.classmate.CheckSubscriptionStatusTrue;
import net.class101.automateduitest.resources.testcases.core.LoginAsNonSubscriber;
import net.class101.automateduitest.resources.testcases.core.LoginAsSubscriber;
import net.class101.automateduitest.resources.testcases.core.Logout;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class MyPageSubscription {

    @BeforeEach
    void setUp() {
        Home.Actions.openPage();
    }

    @AfterEach
    void tearDown() {
        SF.get(Logout.class).proceed();
    }

    @Test
    void verifySubscriptionStatusWithNonSubscribed() {
        SF.get(LoginAsNonSubscriber.class).proceed().validate();
        SF.get(CheckSubscriptionStatusFalse.class).proceed().validate();
    }

    @Test
    void verifySubscriptionStatusWithSubscribed() {
        SF.get(LoginAsSubscriber.class).proceed().validate();
        SF.get(CheckSubscriptionStatusTrue.class).proceed().validate();
    }
}
