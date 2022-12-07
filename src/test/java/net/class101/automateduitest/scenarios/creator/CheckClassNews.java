package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorClassNewsPage;
import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckClassNews implements TestScenario {

    private static CheckClassNews instance = null;

    public static CheckClassNews getInstance() {
        if (instance == null) {
            instance = new CheckClassNews();
        }
        return instance;
    }

    private CheckClassNews() {
    }

    @Override
    public TestScenario proceed() {
        CreatorHome.Actions.openPage();
        CreatorLeftNavigation.Elements.classTab().click();
        CreatorLeftNavigation.Elements.classNewsTab().click();
        CreatorClassNewsPage.Elements.classSelector().shouldBe(Condition.visible).selectOption(1);
        return this;
    }

    @Override
    public void validate() {
        CreatorClassNewsPage.Elements.createNoticeButton().shouldBe(Condition.visible);
    }
}
