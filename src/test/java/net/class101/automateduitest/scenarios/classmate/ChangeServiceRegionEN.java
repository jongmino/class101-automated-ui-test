package net.class101.automateduitest.scenarios.classmate;

import static net.class101.automateduitest.common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class ChangeServiceRegionEN implements TestScenario {

    @Override
    public TestScenario proceed() {
        //유저 네비게이션 프로필 이미지 클릭
        MyPage.Actions.openPage();
        //설정 탭 클릭
        MyPage.Elements.settingTab().click();
        //지역변경 버튼 클릭
        MyPage.Elements.serviceRegionSettingButton().click();
        //영어로 변경
        MyPage.Elements.serviceRegionUSButton().click();
        //홈페이지 이동 대기
        Home.Elements.userProfileImg().shouldBe(Condition.visible);

        return this;
    }

    @Override
    public void validate() {
        assertTrue(urlContains("en"));
    }
}
