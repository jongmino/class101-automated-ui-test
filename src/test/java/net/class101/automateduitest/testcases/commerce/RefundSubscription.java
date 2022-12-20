package net.class101.automateduitest.testcases.commerce;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.actions.commerce.CheckRefundSubscription;
import net.class101.automateduitest.resources.actions.core.LoginAsYearlySubscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RefundSubscription {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.get(LoginAsYearlySubscriber.class).execute().validate();
    }

    @Test
    void refundSubscription() {
        SF.get(CheckRefundSubscription.class).execute().validate();
    }
}
