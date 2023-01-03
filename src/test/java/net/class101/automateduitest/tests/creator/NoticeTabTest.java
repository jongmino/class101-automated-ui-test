package net.class101.automateduitest.tests.creator;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.testcases.core.Logout;
import net.class101.automateduitest.resources.testcases.creator.CheckNoticeTab;
import net.class101.automateduitest.resources.testcases.creator.LoginAsCreatorNew;
import net.class101.automateduitest.resources.testcases.creator.LogoutCreatorCenter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NoticeTabTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 20000;
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorNew.class).proceed();
    }

    @AfterAll
    static void afterAll() {
        SF.get(LogoutCreatorCenter.class).proceed();
    }

    @Test
    void testNoticeTab() {
        SF.get(CheckNoticeTab.class).proceed().validate();
    }
}