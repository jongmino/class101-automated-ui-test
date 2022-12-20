package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorNoticePage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 크리에이터 센터 - 공지사항 - 진입 - SNB > 공지사항 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈을 연다
 * 2) 로그인 한다
 */
public class CheckNoticeTab implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorLeftNavigation.Elements.noticeTab().click();
        return this;
    }

    @Override
    public void validate() {
        CreatorNoticePage.Elements.noticeSection().shouldBe(Condition.visible);
    }
}
