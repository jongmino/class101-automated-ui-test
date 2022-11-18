package net.class101.automateduitest.scenarios.classmate;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.pages.plus.LecturePage;
import net.class101.automateduitest.pages.plus.ProductDetailPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class PlayLecture implements TestScenario {

    private static PlayLecture instance = null;

    public static PlayLecture getInstance() {
        if(instance == null) {
            instance = new PlayLecture();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {

        Home.Elements.firstCurationItem().click();

        ProductDetailPage.Elements.playLectureButton().click();

        return this;
    }

    @Override
    public void validate() {

        LecturePage.Elements.videoElementPlaying().shouldBe(Condition.visible);
    }
}
