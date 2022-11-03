package net.class101.automateduitest.Website;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static net.class101.automateduitest.Common.Behaviors.openUrl;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.Constants;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HeaderSearchBar {

    @BeforeAll
    static void beforeAll() {
        openUrl(Constants.STAGING_URL);
    }

    @AfterAll
    static void afterAll() {
        closeWebDriver();
    }

    @Test
    void search_panel_is_visible() throws InterruptedException {
        $(Constants.SEARCH_BAR).click();
        $(Constants.SEARCH_PANEL_TITLE).shouldBe(Condition.visible);
        $(Constants.SEARCH_BAR_INPUT_AFTER_CLICK).sendKeys("공예");
        $(Constants.SEARCH_BAR_INPUT_AFTER_CLICK).pressEnter();
        Thread.sleep(2000);
        $(Constants.SEARCH_RESULT_CRAFTS_CATEGORY).shouldBe(Condition.visible);
    }
}
