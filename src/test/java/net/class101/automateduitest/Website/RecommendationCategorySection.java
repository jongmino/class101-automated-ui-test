package net.class101.automateduitest.Website;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
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
        open(Constants.STAGING_URL);
        Configuration.timeout = 20000;
    }

    @AfterAll
    static void afterAll() {
        Selenide.closeWebDriver();
    }

    @Test
    void recommendation_category() throws InterruptedException {
        $(Constants.RECOMMENDATION_CATEGORY_SECTION).shouldBe(Condition.visible);
        $(Constants.ENGLISH_CATEGORY_BUTTON).click();
        Thread.sleep(1000);
        assertTrue(WebDriverRunner.url().contains("categories"));
    }
}
