package net.class101.automateduitest.Platforms.Classmate;

import net.class101.automateduitest.Behaviors.Classmate;
import net.class101.automateduitest.Behaviors.Core;
import net.class101.automateduitest.Pages.Plus.Home;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class MyPageSubscription {

    @BeforeEach
    void setUp() {
        Home.openPage();
    }

    @AfterEach
    void tearDown() {
        Core.logout();
    }

    @Test
    void verifySubscriptionStatusWithNonSubscribed() {
        Core.loginWithNonSubscribedUser();
        Classmate.checkSubscriptionStatusWithNonSubscribed();
    }

    @Test
    void verifySubscriptionStatusWithSubscribed() {
        Core.loginWithSubscribedUser();
        Classmate.checkSubscriptionStatusWithSubscribed();
    }
}
