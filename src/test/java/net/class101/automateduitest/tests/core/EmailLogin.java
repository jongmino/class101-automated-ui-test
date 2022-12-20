package net.class101.automateduitest.tests.core;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.core.LoginAsNonSubscriber;
import net.class101.automateduitest.resources.testcases.core.Logout;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

@DisplayName("Login with Email")
@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class EmailLogin {

    @BeforeAll
    void setUp() {
        Home.Actions.openPage();
    }

    @Test
    @Order(1)
    void login_with_email() {
        SF.get(LoginAsNonSubscriber.class).proceed().validate();
    }

    @Test
    @Order(2)
    void logout() {
        SF.get(Logout.class).proceed().validate();
    }
}
