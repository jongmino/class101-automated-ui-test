package net.class101.automateduitest.Platforms.Website;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static net.class101.automateduitest.Common.Behaviors.openUrl;
import static net.class101.automateduitest.Common.Behaviors.verifyMyClassSection;

import net.class101.automateduitest.Common.Behaviors;
import net.class101.automateduitest.Constants;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MyClassSection {

    @BeforeAll
    static void beforeAll() {
        openUrl(Constants.STAGING_PLUS_HOME_URL);
    }

    @AfterAll
    static void afterAll() {
        closeWebDriver();
    }

    @Test
    void my_class_section_is_visible() {
        Behaviors.loginWithEmail(Constants.MY_CLASS_USER_ID, Constants.MY_CLASS_PASSWORD);
        verifyMyClassSection();
    }
}
