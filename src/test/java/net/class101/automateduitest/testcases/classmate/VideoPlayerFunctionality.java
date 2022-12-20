package net.class101.automateduitest.testcases.classmate;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.actions.classmate.ChangeAutoPlay;
import net.class101.automateduitest.resources.actions.classmate.ChangePlaySpeed;
import net.class101.automateduitest.resources.actions.classmate.ChangeVideoQuality;
import net.class101.automateduitest.resources.actions.classmate.CheckPlayLecture;
import net.class101.automateduitest.resources.actions.core.LoginAsSubscriber;
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
        SF.get(LoginAsSubscriber.class).execute().validate();
    }

    @Test
    void verifyVideoPlayerFunctionality() {
        SF.get(CheckPlayLecture.class).execute().validate();
        SF.get(ChangePlaySpeed.class).execute().validate();
        SF.get(ChangeVideoQuality.class).execute().validate();
        SF.get(ChangeAutoPlay.class).execute().validate();
    }
}
