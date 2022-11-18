package net.class101.automateduitest.scenarios.classmate;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.LecturePage;
import net.class101.automateduitest.scenarios.TestScenario;

public class ChangePlaySpeed implements TestScenario {

    private static ChangePlaySpeed instance = null;
    private String playSpeedSvgPathBefore = null;
    private String playSpeedSvgPathAfter = null;

    public static ChangePlaySpeed getInstance() {
        if(instance == null) {
            instance = new ChangePlaySpeed();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {

        try {
            LecturePage.Elements.videoElementPlaying().hover();
            LecturePage.Elements.playSpeedButton().shouldBe(Condition.visible);
            playSpeedSvgPathBefore = LecturePage.Actions.getPlaySpeedSVGPathValue();
            Thread.sleep(1000);
            LecturePage.Elements.playSpeedButton().click();
            playSpeedSvgPathAfter = LecturePage.Actions.getPlaySpeedSVGPathValue();

        }catch (InterruptedException e){

            e.printStackTrace();
        }

        return this;
    }

    @Override
    public void validate() {
        assertNotEquals(playSpeedSvgPathBefore, playSpeedSvgPathAfter);
    }
}
