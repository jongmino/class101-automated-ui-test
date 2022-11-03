package net.class101.automateduitest.Website;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static net.class101.automateduitest.Common.Behaviors.openUrl;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.Constants;
import net.class101.automateduitest.Common.Behaviors;
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
public class RecommendationClassSection {

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
    void recommendation_class_section_is_visible() {
        Behaviors.loginWithEmail(Constants.CLASS101_USER_ID, Constants.CLASS101_PASSWORD);
        $(Constants.RECOMMENDATION_SECTION).shouldBe(Condition.visible);
    }

//    @Test
//    @Order(2)
//    void update_recommendation_section() {
//        SelenideElement firstRecommendationClassTitle = $(Constants.FIRST_RECOMMENDATION_CLASS_TITLE);
//        String firstRecommendationClassTitleBeforeChange = firstRecommendationClassTitle.getText();
//
//        $(Constants.FIRST_ITEM_OF_COOKING_SECTION).click();
//        Selenide.refresh();
//        $(Constants.USER_NAVIGATION_LOGO).click();
//
//        String firstRecommendationClassTitleAfterChange = firstRecommendationClassTitle.getText();
//
//        $(Constants.FIRST_ITEM_OF_TRENDING_NOW).click();
//        Selenide.refresh();
//        $(Constants.USER_NAVIGATION_LOGO).click();
//
//        assertNotEquals(firstRecommendationClassTitleBeforeChange, firstRecommendationClassTitleAfterChange, "recommendation classes should not be same after viewing PDP page");
//    }
}
