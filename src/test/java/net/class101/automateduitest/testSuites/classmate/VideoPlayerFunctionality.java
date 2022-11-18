package net.class101.automateduitest.testSuites.classmate;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.classmate.ChangeAutoPlay;
import net.class101.automateduitest.scenarios.classmate.ChangePlaySpeed;
import net.class101.automateduitest.scenarios.classmate.ChangeVideoQuality;
import net.class101.automateduitest.scenarios.classmate.PlayLecture;
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
        LoginAsSubscriber.getInstance().proceed().validate();
    }

    @Test
    void verifyVideoPlayerFunctionality() throws InterruptedException {
        PlayLecture.getInstance().proceed();
        ChangePlaySpeed.getInstance().proceed().validate();
        ChangeVideoQuality.getInstance().proceed().validate();
        ChangeAutoPlay.getInstance().proceed().validate();
    }
}

