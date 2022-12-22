package net.class101.automateduitest.tests.creator;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.testcases.creator.CheckCreatorGuideTab;
import net.class101.automateduitest.resources.testcases.creator.LoginAsCreatorHasClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GuideCenter {

    @BeforeAll
    static void beforeAll() {
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorHasClass.class).proceed();
    }

    @Test
    void creatorGuideCenter() {
        SF.get(CheckCreatorGuideTab.class).proceed().validate();
    }
}
