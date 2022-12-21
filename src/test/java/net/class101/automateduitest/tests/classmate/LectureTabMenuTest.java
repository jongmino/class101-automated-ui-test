package net.class101.automateduitest.tests.classmate;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.classmate.CheckLectureTabMenu;
import net.class101.automateduitest.resources.testcases.core.LoginAsSubscriber;
import net.class101.automateduitest.resources.testcases.core.Logout;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LectureTabMenuTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 20000;
        Home.Actions.openPage();
        SF.get(LoginAsSubscriber.class).proceed();
    }

    @AfterAll
    void tearDown() {
        SF.get(Logout.class).proceed();
    }

    @Test
    void testLectureTabMenu() {
        SF.get(CheckLectureTabMenu.class).proceed().validate();
    }
}
