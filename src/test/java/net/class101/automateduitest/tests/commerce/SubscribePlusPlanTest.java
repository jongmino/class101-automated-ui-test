package net.class101.automateduitest.tests.commerce;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.commerce.CheckYearlySubscription;
import net.class101.automateduitest.resources.testcases.core.LoginAsNonSubscriber;
import net.class101.automateduitest.resources.testcases.core.Logout;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class SubscribePlusPlanTest {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.get(LoginAsNonSubscriber.class).proceed();
    }

    @AfterAll
    static void afterAll() {
        SF.get(Logout.class).proceed();
    }

    @Test
    void testYearlyPlan() {
        SF.get(CheckYearlySubscription.class).proceed().validate();
    }
}
