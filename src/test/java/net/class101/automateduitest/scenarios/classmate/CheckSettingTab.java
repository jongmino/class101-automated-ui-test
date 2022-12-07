package net.class101.automateduitest.scenarios.classmate;

import static net.class101.automateduitest.common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckSettingTab implements TestScenario {

    private static CheckSettingTab instance = null;

    public static CheckSettingTab getInstance() {
        if (instance == null) {
            instance = new CheckSettingTab();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        try {
            MyPage.Elements.settingTab().click();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public void validate() {
        assertTrue(urlContains("setting"));
    }
}
