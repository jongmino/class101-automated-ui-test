package net.class101.automateduitest.resources.actions.classmate;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.LecturePage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 마이페이지 - 메뉴영역 - 각 메뉴 페이지 이동 확인 - 각 메뉴 별 페이지 랜딩 확인 - 크리에이터 센터 메뉴
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 로그인 한다
 */
public class CheckLectureTabMenu implements TestAction {

    @Override
    public TestAction execute() {
        LecturePage.Actions.openPage();
        return this;
    }

    @Override
    public void validate() {
        LecturePage.Elements.commentSection().shouldBe(Condition.visible);
        LecturePage.Elements.curriculumSection().shouldBe(Condition.visible);
        LecturePage.Elements.materialSection().shouldBe(Condition.visible);
        LecturePage.Elements.noticeSection().shouldBe(Condition.visible);
    }
}
