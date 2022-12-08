package net.class101.automateduitest.testSuites.creator;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.scenarios.creator.CheckClassCommentTab;
import net.class101.automateduitest.scenarios.creator.CheckCommentAnswered;
import net.class101.automateduitest.scenarios.creator.CheckCommentNotAnswered;
import net.class101.automateduitest.scenarios.creator.LoginAsCreatorHasClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ClassComment {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 40000;
        CreatorHome.Actions.openPage();
        SF.getInstance(LoginAsCreatorHasClass.class).proceed().validate();
    }

    @Test
    void commentPage() {
        SF.getInstance(CheckClassCommentTab.class).proceed().validate();
    }

    @Test
    void commentAnswered() {
        SF.getInstance(CheckCommentAnswered.class).proceed().validate();
    }

    @Test
    void commentNotAnswered() {
        SF.getInstance(CheckCommentNotAnswered.class).proceed().validate();
    }
}
