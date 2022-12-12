package net.class101.automateduitest.testSuites.commerce;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.commerce.CheckRefundSubscription;
import net.class101.automateduitest.scenarios.core.LoginAsYearlySubscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RefundSubscription {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.getInstance(LoginAsYearlySubscriber.class).proceed().validate();
    }

    @Test
    void refundSubscription() {
        SF.getInstance(CheckRefundSubscription.class).proceed().validate();
    }
}