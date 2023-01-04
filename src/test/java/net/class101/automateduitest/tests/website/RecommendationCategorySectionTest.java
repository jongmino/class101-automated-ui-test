package net.class101.automateduitest.tests.website;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.resources.common.PropertyLoader;
import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.core.Logout;
import net.class101.automateduitest.resources.testcases.website.CheckRecommendedCategorySection;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class RecommendationCategorySectionTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = PropertyLoader.getProperties().timeout;
        Home.Actions.openPage();
    }

    @Test
    void testRecommendationCategory() {
        SF.get(CheckRecommendedCategorySection.class).proceed().validate();
    }

}
