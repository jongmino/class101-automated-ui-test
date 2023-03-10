package net.class101.automateduitest.tests.website;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.website.CheckRecommendedCategorySection;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class RecommendationCategorySectionTest {

    @BeforeAll
    static void beforeAll() {
        Utils.setTestConfig();
        Home.Actions.openPage();
    }

    @Test
    void testRecommendationCategory() {
        SF.get(CheckRecommendedCategorySection.class).proceed().validate();
    }

}
