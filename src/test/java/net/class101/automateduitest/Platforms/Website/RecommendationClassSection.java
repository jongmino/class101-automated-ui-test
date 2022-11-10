package net.class101.automateduitest.Platforms.Website;

import net.class101.automateduitest.Behaviors.Core;
import net.class101.automateduitest.Behaviors.Website;
import net.class101.automateduitest.Pages.Plus.Home;
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
        Home.openPage();
    }

    @Test
    @Order(1)
    void recommendation_class_section_is_visible() {
        Core.loginWithNonSubscribedUser();
        Website.verifyRecommendedClassSection();
    }
}
