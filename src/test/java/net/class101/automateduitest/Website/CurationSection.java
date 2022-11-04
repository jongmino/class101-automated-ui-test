package net.class101.automateduitest.Website;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static net.class101.automateduitest.Common.Behaviors.verifyCurationItemAndClassInformation;
import static net.class101.automateduitest.Common.Behaviors.openUrl;

import net.class101.automateduitest.Constants;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
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
    void curation_section_is_visible() throws InterruptedException {
        verifyCurationItemAndClassInformation();
    }
}
