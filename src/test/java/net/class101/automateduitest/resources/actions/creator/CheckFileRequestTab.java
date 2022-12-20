package net.class101.automateduitest.resources.actions.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorFileRequestPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 크리에이터 센터 - 파일 요청 내역 - 진입 - SNB > 파일 요청 내역 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 로그인한다
 */
public class CheckFileRequestTab implements TestAction {

    @Override
    public TestAction execute() {
        CreatorLeftNavigation.Elements.fileRequestTab().click();
        return this;
    }

    @Override
    public void validate() {
        CreatorFileRequestPage.Elements.fileRequestTitle().shouldBe(Condition.visible);
    }
}
