package net.class101.automateduitest.resources.testcases.classmate;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.LecturePage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.Assert.assertTrue;

/**
 * @설명: 비디오 플레이어에서 자동 재생 옵션을 변경 할 수 있는지 테스트한다
 * @분류: 수강환경 - 플레이어 - 플레이어 기능 확인: 자동 재생 기능 설정 가능
 * @테스트_선행조건:
 *  1) 홈페이지를 연다.
 *  2) 구독계정으로 로그인한다.
 *  3) ChangePlaySpeed 이후에 실행
 */
public class ChangeAutoPlay implements TestCase {

    private String autoPlayOptionValue = null;
    private String currentAutoPlayOptionValue = null;

    @Override
    public TestCase proceed() {
        LecturePage.Actions.openPage();
        LecturePage.videoPlayer().hover();
        LecturePage.settingButton().shouldBe(Condition.enabled).click();
        LecturePage.autoPlaySettingButton().shouldBe(Condition.enabled).click();
        autoPlayOptionValue = LecturePage.Actions.getUnCheckedAutoPlayOptionValue();
        LecturePage.firstUnCheckedRadioButton().shouldBe(Condition.enabled).click();
        LecturePage.settingButton().shouldBe(Condition.enabled).click();
        currentAutoPlayOptionValue = LecturePage.Actions.getAutoPlayValue();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(currentAutoPlayOptionValue.contains(autoPlayOptionValue));
    }
}
