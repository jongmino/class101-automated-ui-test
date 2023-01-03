package net.class101.automateduitest.tests.creator;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.testcases.core.Logout;
import net.class101.automateduitest.resources.testcases.creator.CheckClassSettlement;
import net.class101.automateduitest.resources.testcases.creator.CheckKitSettlement;
import net.class101.automateduitest.resources.testcases.creator.CheckPlusSettlement;
import net.class101.automateduitest.resources.testcases.creator.LoginAsCreatorHasClass;
import net.class101.automateduitest.resources.testcases.creator.LogoutCreatorCenter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class SettlementTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 20000;
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorHasClass.class).proceed();
    }

    @AfterAll
    static void afterAll() {
        SF.get(LogoutCreatorCenter.class).proceed();
    }

    @AfterEach
    void tearDown() {
        CreatorHome.Actions.openPage();
    }

    @Test
    void testClassSettlement() {
        SF.get(CheckClassSettlement.class).proceed().validate();
    }

    @Test
    void testPlusSettlement() {
        SF.get(CheckPlusSettlement.class).proceed().validate();
    }

    @Test
    void testKitSettlement() {
        SF.get(CheckKitSettlement.class).proceed().validate();
    }
}
