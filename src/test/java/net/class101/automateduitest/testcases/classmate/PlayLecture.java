package net.class101.automateduitest.testcases.classmate;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.actions.classmate.CheckPlayLecture;
import net.class101.automateduitest.resources.actions.core.LoginAsSubscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PlayLecture {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.get(LoginAsSubscriber.class).execute().validate();
    }

    @Test
    void verifyPlayingVideo() {
        SF.get(CheckPlayLecture.class).execute().validate();
    }
}
