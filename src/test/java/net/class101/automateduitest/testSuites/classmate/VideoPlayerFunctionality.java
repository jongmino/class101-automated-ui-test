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
        SF.getInstance(LoginAsSubscriber.class).proceed().validate();
    }

    @Test
    void verifyVideoPlayerFunctionality() {
        SF.getInstance(CheckPlayLecture.class).proceed();
        SF.getInstance(ChangePlaySpeed.class).proceed().validate();
        SF.getInstance(ChangeVideoQuality.class).proceed().validate();
        SF.getInstance(ChangeAutoPlay.class).proceed().validate();
    }
}
