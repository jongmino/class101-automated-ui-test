package net.class101.automateduitest.Platforms.Classmate;

import static net.class101.automateduitest.Common.Behaviors.changeServiceRegion;
import static net.class101.automateduitest.Common.Behaviors.loginWithEmail;
import static net.class101.automateduitest.Common.Behaviors.openUrl;

import net.class101.automateduitest.Constants;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class MyPageServiceRegion {

    @BeforeAll
    static void beforeAll() {
        openUrl(Constants.STAGING_PLUS_HOME_URL);
    }

    @Test
    void verifyChangingServiceRegion() throws InterruptedException {
        loginWithEmail(Constants.CLASS101_USER_ID, Constants.CLASS101_PASSWORD);
        changeServiceRegion();
    }
}
