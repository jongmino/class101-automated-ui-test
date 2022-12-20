package net.class101.automateduitest.resources.actions.classmate;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.LecturePage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 수강환경 - 플레이어 - 플레이어 기능 확인: 자동 재생 기능 설정 가능
 *
 * Prerequisite:
 * 1) 홈페이지를 연다.
 * 2) 구독계정으로 로그인한다.
 * 3) ChangePlaySpeed 이후에 실행
 */
public class ChangeAutoPlay implements TestAction {

    private String autoPlayOptionValue = null;
    private String currentAutoPlayOptionValue = null;

    @Override
    public TestAction execute() {
        try {
            LecturePage.Elements.videoPlayer().hover();
            LecturePage.Elements.autoPlaySettingButton().shouldBe(Condition.visible).click();
            autoPlayOptionValue = LecturePage.Actions.getUnCheckedAutoPlayOptionValue();
            LecturePage.Elements.firstUnCheckedRadioButton().click();
            LecturePage.Elements.settingButton().click();
            Thread.sleep(1000);
            currentAutoPlayOptionValue = LecturePage.Actions.getAutoPlayValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public void validate() {
        assertTrue(currentAutoPlayOptionValue.contains(autoPlayOptionValue));
    }
}
