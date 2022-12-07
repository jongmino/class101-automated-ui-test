package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.pages.creatorCenter.CreatorNoticePage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckNoticeTab implements TestScenario {

    private static CheckNoticeTab instance = null;

    public static CheckNoticeTab getInstance() {
        if (instance == null) {
            instance = new CheckNoticeTab();
        }
        return instance;
    }

    private CheckNoticeTab() {
    }

    @Override
    public TestScenario proceed() {
        CreatorLeftNavigation.Elements.noticeTab().click();
        return this;
    }

    @Override
    public void validate() {
        CreatorNoticePage.Elements.noticeSection().shouldBe(Condition.visible);
    }
}
