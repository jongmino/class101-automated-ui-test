package net.class101.automateduitest.Login;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.Constants;
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
        Selenide.open(Constants.STAGING_URL);
    }

    @Test
    @Order(1)
    void login_with_email() {
        $(Constants.USER_NAVIGATION_LOGIN_BUTTON).click();
        $(Constants.LOGIN_PAGE_ALL_LOGIN_BUTTON).click();
        $(Constants.CLASS101_EMAIL_INPUT_FIELD).sendKeys(Constants.CLASS101_USER_ID);
        $(Constants.CLASS101_PASSWORD_INPUT_FIELD).sendKeys(Constants.CLASS101_PASSWORD);
        $(Constants.LOGIN_PAGE_LOGIN_BUTTON).click();
    }

    @Test
    @Order(2)
    void logout() {
        $(Constants.USER_NAVIGATION_PROFILE_IMG).click();
        $(Constants.MY_PAGE_LOGOUT_BUTTON).click();
        $(Constants.TRENDING_CLASS_SECTION).shouldBe(Condition.visible);
    }
}
