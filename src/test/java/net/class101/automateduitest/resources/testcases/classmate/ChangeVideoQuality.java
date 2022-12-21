package net.class101.automateduitest.resources.testcases.classmate;

import static org.junit.Assert.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.LecturePage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * @설명: 비디오 플레이어에서 화질 옵션을 변경할 수 있는지 테스트한다
 * @분류: 수강환경 - 플레이어 - 플레이어 기능 확인: 화질 기능 확인 가능
 * @테스트_선행조건: 1) 홈페이지를 연다 2) 구독계정으로 로그인한다 3) ChangePlaySpeed 이후에 실행
 */
public class ChangeVideoQuality implements TestCase {

    private String qualityOptionValue = null;
    private String currentQualityValue = null;

    @Override
    public TestCase proceed() {
        try {
            LecturePage.videoPlayer().hover();
            LecturePage.settingButton().click();
            LecturePage.videoQualitySettingButton().shouldBe(Condition.enabled).click();
            qualityOptionValue = LecturePage.firstUnCheckedRadioButton().find("input").getValue();
            LecturePage.firstUnCheckedRadioButton().shouldBe(Condition.enabled).click();
            LecturePage.settingButton().click();
            Thread.sleep(1000);
            currentQualityValue = LecturePage.Actions.getVideoQualityValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public void validate() {
        assertTrue(currentQualityValue.contains(qualityOptionValue));
    }
}
