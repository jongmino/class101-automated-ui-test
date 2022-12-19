package net.class101.automateduitest.testSuites.classmate;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.classmate.ChangeAutoPlay;
import net.class101.automateduitest.scenarios.classmate.ChangePlaySpeed;
import net.class101.automateduitest.scenarios.classmate.ChangeVideoQuality;
import net.class101.automateduitest.scenarios.classmate.CheckPlayLecture;
import net.class101.automateduitest.scenarios.core.LoginAsSubscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class VideoPlayerFunctionality {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 20000;
        Home.Actions.openPage();
        SF.get(LoginAsSubscriber.class).proceed().validate();
    }

    @Test
    void verifyVideoPlayerFunctionality() {
        SF.get(CheckPlayLecture.class).proceed().validate();
        SF.get(ChangePlaySpeed.class).proceed().validate();
        SF.get(ChangeVideoQuality.class).proceed().validate();
        SF.get(ChangeAutoPlay.class).proceed().validate();
    }
}
