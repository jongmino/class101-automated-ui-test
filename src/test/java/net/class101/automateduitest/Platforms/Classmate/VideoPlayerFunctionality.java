package net.class101.automateduitest.Platforms.Classmate;

import static net.class101.automateduitest.Common.Behaviors.checkVideoPlayerFunctionality;
import static net.class101.automateduitest.Common.Behaviors.loginWithEmail;
import static net.class101.automateduitest.Common.Behaviors.openUrl;

import net.class101.automateduitest.Constants;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class VideoPlayerFunctionality {

    @BeforeAll
    static void beforeAll() {
        openUrl(Constants.STAGING_PLUS_HOME_URL);
    }

    @Test
    void verifyVideoPlayerFunctionality() throws InterruptedException {
        loginWithEmail(Constants.MY_CLASS_USER_ID, Constants.MY_CLASS_PASSWORD);
        checkVideoPlayerFunctionality();
    }
}

