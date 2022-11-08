package net.class101.automateduitest.Platforms.Classmate;

import static com.codeborne.selenide.Selenide.open;
import static net.class101.automateduitest.Common.Behaviors.checkSubscriptionStatusWithNonSubscribed;
import static net.class101.automateduitest.Common.Behaviors.checkSubscriptionStatusWithSubscribed;
import static net.class101.automateduitest.Common.Behaviors.loginWithEmail;
import static net.class101.automateduitest.Common.Behaviors.logout;
import static net.class101.automateduitest.Common.Behaviors.openUrl;

import net.class101.automateduitest.Constants;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class MyPageSubscription {

    @BeforeAll
    static void beforeAll() {
        openUrl(Constants.STAGING_PLUS_HOME_URL);
    }

    @BeforeEach
    void setUp() {
        open(Constants.STAGING_PLUS_HOME_URL);
    }

    @AfterEach
    void tearDown() {
        logout();
    }

    @Test
    void verifySubscriptionStatusWithNonSubscribed() {
        loginWithEmail(Constants.CLASS101_USER_ID,Constants.CLASS101_PASSWORD);
        checkSubscriptionStatusWithNonSubscribed();
    }

    @Test
    void verifySubscriptionStatusWithSubscribed() {
        loginWithEmail(Constants.MY_CLASS_USER_ID, Constants.MY_CLASS_PASSWORD);
        checkSubscriptionStatusWithSubscribed();
    }
}
