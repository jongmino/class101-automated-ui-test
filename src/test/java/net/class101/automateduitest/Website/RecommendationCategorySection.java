package net.class101.automateduitest.Website;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static net.class101.automateduitest.Common.Behaviors.openUrl;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import net.class101.automateduitest.Constants;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class RecommendationCategorySection {

    @BeforeAll
    static void beforeAll() {
        openUrl(Constants.STAGING_URL);
    }

    @AfterAll
    static void afterAll() {
        closeWebDriver();
    }

    @Test
    void recommendation_category() throws InterruptedException {
        $(Constants.RECOMMENDATION_CATEGORY_SECTION).shouldBe(Condition.visible);
        $(Constants.ENGLISH_CATEGORY_BUTTON).click();
        Thread.sleep(1000);
        assertTrue(WebDriverRunner.url().contains("categories"));
    }

    @Test
    void click_subcategory() throws InterruptedException {
        $(Constants.SUBCATEGORY_ENGLISH_COMMUNICATION).click();
        Thread.sleep(1000);

        assertTrue(WebDriverRunner.url().contains(Constants.SUBCATEGORY_ID_ENGLISH_COMMUNICATION));
    }
}
