package net.class101.automateduitest.resources.testcases.classmate;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.LecturePage;
import net.class101.automateduitest.resources.pages.plus.ProductDetailPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 영상 재생 확인
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 구독 계정으로 로그인한다
 */
public class CheckPlayLecture implements TestCase {

    @Override
    public TestCase proceed() {
        ProductDetailPage.Actions.openKitPage();
        ProductDetailPage.playLectureButton().shouldNotBe(Condition.disabled).click();
        return this;
    }

    @Override
    public void validate() {
        LecturePage.videoElementPlaying().shouldBe(Condition.visible);
    }
}
