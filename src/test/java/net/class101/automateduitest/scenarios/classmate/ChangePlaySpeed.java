package net.class101.automateduitest.scenarios.classmate;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.LecturePage;
import net.class101.automateduitest.scenarios.TestScenario;

public class ChangePlaySpeed implements TestScenario {

    private String playSpeedSvgPathBefore = null;
    private String playSpeedSvgPathAfter = null;

    @Override
    public TestScenario proceed() {
        try {
            LecturePage.Actions.openPage();
            LecturePage.Elements.videoPlayer().hover();
            LecturePage.Elements.playSpeedButton().shouldNotBe(Condition.disabled);
            playSpeedSvgPathBefore = LecturePage.Actions.getPlaySpeedSVGPathValue();
            LecturePage.Elements.videoPlayer().hover();
            LecturePage.Elements.playSpeedButton().shouldNotBe(Condition.disabled).click();
            Thread.sleep(1000);
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
