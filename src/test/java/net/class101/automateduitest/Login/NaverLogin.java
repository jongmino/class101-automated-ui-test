package net.class101.automateduitest.Login;


import static com.codeborne.selenide.Selenide.$;
import static net.class101.automateduitest.Common.Behaviors.loginWithNaver;
import static net.class101.automateduitest.Common.Behaviors.openUrl;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.Constants;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.openqa.selenium.Keys;

@TestInstance(Lifecycle.PER_CLASS)
public class NaverLogin {

    @BeforeAll
    void setUp() {
        openUrl(Constants.STAGING_URL);
    }

    @AfterAll
    static void afterAll() {
        Selenide.closeWebDriver();
    }

    @Test
    @Order(1)
    void login_with_naver() throws InterruptedException {
        loginWithNaver(Constants.NAVER_USER_ID, Constants.NAVER_PASSWORD);
    }
}
