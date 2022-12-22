package net.class101.automateduitest.tests.creator;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.testcases.core.Logout;
import net.class101.automateduitest.resources.testcases.creator.CheckClassCommentTab;
import net.class101.automateduitest.resources.testcases.creator.CheckCommentAnswered;
import net.class101.automateduitest.resources.testcases.creator.CheckCommentNotAnswered;
import net.class101.automateduitest.resources.testcases.creator.LoginAsCreatorHasClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ClassCommentTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 40000;
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorHasClass.class).proceed();
    }

    @AfterAll
    static void afterAll() {
        SF.get(Logout.class).proceed();
    }

    @Test
    void testCommentPage() {
        SF.get(CheckClassCommentTab.class).proceed().validate();
    }

    @Test
    void testCommentAnswered() {
        SF.get(CheckCommentAnswered.class).proceed().validate();
    }

    @Test
    void testCommentNotAnswered() {
        SF.get(CheckCommentNotAnswered.class).proceed().validate();
    }
}
