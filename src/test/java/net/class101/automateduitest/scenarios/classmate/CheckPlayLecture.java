package net.class101.automateduitest.scenarios.classmate;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.pages.plus.LecturePage;
import net.class101.automateduitest.pages.plus.ProductDetailPage;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 * 영상 재생 확인
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 구독 계정으로 로그인한다
 */
public class CheckPlayLecture implements TestScenario {

    @Override
    public TestScenario proceed() {
        ProductDetailPage.Actions.openKitPage();
        ProductDetailPage.Elements.playLectureButton().shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        LecturePage.Elements.videoElementPlaying().shouldBe(Condition.visible);
    }
}
