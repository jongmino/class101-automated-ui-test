package net.class101.automateduitest.resources.testcases.classmate;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.LecturePage;
import net.class101.automateduitest.resources.pages.plus.ProductDetailPage;
import net.class101.automateduitest.resources.testcases.TestCase;


/**
 * @설명: 플레이어가 정상적으로 재생되는지 테스트한다
 * @분류: 수강환경 - 플레이어 = 영상 재생 확인
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 구독 계정으로 로그인한다
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
