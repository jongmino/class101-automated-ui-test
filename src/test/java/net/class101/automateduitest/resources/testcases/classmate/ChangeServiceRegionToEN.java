package net.class101.automateduitest.resources.testcases.classmate;

import static net.class101.automateduitest.resources.common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.pages.plus.SettingPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * @설명: 서비스 지역을 미국으로 변경할수 있는지 테스트 한다.
 * @분류: 마이페이지 - 설정 - 지역 설정 - 언어 및 국가 클릭 - 서비스 리전 변경 가능하다 - 미국
 * @테스트_선행조건:
 *   1) 홈페이지를 연다
 *   2) 로그인 한다
 */
public class ChangeServiceRegionToEN implements TestCase {

    @Override
    public TestCase proceed() {
        MyPage.Actions.openPage();
        //설정 탭 클릭
        MyPage.settingTab().click();
        //지역변경 버튼 클릭
        SettingPage.serviceRegionSettingButton().click();
        //영어로 변경
        SettingPage.serviceRegionUSButton().click();
        // 유저 프로필이 뜰 때까지 기다린다
        Home.userProfileImg();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(urlContains("en"));
    }
}
