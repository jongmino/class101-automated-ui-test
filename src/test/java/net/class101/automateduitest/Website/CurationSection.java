package net.class101.automateduitest.Website;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static net.class101.automateduitest.Common.Behaviors.openUrl;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.Common.Behaviors;
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
public class CurationSection {

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
    void curation_section_is_visible() {
        Behaviors.loginWithEmail(Constants.CLASS101_USER_ID, Constants.CLASS101_PASSWORD);
        $(Constants.FIRST_CURATION_ITEM).shouldBe(Condition.visible);
    }

    @Test
    @Order(2)
    void go_into_curation_detail_page() {
        $(Constants.FIRST_CURATION_ITEM).click();
        $(Constants.CLASS101_PLUS_SUBSCRIBE_BUTTON).click();
        $(Constants.SUBSCRIPTION_PLAN_TITLE).shouldBe(Condition.visible);
    }
}
