package net.class101.automateduitest.scenarios.classmate;

import static net.class101.automateduitest.common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class ChangeServiceRegionJP implements TestScenario {

    private static ChangeServiceRegionJP instance = null;

    public static ChangeServiceRegionJP getInstance() {
        if(instance == null) {
            instance = new ChangeServiceRegionJP();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        try {
            //유저 네비게이션 프로필 이미지 클릭
            MyPage.Actions.openPage();
            //설정 탭 클릭
            MyPage.Elements.settingTab().click();
            //지역변경 버튼 클릭
            MyPage.Elements.serviceRegionSettingButton().click();
            //일본어로 변경
            MyPage.Elements.serviceRegionJPButton().click();

            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public void validate() {
        assertTrue(urlContains("ja"));
    }
}