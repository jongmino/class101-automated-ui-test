package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorFileRequestPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 크리에이터 센터 - 파일 요청 내역 - 진입 - SNB > 파일 요청 내역 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 로그인한다
 */
public class CheckFileRequestTab implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorLeftNavigation.fileRequestTab().click();
        return this;
    }

    @Override
    public void validate() {
        CreatorFileRequestPage.fileRequestTitle().shouldBe(Condition.visible);
    }
}
