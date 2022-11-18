package net.class101.automateduitest.testSuites.core;

import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.core.LoginAsNonSubscriber;
import net.class101.automateduitest.scenarios.core.Logout;
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
        LoginAsNonSubscriber.getInstance().proceed().validate();
    }

    @Test
    @Order(2)
    void logout() {
        Logout.getInstance().proceed().validate();
    }
}
