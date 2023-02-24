package net.class101.automateduitest.tests.commerce;

import net.class101.automateduitest.resources.common.Properties;
import net.class101.automateduitest.resources.common.PropertyLoader;
import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.plus.AllLoginPage;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.LoginPage;
import net.class101.automateduitest.resources.testcases.commerce.CheckSoldOutButton;
import net.class101.automateduitest.resources.testcases.core.LoginAsCommon;
import net.class101.automateduitest.resources.testcases.core.Logout;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Map;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SoldOutButtonTest {

    @BeforeAll
    static void beforeAll() {
    SF.get(LoginAsCommon.class).proceed().validate();
    Utils.sleep(2000);
    }

    @AfterAll
    static void afterAll() {
        SF.get(Logout.class).proceed();
    }

    @Test
    void testKitSoldOutButton() {
        SF.get(CheckSoldOutButton.class).proceed().validate();
    }

}
