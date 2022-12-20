package net.class101.automateduitest.testcases.classmate;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.actions.classmate.CheckSubscriptionStatusFalse;
import net.class101.automateduitest.resources.actions.classmate.CheckSubscriptionStatusTrue;
import net.class101.automateduitest.resources.actions.core.LoginAsNonSubscriber;
import net.class101.automateduitest.resources.actions.core.LoginAsSubscriber;
import net.class101.automateduitest.resources.actions.core.Logout;
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
        SF.get(Logout.class).execute();
    }

    @Test
    void verifySubscriptionStatusWithNonSubscribed() {
        SF.get(LoginAsNonSubscriber.class).execute().validate();
        SF.get(CheckSubscriptionStatusFalse.class).execute().validate();
    }

    @Test
    void verifySubscriptionStatusWithSubscribed() {
        SF.get(LoginAsSubscriber.class).execute().validate();
        SF.get(CheckSubscriptionStatusTrue.class).execute().validate();
    }
}
