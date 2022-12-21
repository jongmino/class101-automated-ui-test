package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorNoticePage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * @설명: 크리에이터 센터에서 '공지사항'메뉴 클릭 시 해당 페이지로 정상 이동되는지 테스트한다
 * @분류: 크리에이터 센터 - 공지사항 - 진입 - SNB > 공지사항 클릭
 * @테스트_선행조건:
 *  1) 크리에이터 홈을 연다
 *  2) 로그인 한다
 */
public class CheckNoticeTab implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorLeftNavigation.noticeTab().click();
        return this;
    }

    @Override
    public void validate() {
        CreatorNoticePage.noticeSection().shouldBe(Condition.visible);
    }
}
