package net.class101.automateduitest.scenarios.creator;

import net.class101.automateduitest.pages.creatorCenter.CreatorClassCommentPage;
import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckCommentNotAnswered implements TestScenario {

    private static CheckCommentNotAnswered instance = null;

    public static CheckCommentNotAnswered getInstance() {
        if (instance == null) {
            instance = new CheckCommentNotAnswered();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        try {
            CreatorHome.Actions.openPage();
            CreatorLeftNavigation.Elements.classTab().click();
            CreatorLeftNavigation.Elements.classCommentTab().click();
            CreatorClassCommentPage.Elements.notAnsweredTab().click();
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        return this;
    }

    @Override
    public void validate() {
        CreatorClassCommentPage.Actions.isNotAnsweredTab();
    }
}
