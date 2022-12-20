package net.class101.automateduitest.testcases.website;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.actions.core.LoginAsNonSubscriber;
import net.class101.automateduitest.resources.actions.website.CheckRecommendedClassSection;
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
        SF.get(LoginAsNonSubscriber.class).execute().validate();
        SF.get(CheckRecommendedClassSection.class).execute().validate();
    }
}