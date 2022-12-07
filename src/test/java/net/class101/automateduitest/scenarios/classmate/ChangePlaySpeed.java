package net.class101.automateduitest.scenarios.classmate;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.LecturePage;
import net.class101.automateduitest.scenarios.TestScenario;

public class ChangePlaySpeed implements TestScenario {

    private static ChangePlaySpeed instance = null;

    public static ChangePlaySpeed getInstance() {
        if (instance == null) {
            instance = new ChangePlaySpeed();
        }
        return instance;
    }

    private String playSpeedSvgPathBefore = null;
    private String playSpeedSvgPathAfter = null;

    @Override
    public TestScenario proceed() {

        try {
            LecturePage.Elements.videoElementPlaying().hover();
            LecturePage.Elements.playSpeedButton().shouldNotBe(Condition.disabled);
            playSpeedSvgPathBefore = LecturePage.Actions.getPlaySpeedSVGPathValue();
            Thread.sleep(1000);
            LecturePage.Elements.videoElementPlaying().hover();
            LecturePage.Elements.playSpeedButton().shouldNotBe(Condition.disabled).click();
            playSpeedSvgPathAfter = LecturePage.Actions.getPlaySpeedSVGPathValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public void validate() {
        System.out.println("before: " + playSpeedSvgPathBefore);
        System.out.println("after: " + playSpeedSvgPathAfter);
        assertNotEquals(playSpeedSvgPathBefore, playSpeedSvgPathAfter);
    }
}
