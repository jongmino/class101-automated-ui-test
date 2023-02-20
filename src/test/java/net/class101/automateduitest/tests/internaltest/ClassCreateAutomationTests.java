package net.class101.automateduitest.tests.internaltest;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.testcases.internaltest.ClassCreateAutomationTestCases;
import net.class101.automateduitest.resources.testcases.internaltest.LoginAsCreatorUser;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@TestInstance(Lifecycle.PER_CLASS)
public class ClassCreateAutomationTests {

    @Test
    void testAddClassCreate() {
        for (int i = 0; i < 30; i++) {
            Utils.setTestConfig();
            CreatorHome.Actions.openPage();
            SF.get(LoginAsCreatorUser.class).proceed();
            SF.get(ClassCreateAutomationTestCases.class).proceed().validate();
            System.out.println("testAddClassCreate: " + i);
            getWebDriver().close();
        }
    }
}
