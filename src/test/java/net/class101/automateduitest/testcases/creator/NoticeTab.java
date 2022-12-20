package net.class101.automateduitest.testcases.creator;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.actions.creator.CheckNoticeTab;
import net.class101.automateduitest.resources.actions.creator.LoginAsCreatorNew;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NoticeTab {
    @BeforeAll
    static void beforeAll() {
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorNew.class).execute().validate();
    }

    @Test
    void noticeTab() {
        SF.get(CheckNoticeTab.class).execute().validate();
    }
}
