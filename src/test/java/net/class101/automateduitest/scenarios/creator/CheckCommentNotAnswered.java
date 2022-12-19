package net.class101.automateduitest.scenarios.creator;

import net.class101.automateduitest.pages.creatorCenter.CreatorClassCommentPage;
import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 * 크리에이터 센터 - 클래스 (클래스 댓글) - 답변 대기중 - 답변 대기중 탭 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 클래스를 보유한 계정으로 로그인한다.
 */
public class CheckCommentNotAnswered implements TestScenario {

    @Override
    public TestScenario proceed() {
        CreatorHome.Actions.openPage();
        CreatorLeftNavigation.Elements.classTab().click();
        CreatorLeftNavigation.Elements.classCommentTab().click();
        CreatorClassCommentPage.Elements.notAnsweredTab().click();

        return this;
    }

    @Override
    public void validate() {
        CreatorClassCommentPage.Actions.isNotAnsweredTab();
    }
}
