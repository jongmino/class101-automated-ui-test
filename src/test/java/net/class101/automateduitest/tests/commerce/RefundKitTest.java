package net.class101.automateduitest.tests.commerce;

import net.class101.automateduitest.resources.common.PropertyLoader;
import net.class101.automateduitest.resources.common.SF;
import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.commerce.CheckRefundKit;
import net.class101.automateduitest.resources.testcases.core.LoginAsUserHasKit;
import net.class101.automateduitest.resources.testcases.core.Logout;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class RefundKitTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = PropertyLoader.getProperties().timeout;
        Home.Actions.openPage();
        SF.get(LoginAsUserHasKit.class).proceed();
    }

    @AfterAll
    static void afterAll() {
        SF.get(Logout.class).proceed();
    }

    @Test
    void testRefundKit() {
        SF.get(CheckRefundKit.class).proceed().validate();
    }
}
