package net.class101.automateduitest.resources.testcases.creator;

import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLoginPage;
import net.class101.automateduitest.resources.testcases.TestCase;

public class LogoutCreatorCenter implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorHome.Actions.openPage();
        CreatorHome.profileImg().click();
        CreatorHome.logoutButton().click();
        CreatorLoginPage.emailInputElement();
        return this;
    }

    @Override
    public void validate() {

    }
}
