package net.class101.automateduitest.scenarios.classmate;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.pages.plus.LecturePage;
import net.class101.automateduitest.pages.plus.ProductDetailPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckPlayLecture implements TestScenario {

    @Override
    public TestScenario proceed() {
        Home.Elements.firstCurationItem().click();
        ProductDetailPage.Elements.playLectureButton().shouldBe(Condition.enabled).click();
        return this;
    }

    @Override
    public void validate() {
        LecturePage.Elements.videoElementPlaying().shouldBe(Condition.visible);
    }
}
