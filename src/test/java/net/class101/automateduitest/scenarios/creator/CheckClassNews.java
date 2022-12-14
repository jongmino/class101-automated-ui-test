package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorClassNewsPage;
import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckClassNews implements TestScenario {

    @Override
    public TestScenario proceed() {
        CreatorHome.Actions.openPage();
        CreatorLeftNavigation.Elements.classTab().click();
        CreatorLeftNavigation.Elements.classNewsTab().click();
        CreatorClassNewsPage.Elements.classIdInput().shouldBe(Condition.visible).sendKeys(CreatorClassNewsPage.CLASS_ID);
        CreatorClassNewsPage.Elements.classIdInput().pressEnter();
        return this;
    }

    @Override
    public void validate() {
        CreatorClassNewsPage.Elements.createNoticeButton().shouldBe(Condition.visible);
    }
}
