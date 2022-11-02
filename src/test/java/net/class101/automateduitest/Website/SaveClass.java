package net.class101.automateduitest.Website;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.Constants;
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
public class SaveClass {

    @BeforeAll
    static void beforeAll() {
        Selenide.open(Constants.STAGING_URL);
        Configuration.timeout = 10000;
    }

    @AfterAll
    static void afterAll() {
        Selenide.closeWebDriver();
    }

    @Test
    @Order(1)
    void saveClass() {
        $(Constants.FIRST_SAVE_BUTTON_ON_TRENDING_NOW).click();
        $(Constants.LOGIN_PAGE_ALL_LOGIN_BUTTON).click();
        $(Constants.CLASS101_EMAIL_INPUT_FIELD).sendKeys(Constants.CLASS101_USER_ID);
        $(Constants.CLASS101_PASSWORD_INPUT_FIELD).sendKeys(Constants.CLASS101_PASSWORD);
        $(Constants.LOGIN_PAGE_LOGIN_BUTTON).click();
        $(Constants.SAVED_CLASSES_SECTION_TITLE).shouldBe(Condition.visible);
    }

    @Test
    @Order(2)
    void unSaveClass() throws InterruptedException {
        $(Constants.FIRST_SAVE_BUTTON_ON_SAVED_CLASS).click();
        $(Constants.SAVED_CLASSES_SECTION_TITLE).should(Condition.disappear);
    }
}
