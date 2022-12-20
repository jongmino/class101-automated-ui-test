package net.class101.automateduitest.tests.classmate;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.classmate.CheckPlayLecture;
import net.class101.automateduitest.resources.testcases.core.LoginAsSubscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PlayLecture {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.get(LoginAsSubscriber.class).proceed().validate();
    }

    @Test
    void verifyPlayingVideo() {
        SF.get(CheckPlayLecture.class).proceed().validate();
    }
}
