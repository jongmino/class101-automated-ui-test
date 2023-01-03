package net.class101.automateduitest.tests.classmate;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.classmate.ChangeAutoPlay;
import net.class101.automateduitest.resources.testcases.classmate.ChangePlaySpeed;
import net.class101.automateduitest.resources.testcases.classmate.ChangeVideoQuality;
import net.class101.automateduitest.resources.testcases.core.LoginAsSubscriber;
import net.class101.automateduitest.resources.testcases.core.Logout;
import org.junit.jupiter.api.*;

public class VideoPlayerFunctionalityTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 20000;
        Home.Actions.openPage();
        SF.get(LoginAsSubscriber.class).proceed();
    }

    @AfterAll
    static void afterAll() {
        SF.get(Logout.class).proceed();
    }

    @Test
    void testVideoPlayerPlaySpeed() {
        SF.get(ChangePlaySpeed.class).proceed().validate();
    }

    @Test
    void testVideoPlayerVideoQuality() {
        SF.get(ChangeVideoQuality.class).proceed().validate();
    }

    @Test
    void testVideoPlayerAutoPlay() {
        SF.get(ChangeAutoPlay.class).proceed().validate();
    }
}
