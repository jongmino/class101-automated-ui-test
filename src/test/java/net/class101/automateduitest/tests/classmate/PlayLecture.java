package net.class101.automateduitest.tests.classmate;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.classmate.CheckPlayLecture;
import net.class101.automateduitest.resources.testcases.core.LoginAsSubscriber;
import net.class101.automateduitest.resources.testcases.core.Logout;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PlayLecture {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.get(LoginAsSubscriber.class).proceed();
    }

    @AfterAll
    void tearDown() {
        SF.get(Logout.class).proceed();
    }

    @Test
    void verifyPlayingVideo() {
        SF.get(CheckPlayLecture.class).proceed().validate();
    }
}
