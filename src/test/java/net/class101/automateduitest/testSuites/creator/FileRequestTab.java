package net.class101.automateduitest.testSuites.creator;

import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.scenarios.creator.CheckFileRequestTab;
import net.class101.automateduitest.scenarios.creator.LoginAsCreatorHasClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FileRequestTab {

    @BeforeAll
    static void beforeAll() {
        CreatorHome.Actions.openPage();
        LoginAsCreatorHasClass.getInstance().proceed().validate();
    }

    @Test
    void fileRequestTab() {
        CheckFileRequestTab.getInstance().proceed().validate();
    }
}