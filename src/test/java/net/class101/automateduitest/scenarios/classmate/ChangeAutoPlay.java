package net.class101.automateduitest.scenarios.classmate;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.LecturePage;
import net.class101.automateduitest.scenarios.TestScenario;

public class ChangeAutoPlay implements TestScenario {

    private static ChangeAutoPlay instance = null;
    private String autoPlayOptionValue = null;
    private String currentAutoPlayOptionValue = null;

    public static ChangeAutoPlay getInstance() {
        if(instance == null){
            instance = new ChangeAutoPlay();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {

        try {
            LecturePage.Elements.videoElementPlaying().hover();
            LecturePage.Elements.autoPlaySettingButton().shouldBe(Condition.visible).click();
            autoPlayOptionValue = LecturePage.Actions.getUnCheckedAutoPlayOptionValue();
            LecturePage.Elements.firstUnCheckedRadioButton().click();
            LecturePage.Elements.settingButton().click();
            Thread.sleep(1000);
            currentAutoPlayOptionValue = LecturePage.Actions.getAutoPlayValue();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        return this;
    }

    @Override
    public void validate() {

        assertTrue(currentAutoPlayOptionValue.contains(autoPlayOptionValue));
    }
}
