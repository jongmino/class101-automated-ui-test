package net.class101.automateduitest.testSuites.classmate;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.classmate.CheckPlayLecture;
import net.class101.automateduitest.scenarios.core.LoginAsSubscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PlayLecture {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.getInstance(LoginAsSubscriber.class).proceed().validate();
    }

    @Test
    void verifyPlayingVideo() {
        SF.getInstance(CheckPlayLecture.class).proceed().validate();
    }
}
