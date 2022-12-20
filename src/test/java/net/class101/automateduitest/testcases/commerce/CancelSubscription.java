package net.class101.automateduitest.testcases.commerce;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.actions.commerce.CheckCancelSubscription;
import net.class101.automateduitest.resources.actions.core.LoginAsYearlySubscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CancelSubscription {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.get(LoginAsYearlySubscriber.class).execute().validate();
    }

    @Test
    void cancelSubscription() {
        SF.get(CheckCancelSubscription.class).execute().validate();
    }
}
