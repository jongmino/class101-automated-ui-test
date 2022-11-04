package net.class101.automateduitest.Login;

import static com.codeborne.selenide.Selenide.$;
import static net.class101.automateduitest.Common.Behaviors.loginWithFaceBook;
import static net.class101.automateduitest.Common.Behaviors.openUrl;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.Constants;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class FaceBookLogin {

    @BeforeAll
    void setUp() {
        openUrl(Constants.STAGING_URL);
    }

    @Test
    @Order(1)
    void login_with_facebook() {
        loginWithFaceBook(Constants.FACEBOOK_USER_ID, Constants.FACEBOOK_PASSWORD);
    }

}
