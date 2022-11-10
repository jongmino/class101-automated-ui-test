package net.class101.automateduitest.Platforms.Classmate;

import net.class101.automateduitest.Behaviors.Classmate;
import net.class101.automateduitest.Behaviors.Core;
import net.class101.automateduitest.Pages.Plus.Home;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class VideoPlayerFunctionality {

    @BeforeAll
    static void beforeAll() {
        Home.openPage();
    }

    @Test
    void verifyVideoPlayerFunctionality() throws InterruptedException {
        Core.loginWithSubscribedUser();
        Classmate.checkVideoPlayerFunctionality();
    }
}

