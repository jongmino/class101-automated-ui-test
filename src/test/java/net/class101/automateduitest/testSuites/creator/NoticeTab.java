package net.class101.automateduitest.testSuites.creator;

import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.scenarios.creator.CheckNoticeTab;
import net.class101.automateduitest.scenarios.creator.LoginAsCreatorNew;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NoticeTab {
    @BeforeAll
    static void beforeAll() {
        CreatorHome.Actions.openPage();
        LoginAsCreatorNew.getInstance().proceed().validate();
    }

    @Test
    void noticeTab() {
        CheckNoticeTab.getInstance().proceed().validate();
    }
}
