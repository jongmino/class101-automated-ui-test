package net.class101.automateduitest.resources.testcases.classmate;

import static net.class101.automateduitest.resources.common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.pages.plus.SettingPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 마이페이지 - 설정 - 지역 설정 - 언어 및 국가 클릭 - 서비스 리전 변경 가능하다 - 일본
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 로그인 한다
 */
public class ChangeServiceRegionJP implements TestCase {

    @Override
    public TestCase proceed() {
        MyPage.Actions.openPage();
        //설정 탭 클릭
        MyPage.settingTab().click();
        //지역변경 버튼 클릭
        SettingPage.serviceRegionSettingButton().click();
        //일본어로 변경
        SettingPage.serviceRegionJPButton().click();
        //홈페이지 이동 대기
        Home.userProfileImg().shouldBe(Condition.visible);

        return this;
    }

    @Override
    public void validate() {
        assertTrue(urlContains("ja"));
    }
}
