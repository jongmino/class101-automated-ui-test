package net.class101.automateduitest.Platforms.Core;

import static net.class101.automateduitest.Common.Behaviors.loginWithEmail;
import static net.class101.automateduitest.Common.Behaviors.openUrl;

import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.Constants;
import net.class101.automateduitest.Common.Behaviors;
import org.junit.jupiter.api.AfterAll;
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
        openUrl(Constants.STAGING_PLUS_HOME_URL);
    }

    @AfterAll
    static void afterAll() {
        Selenide.closeWebDriver();
    }

    @Test
    @Order(1)
    void login_with_email() {
        loginWithEmail(Constants.CLASS101_USER_ID, Constants.CLASS101_PASSWORD);
    }

    @Test
    @Order(2)
    void logout() {
        Behaviors.logout();
    }
}
