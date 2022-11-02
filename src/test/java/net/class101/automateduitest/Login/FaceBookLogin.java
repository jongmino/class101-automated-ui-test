package net.class101.automateduitest.Login;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.Constants;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class FaceBookLogin {

//    @BeforeAll
//    void setUp() {
//        open(Constants.STAGING_URL);
//        Configuration.timeout = 10000;
//    }

//    @Test
//    @Order(1)
//    void login_with_facebook() {
//        $(Constants.USER_NAVIGATION_LOGIN_BUTTON).click();
//        $(Constants.LOGIN_PAGE_ALL_LOGIN_BUTTON).click();
//        $(Constants.LOGIN_PAGE_FACEBOOK_BUTTON).click();
//        $(Constants.FACEBOOK_EMAIL_INPUT_FIELD).sendKeys(Constants.FACEBOOK_USER_ID);
//        $(Constants.FACEBOOK_PASSWORD_INPUT_FIELD).sendKeys(Constants.FACEBOOK_PASSWORD);
//        $(Constants.FACEBOOK_LOGIN_BUTTON).click();
//        $(Constants.USER_NAVIGATION_PROFILE_IMG).shouldBe(Condition.visible).click();
//    }

}
