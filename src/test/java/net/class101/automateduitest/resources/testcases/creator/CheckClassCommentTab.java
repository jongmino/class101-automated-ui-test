package net.class101.automateduitest.resources.testcases.creator;

import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorClassCommentPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.Assert.assertTrue;

/**
 * @설명: 크리에이터 센터에서 클래스 댓글 메뉴 클릭시 클래스 댓글 페이지로 정상 이동 되는지 테스트한다
 * @분류: 크리에이터 센터 - 클래스 (클래스 댓글) - 페이지 진입 - SNB > 클래스 > 클래스 댓글 클릭
 * @테스트_선행조건:
 *  1) 크리에이터 홈으로 진입한다
 *  2) 클래스를 보유한 계정으로 로그인한다.
 */
public class CheckClassCommentTab implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorHome.Actions.openPage();
        CreatorLeftNavigation.classTab().click();
        CreatorLeftNavigation.classCommentTab().click();
        CreatorClassCommentPage.commentPageTitle();

        return this;
    }

    @Override
    public void validate() {
        assertTrue(Utils.urlContains("class-comments"));
    }
}
