package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.CollectionCondition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorClassCommentPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 크리에이터 센터 - 클래스 (클래스 댓글) - 답변 완료 - 답변 완료 탭 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 클래스를 보유한 계정으로 로그인한다.
 */
public class CheckCommentAnswered implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorHome.Actions.openPage();
        CreatorLeftNavigation.classTab().click();
        CreatorLeftNavigation.classCommentTab().click();
        CreatorClassCommentPage.answeredTab().click();

        return this;
    }

    @Override
    public void validate() {
        CreatorClassCommentPage.markAsAnsweredButtons().shouldHave(CollectionCondition.size(0));
    }
}
