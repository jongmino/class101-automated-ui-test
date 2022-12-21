package net.class101.automateduitest.resources.testcases.classmate;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.LecturePage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * @설명: 비디오 플레이어에서 재생속도를 변경할 수 있는지 테스트한다
 * @분류: 수강환경 - 플레이어 - 플레이어 기능 확인: 플레이어 기능 정상 동작 확인(재생 속도 변경)
 * @테스트_선행조건:
 *  1) 홈페이지를 연다.
 *  2) 구독계정으로 로그인한다.
 */
public class ChangePlaySpeed implements TestCase {

    private String playSpeedSvgPathBefore = null;
    private String playSpeedSvgPathAfter = null;

    @Override
    public TestCase proceed() {
        try {
            LecturePage.Actions.openPage();
            LecturePage.videoPlayer().hover();
            LecturePage.playSpeedButton().shouldNotBe(Condition.disabled);
            playSpeedSvgPathBefore = LecturePage.Actions.getPlaySpeedSVGPathValue();
            LecturePage.videoPlayer().hover();
            LecturePage.playSpeedButton().shouldNotBe(Condition.disabled).click();
            Thread.sleep(1000);
            playSpeedSvgPathAfter = LecturePage.Actions.getPlaySpeedSVGPathValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public void validate() {
        assertNotEquals(playSpeedSvgPathBefore, playSpeedSvgPathAfter);
    }
}
