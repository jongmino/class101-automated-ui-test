package net.class101.automateduitest.tests.commerce;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.commerce.CheckRefundSubscription;
import net.class101.automateduitest.resources.testcases.core.LoginAsYearlySubscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RefundSubscription {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.get(LoginAsYearlySubscriber.class).proceed().validate();
    }

    @Test
    void refundSubscription() {
        SF.get(CheckRefundSubscription.class).proceed().validate();
    }
}
