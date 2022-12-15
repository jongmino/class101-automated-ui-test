package net.class101.automateduitest.scenarios.creator;

import net.class101.automateduitest.pages.creatorCenter.CreatorClassCommentPage;
import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckCommentNotAnswered implements TestScenario {

    @Override
    public TestScenario proceed() {
        CreatorHome.Actions.openPage();
        CreatorLeftNavigation.Elements.classTab().click();
        CreatorLeftNavigation.Elements.classCommentTab().click();
        CreatorClassCommentPage.Elements.notAnsweredTab().click();

        return this;
    }

    @Override
    public void validate() {
        CreatorClassCommentPage.Actions.isNotAnsweredTab();
    }
}
