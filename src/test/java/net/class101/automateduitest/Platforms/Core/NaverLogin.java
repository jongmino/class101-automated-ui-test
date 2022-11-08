package net.class101.automateduitest.Platforms.Core;


import static com.codeborne.selenide.Selenide.$;
import static net.class101.automateduitest.Common.Behaviors.loginWithNaver;
import static net.class101.automateduitest.Common.Behaviors.openUrl;

import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.Constants;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class NaverLogin {

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
    void login_with_naver() throws InterruptedException {
        loginWithNaver(Constants.NAVER_USER_ID, Constants.NAVER_PASSWORD);
    }
}
