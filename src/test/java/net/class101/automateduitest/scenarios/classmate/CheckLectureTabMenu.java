package net.class101.automateduitest.scenarios.classmate;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.LecturePage;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 * Prerequisite:
 * 1) 홈페이지를 연다
 *
 *
 * */
public class CheckLectureTabMenu implements TestScenario {

    private static CheckLectureTabMenu instance = null;

    public static CheckLectureTabMenu getInstance() {
        if (instance == null) {
            instance = new CheckLectureTabMenu();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
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
