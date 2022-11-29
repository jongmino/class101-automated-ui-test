package net.class101.automateduitest.scenarios.creator;

import static org.junit.jupiter.api.Assertions.assertTrue;

import net.class101.automateduitest.common.Utils;
import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckClassCommentTab implements TestScenario {

    private static CheckClassCommentTab instance = null;

    public static CheckClassCommentTab getInstance() {
        if (instance == null) {
            instance = new CheckClassCommentTab();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        try {
            CreatorHome.Actions.openPage();
            CreatorLeftNavigation.Elements.classTab().click();
            CreatorLeftNavigation.Elements.classCommentTab().click();
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        return this;
    }

    @Override
    public void validate() {
        assertTrue(Utils.urlContains("class-comments"));
    }
}
