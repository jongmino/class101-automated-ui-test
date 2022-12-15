package net.class101.automateduitest.scenarios.classmate;

import static net.class101.automateduitest.common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.pages.plus.SettingPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class ChangeServiceRegionJP implements TestScenario {

    @Override
    public TestScenario proceed() {
        MyPage.Actions.openPage();
        //설정 탭 클릭
        MyPage.Elements.settingTab().click();
        //지역변경 버튼 클릭
        SettingPage.Elements.serviceRegionSettingButton().click();
        //일본어로 변경
        SettingPage.Elements.serviceRegionJPButton().click();
        //홈페이지 이동 대기
        Home.Elements.userProfileImg().shouldBe(Condition.visible);

        return this;
    }

    @Override
    public void validate() {
        assertTrue(urlContains("ja"));
    }
}
