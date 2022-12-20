package net.class101.automateduitest.testcases.classmate;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.actions.classmate.CheckLectureTabMenu;
import net.class101.automateduitest.resources.actions.core.LoginAsSubscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LectureTabMenu {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 20000;
        Home.Actions.openPage();
        SF.get(LoginAsSubscriber.class).execute().validate();
    }

    @Test
    void lectureTabMenu() {
        SF.get(CheckLectureTabMenu.class).execute().validate();
    }
}
