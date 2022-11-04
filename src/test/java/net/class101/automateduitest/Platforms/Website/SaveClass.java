package net.class101.automateduitest.Platforms.Website;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static net.class101.automateduitest.Common.Behaviors.loginWithEmail;
import static net.class101.automateduitest.Common.Behaviors.openUrl;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
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
        openUrl(Constants.STAGING_URL);
    }

    @AfterAll
    static void afterAll() {
        closeWebDriver();
    }

    @Test
    @Order(1)
    void saveClass() throws InterruptedException {
        loginWithEmail(Constants.CLASS101_USER_ID, Constants.CLASS101_PASSWORD);
        $(Constants.FIRST_SAVE_BUTTON_ON_TRENDING_NOW).click();
        Thread.sleep(3000);
        $(Constants.SAVED_CLASSES_SECTION_TITLE).shouldBe(Condition.visible);
    }

    @Test
    @Order(2)
    void unSaveClass() throws InterruptedException {
        Thread.sleep(2000);
        $(Constants.FIRST_SAVE_BUTTON_ON_TRENDING_NOW).click();
        $$(Constants.SAVED_CLASSES_SECTION_TITLE).shouldBe(CollectionCondition.size(0));
    }
}
