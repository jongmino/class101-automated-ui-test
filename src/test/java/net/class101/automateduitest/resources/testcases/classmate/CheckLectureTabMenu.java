package net.class101.automateduitest.resources.testcases.classmate;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.LecturePage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * @설명: 수강환경 페이지에서 탭 메뉴들이 정상적으로 보이는지 테스트한다
 * @분류: 수강환경 - 탭 메뉴 - 커리큘럼, 댓글, 소식, 수업자 - 탭 메뉴 확인
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 로그인 한다
 */
public class CheckLectureTabMenu implements TestCase {

    @Override
    public TestCase proceed() {
        LecturePage.Actions.openPage();
        return this;
    }

    @Override
    public void validate() {
        LecturePage.commentSection().shouldBe(Condition.visible);
        LecturePage.curriculumSection().shouldBe(Condition.visible);
        LecturePage.materialSection().shouldBe(Condition.visible);
        LecturePage.noticeSection().shouldBe(Condition.visible);
    }
}
