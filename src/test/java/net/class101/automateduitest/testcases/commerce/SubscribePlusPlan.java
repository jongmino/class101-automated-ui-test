package net.class101.automateduitest.testcases.commerce;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.actions.commerce.CheckYearlySubscription;
import net.class101.automateduitest.resources.actions.core.LoginAsNonSubscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SubscribePlusPlan {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.get(LoginAsNonSubscriber.class).execute().validate();
    }

    @Test
    void yearlyPlan() {
        SF.get(CheckYearlySubscription.class).execute().validate();
    }
}
