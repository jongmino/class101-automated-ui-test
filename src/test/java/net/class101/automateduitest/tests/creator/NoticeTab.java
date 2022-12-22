package net.class101.automateduitest.tests.creator;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.testcases.creator.CheckNoticeTab;
import net.class101.automateduitest.resources.testcases.creator.LoginAsCreatorNew;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NoticeTab {
    @BeforeAll
    static void beforeAll() {
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorNew.class).proceed();
    }

    @Test
    void noticeTab() {
        SF.get(CheckNoticeTab.class).proceed().validate();
    }
}
