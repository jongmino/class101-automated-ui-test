package net.class101.automateduitest.Platforms.Classmate;

import static com.codeborne.selenide.Selenide.open;
import static net.class101.automateduitest.Common.Behaviors.loginWithEmail;
import static net.class101.automateduitest.Common.Behaviors.openUrl;
import static net.class101.automateduitest.Common.Behaviors.playClass;

import net.class101.automateduitest.Constants;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PlayClassVideo {

    @BeforeAll
    static void beforeAll() {
        openUrl(Constants.STAGING_PLUS_HOME_URL);
    }

    @Test
    void verifyPlayingVideo() {
        loginWithEmail(Constants.MY_CLASS_USER_ID, Constants.MY_CLASS_PASSWORD);
        open(Constants.STAGING_PLUS_HOME_URL);
        playClass();
    }
}
