package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.CollectionCondition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorClassCommentPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명: 크리에이터 센터의 클래스 댓글 페이지에서 '답변 대기중' 탭을 클릭했을 때 '답변 대기중'인 댓글들이 정상적으로 노출되는지 테스트한다
 * @분류: 크리에이터 센터 - 클래스 (클래스 댓글) - 답변 대기중 - 답변 대기중 탭 클릭
 * @테스트_선행조건:
 *  1) 크리에이터 홈으로 진입한다
 *  2) 클래스를 보유한 계정으로 로그인한다.
 */
public class CheckCommentNotAnswered implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorHome.Actions.openPage();
        CreatorLeftNavigation.classTab().click();
        CreatorLeftNavigation.classCommentTab().click();
        CreatorClassCommentPage.notAnsweredTab().click();
        return this;
    }

    @Override
    public void validate() {
        CreatorClassCommentPage.markAsAnsweredButtons().shouldHave(CollectionCondition.sizeGreaterThan(0));
    }
}
