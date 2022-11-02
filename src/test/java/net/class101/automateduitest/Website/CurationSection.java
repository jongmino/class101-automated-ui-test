package net.class101.automateduitest.Website;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import net.class101.automateduitest.Common.Behaviors;
import net.class101.automateduitest.Constants;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
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
        open(Constants.STAGING_URL);
        Configuration.timeout = 10000;
    }

    @AfterAll
    static void afterAll() {
        Selenide.closeWebDriver();
    }

    @Test
    @Order(1)
    void curation_section_is_visible() {
        Behaviors.loginWithEmail();
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
