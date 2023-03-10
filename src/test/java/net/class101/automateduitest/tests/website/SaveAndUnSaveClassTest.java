package net.class101.automateduitest.tests.website;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.core.LoginAsNonSubscriber;
import net.class101.automateduitest.resources.testcases.core.Logout;
import net.class101.automateduitest.resources.testcases.website.SaveClass;
import net.class101.automateduitest.resources.testcases.website.UnSaveClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class SaveAndUnSaveClassTest {

    @BeforeAll
    static void beforeAll() {
        Utils.setTestConfig();
        Home.Actions.openPage();
        SF.get(LoginAsNonSubscriber.class).proceed();
    }

    @AfterAll
    static void afterAll() {
        SF.get(Logout.class).proceed();
    }

    @Test
    void verifySaveAndUnSaveClass() throws InterruptedException {
        SF.get(SaveClass.class).proceed().validate();
        SF.get(UnSaveClass.class).proceed().validate();
    }
}
