package net.class101.automateduitest.scenarios.classmate;

import static net.class101.automateduitest.common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckOrderTab implements TestScenario {

    private static CheckOrderTab instance = null;

    public static CheckOrderTab getInstance() {
        if (instance == null) {
            instance = new CheckOrderTab();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {

        try {
            //유저 네비게이션 프로필 이미지 클릭
            MyPage.Actions.openPage();

            //주문 및 배송 탭 확인
            MyPage.Elements.orderTab().click();
            Thread.sleep(500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public void validate() {
        assertTrue(urlContains("orders"));
    }
}
