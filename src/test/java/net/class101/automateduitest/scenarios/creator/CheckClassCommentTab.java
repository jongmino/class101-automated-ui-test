package net.class101.automateduitest.scenarios.creator;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.common.Utils;
import net.class101.automateduitest.pages.creatorCenter.CreatorClassCommentPage;
import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 * 크리에이터 센터 - 클래스 (클래스 댓글) - 페이지 진입 - SNB > 클래스 > 클래스 댓글 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 클래스를 보유한 계정으로 로그인한다.
 */
public class CheckClassCommentTab implements TestScenario {

    @Override
    public TestScenario proceed() {
        CreatorHome.Actions.openPage();
        CreatorLeftNavigation.Elements.classTab().click();
        CreatorLeftNavigation.Elements.classCommentTab().click();
        CreatorClassCommentPage.Elements.commentPageTitle().shouldBe(Condition.visible);

        return this;
    }

    @Override
    public void validate() {
        assertTrue(Utils.urlContains("class-comments"));
    }
}
