package net.class101.automateduitest.scenarios.classmate;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.LecturePage;
import net.class101.automateduitest.scenarios.TestScenario;

public class ChangeVideoQuality implements TestScenario {

    private static ChangeVideoQuality instance = null;
    private String qualityOptionValue = null;
    private String currentQualityValue = null;

    public static ChangeVideoQuality getInstance() {
        if(instance == null){
            instance = new ChangeVideoQuality();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {

        try {
            LecturePage.Elements.videoElementPlaying().hover();
            LecturePage.Elements.settingButton().shouldBe(Condition.visible).click();
            LecturePage.Elements.videoQualitySettingButton().click();
            qualityOptionValue = LecturePage.Elements.firstUnCheckedRadioButton().find("input").getValue();
            LecturePage.Elements.firstUnCheckedRadioButton().click();
            LecturePage.Elements.settingButton().click();
            Thread.sleep(1000);
            currentQualityValue  = LecturePage.Actions.getVideoQualityValue();
        }catch (InterruptedException e){

            e.printStackTrace();
        }

        return this;
    }

    @Override
    public void validate() {
        assertTrue(currentQualityValue.contains(qualityOptionValue));

    }
}
