package net.class101.automateduitest.testSuites.classmate;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.classmate.CheckLectureTabMenu;
import net.class101.automateduitest.scenarios.classmate.CheckPlayLecture;
import net.class101.automateduitest.scenarios.core.LoginAsSubscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LectureTabMenu {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 20000;
        Home.Actions.openPage();
        LoginAsSubscriber.getInstance().proceed().validate();
    }

    @Test
    void lectureTabMenu() {
        CheckLectureTabMenu.getInstance().proceed().validate();
    }
}
