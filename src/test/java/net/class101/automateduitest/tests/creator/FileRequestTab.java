package net.class101.automateduitest.tests.creator;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.testcases.creator.CheckFileRequestTab;
import net.class101.automateduitest.resources.testcases.creator.LoginAsCreatorHasClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FileRequestTab {

    @BeforeAll
    static void beforeAll() {
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorHasClass.class).proceed().validate();
    }

    @Test
    void fileRequestTab() {
        SF.get(CheckFileRequestTab.class).proceed().validate();
    }
}
