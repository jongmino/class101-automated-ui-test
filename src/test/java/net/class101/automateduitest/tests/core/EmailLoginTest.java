package net.class101.automateduitest.tests.core;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.core.LoginAsNonSubscriber;
import net.class101.automateduitest.resources.testcases.core.Logout;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
@TestInstance(Lifecycle.PER_CLASS)
public class EmailLoginTest {

    @BeforeAll
    static void beforeAll() {
        Utils.setTestConfig();
        Home.Actions.openPage();
    }

    @Test
    @Order(1)
    void testLoginWithEmail() {
        SF.get(LoginAsNonSubscriber.class).proceed().validate();
    }

    @Test
    @Order(2)
    void testLogout() {
        SF.get(Logout.class).proceed().validate();
    }
}
