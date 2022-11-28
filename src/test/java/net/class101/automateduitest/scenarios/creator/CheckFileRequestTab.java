package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorFileRequestPage;
import net.class101.automateduitest.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckFileRequestTab implements TestScenario {

    private static CheckFileRequestTab instance = null;

    public static CheckFileRequestTab getInstance() {
        if (instance == null) {
            instance = new CheckFileRequestTab();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        CreatorLeftNavigation.Elements.fileRequestTab().click();
        return this;
    }

    @Override
    public void validate() {
        CreatorFileRequestPage.Elements.fileRequestTitle().shouldBe(Condition.visible);
    }
}
