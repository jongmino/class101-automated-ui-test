package net.class101.automateduitest.testSuites.classmate;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.classmate.CheckSubscriptionStatusFalse;
import net.class101.automateduitest.scenarios.classmate.CheckSubscriptionStatusTrue;
import net.class101.automateduitest.scenarios.core.LoginAsNonSubscriber;
import net.class101.automateduitest.scenarios.core.LoginAsSubscriber;
import net.class101.automateduitest.scenarios.core.Logout;
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
