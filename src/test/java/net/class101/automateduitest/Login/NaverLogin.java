package net.class101.automateduitest.Login;


import static com.codeborne.selenide.Selenide.$;
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
    SelenideElement naverEmailField = $(Constants.NAVER_ID_INPUT_FIELD);
    SelenideElement naverPasswordField = $(Constants.NAVER_PASSWORD_INPUT_FIELD);
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
        $(Constants.USER_NAVIGATION_LOGIN_BUTTON).click();
        $(Constants.LOGIN_PAGE_ALL_LOGIN_BUTTON).click();
        $(Constants.LOGIN_PAGE_NAVER_BUTTON).click();

        naverEmailField.click();
        Selenide.clipboard().setText(Constants.NAVER_USER_ID);
        naverEmailField.sendKeys(Keys.COMMAND + "v");

        Thread.sleep(1000);

        naverPasswordField.click();
        Selenide.clipboard().setText(Constants.NAVER_PASSWORD);
        naverPasswordField.sendKeys(Keys.COMMAND + "v");

        Thread.sleep(1000);

        $(Constants.NAVER_LOGIN_BUTTON).click();
        $(Constants.USER_NAVIGATION_PROFILE_IMG).shouldBe(Condition.visible).click();
    }
}
