package net.class101.automateduitest.testSuites.website;

import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.core.LoginAsNonSubscriber;
import net.class101.automateduitest.scenarios.website.CheckRecommendedClassSection;
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
        Home.Actions.openPage();
    }

    @Test
    @Order(1)
    void recommendation_class_section_is_visible() {
        LoginAsNonSubscriber.getInstance().proceed().validate();
        CheckRecommendedClassSection.getInstance().proceed().validate();
    }
}
