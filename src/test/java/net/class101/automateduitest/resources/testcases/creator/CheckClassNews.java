package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorClassNewsPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * @설명: 크리에이터 센터에서 클래스 소식 메뉴 클릭시 클래스 소식 페이지로 정상 진입 되는지 테스트한다
 * @분류: 크리에이터 센터 - 클래스 (클래스 소식) - 진입 - SNB > 클래스 소식 클릭
 * @테스트_선행조건:
 *  1) 크리에이터 홈으로 진입한다
 *  2) 클래스를 보유한 계정으로 로그인한다.
 */
public class CheckClassNews implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorHome.Actions.openPage();
        CreatorLeftNavigation.classTab().click();
        CreatorLeftNavigation.classNewsTab().click();
        CreatorClassNewsPage.classIdInput().shouldBe(Condition.visible).sendKeys(CreatorClassNewsPage.CLASS_ID);
        CreatorClassNewsPage.classIdInput().pressEnter();

        return this;
    }

    @Override
    public void validate() {
        CreatorClassNewsPage.createNoticeButton().shouldBe(Condition.visible);
    }
}
