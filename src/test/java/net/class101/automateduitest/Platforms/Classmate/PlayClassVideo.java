package net.class101.automateduitest.Platforms.Classmate;

import net.class101.automateduitest.Behaviors.Classmate;
import net.class101.automateduitest.Behaviors.Core;
import net.class101.automateduitest.Pages.Plus.Home;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PlayClassVideo {

    @BeforeAll
    static void beforeAll() {
        Home.openPage();
    }

    @Test
    void verifyPlayingVideo() {
        Core.loginWithSubscribedUser();
        Classmate.playClass();
    }
}
