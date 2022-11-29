package net.class101.automateduitest.testSuites.creator;

import com.codeborne.selenide.Configuration;
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
        LoginAsCreatorHasClass.getInstance().proceed().validate();
    }

    @Test
    void commentPage() {
        CheckClassCommentTab.getInstance().proceed().validate();
    }

    @Test
    void commentAnswered() {
        CheckCommentAnswered.getInstance().proceed().validate();
    }

    @Test
    void commentNotAnswered() {
        CheckCommentNotAnswered.getInstance().proceed().validate();
    }
}
