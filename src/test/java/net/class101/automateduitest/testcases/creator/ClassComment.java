package net.class101.automateduitest.testcases.creator;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.actions.creator.CheckClassCommentTab;
import net.class101.automateduitest.resources.actions.creator.CheckCommentAnswered;
import net.class101.automateduitest.resources.actions.creator.CheckCommentNotAnswered;
import net.class101.automateduitest.resources.actions.creator.LoginAsCreatorHasClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ClassComment {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 40000;
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorHasClass.class).execute().validate();
    }

    @Test
    void commentPage() {
        SF.get(CheckClassCommentTab.class).execute().validate();
    }

    @Test
    void commentAnswered() {
        SF.get(CheckCommentAnswered.class).execute().validate();
    }

    @Test
    void commentNotAnswered() {
        SF.get(CheckCommentNotAnswered.class).execute().validate();
    }
}
