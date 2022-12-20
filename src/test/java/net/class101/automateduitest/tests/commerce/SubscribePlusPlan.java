package net.class101.automateduitest.tests.commerce;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.commerce.CheckYearlySubscription;
import net.class101.automateduitest.resources.testcases.core.LoginAsNonSubscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SubscribePlusPlan {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.get(LoginAsNonSubscriber.class).proceed().validate();
    }

    @Test
    void yearlyPlan() {
        SF.get(CheckYearlySubscription.class).proceed().validate();
    }
}
