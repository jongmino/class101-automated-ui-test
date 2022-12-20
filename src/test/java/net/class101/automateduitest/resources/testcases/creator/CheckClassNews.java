package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorClassNewsPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 크리에이터 센터 - 클래스 (클래스 소식) - 진입 - SNB > 클래스 소식 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 클래스를 보유한 계정으로 로그인한다.
 */
public class CheckClassNews implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorHome.Actions.openPage();
        CreatorLeftNavigation.Elements.classTab().click();
        CreatorLeftNavigation.Elements.classNewsTab().click();
        CreatorClassNewsPage.Elements.classIdInput().shouldBe(Condition.visible).sendKeys(CreatorClassNewsPage.CLASS_ID);
        CreatorClassNewsPage.Elements.classIdInput().pressEnter();

        return this;
    }

    @Override
    public void validate() {
        CreatorClassNewsPage.Elements.createNoticeButton().shouldBe(Condition.visible);
    }
}
