package net.class101.automateduitest.Platforms.Core;

import net.class101.automateduitest.Behaviors.Core;
import net.class101.automateduitest.Pages.Plus.Home;
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
        Home.openPage();
    }

    @Test
    @Order(1)
    void login_with_email() {
        Core.loginWithNonSubscribedUser();
    }

    @Test
    @Order(2)
    void logout() {
        Core.logout();
    }
}
