package net.class101.automateduitest.testSuites.classmate;

import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.classmate.PlayLecture;
import net.class101.automateduitest.scenarios.core.LoginAsSubscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PlayLectureTest {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
    }

    @Test
    void verifyPlayingVideo() {
        LoginAsSubscriber.getInstance().proceed().validate();
        PlayLecture.getInstance().proceed().validate();
    }
}
