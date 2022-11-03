package net.class101.automateduitest.Website;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static net.class101.automateduitest.Common.Behaviors.openUrl;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.Constants;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class ClassDetailPage {

    @BeforeAll
    static void beforeAll() {
        openUrl(Constants.STAGING_URL);
    }

    @AfterAll
    static void afterAll() {
        closeWebDriver();
    }

    @Test
    void class_information_is_visible() throws InterruptedException {
        $(Constants.FIRST_CURATION_ITEM).click();
        $(Constants.CLASS_INTRODUCTION_TAB_ON_PDP).shouldBe(Condition.visible);
        $(Constants.CREATOR_INTRODUCTION_TAB_ON_PDP).shouldBe(Condition.visible);
    }
}
