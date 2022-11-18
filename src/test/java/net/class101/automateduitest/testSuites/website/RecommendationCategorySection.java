package net.class101.automateduitest.testSuites.website;

import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.website.CheckRecommendedCategorySection;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class RecommendationCategorySection {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
    }

    @Test
    void recommendation_category() {
        CheckRecommendedCategorySection.getInstance().proceed().validate();
    }

}
