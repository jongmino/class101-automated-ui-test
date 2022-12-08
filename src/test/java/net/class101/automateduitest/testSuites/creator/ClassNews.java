package net.class101.automateduitest.testSuites.creator;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.scenarios.creator.CheckClassNews;
import net.class101.automateduitest.scenarios.creator.LoginAsCreatorHasClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ClassNews {

    @BeforeAll
    static void beforeAll() {
        CreatorHome.Actions.openPage();
        SF.getInstance(LoginAsCreatorHasClass.class).proceed().validate();
    }

    @Test
    void classNews() {
        SF.getInstance(CheckClassNews.class).proceed().validate();
    }
}
