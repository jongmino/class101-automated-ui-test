package net.class101.automateduitest.scenarios.classmate;

import static net.class101.automateduitest.common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckReferralTab implements TestScenario {

    private static CheckCreatorCenterTab instance = null;

    public static CheckCreatorCenterTab getInstance() {
        if(instance == null) {
            instance = new CheckCreatorCenterTab();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {

        try {

            //유저 네비게이션 프로필 이미지 클릭
            MyPage.Actions.openPage();

            //친구초대 탭 확인
            MyPage.Elements.referralTab().click();
            Thread.sleep(500);

        }catch (InterruptedException e) {

            e.printStackTrace();
        }

        return this;
    }

    @Override
    public void validate() {
        assertTrue(urlContains("classmate-referral"));
    }
}
