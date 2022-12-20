package net.class101.automateduitest.resources.actions.classmate;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.LecturePage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 수강환경 - 플레이어 - 플레이어 기능 확인: 화질 기능 확인 가능
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 구독계정으로 로그인한다
 * 3) ChangePlaySpeed 이후에 실행
 */
public class ChangeVideoQuality implements TestAction {

    private String qualityOptionValue = null;
    private String currentQualityValue = null;

    @Override
    public TestAction execute() {
        try {
            LecturePage.Elements.videoPlayer().hover();
            LecturePage.Elements.settingButton().shouldBe(Condition.visible).click();
            LecturePage.Elements.videoQualitySettingButton().shouldBe(Condition.enabled).click();
            qualityOptionValue = LecturePage.Elements.firstUnCheckedRadioButton().find("input").getValue();
            LecturePage.Elements.firstUnCheckedRadioButton().shouldBe(Condition.enabled).click();
            LecturePage.Elements.settingButton().click();
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