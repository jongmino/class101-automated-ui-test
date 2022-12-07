package net.class101.automateduitest.scenarios.classmate;

import static net.class101.automateduitest.common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckCreatorCenterTab implements TestScenario {

    private static CheckCreatorCenterTab instance = null;

    public static CheckCreatorCenterTab getInstance() {
        if (instance == null) {
            instance = new CheckCreatorCenterTab();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        try {
            MyPage.Actions.openPage();

            //크리에이터 센터 탭 확인
            MyPage.Elements.creatorCenterTab().click();
            Thread.sleep(500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public void validate() {
        assertTrue(urlContains("creator.class101.net"));
    }
}
