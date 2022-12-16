package net.class101.automateduitest.scenarios.classmate;

import static net.class101.automateduitest.common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.pages.plus.SettingPage;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 * 마이페이지 - 설정 - 지역 설정 - 언어 및 국가 클릭 - 서비스 리전 변경 가능하다 - 미국
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 로그인 한다
 */
public class ChangeServiceRegionEN implements TestScenario {

    @Override
    public TestScenario proceed() {
        MyPage.Actions.openPage();
        //설정 탭 클릭
        MyPage.Elements.settingTab().click();
        //지역변경 버튼 클릭
        SettingPage.Elements.serviceRegionSettingButton().click();
        //영어로 변경
        SettingPage.Elements.serviceRegionUSButton().click();
        //홈페이지 이동 대기
        Home.Elements.userProfileImg().shouldBe(Condition.visible);

        return this;
    }

    @Override
    public void validate() {
        assertTrue(urlContains("en"));
    }
}
