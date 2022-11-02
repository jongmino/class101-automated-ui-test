package net.class101.automateduitest.Login;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.Constants;
import net.class101.automateduitest.Common.Behaviors;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;


@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class EmailLogin {

    @BeforeAll
    void setUp() {
        open(Constants.STAGING_URL);
    }

    @AfterAll
    static void afterAll() {
        Selenide.closeWebDriver();
    }

    @Test
    @Order(1)
    void login_with_email() {
        Behaviors.loginWithEmail();
    }

    @Test
    @Order(2)
    void logout() {
        $(Constants.USER_NAVIGATION_PROFILE_IMG).click();
        $(Constants.MY_PAGE_LOGOUT_BUTTON).click();
        $(Constants.TRENDING_CLASS_SECTION).shouldBe(Condition.visible);
    }
}
