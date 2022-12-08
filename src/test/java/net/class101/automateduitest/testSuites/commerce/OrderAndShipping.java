package net.class101.automateduitest.testSuites.commerce;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.commerce.CheckOrderDetail;
import net.class101.automateduitest.scenarios.commerce.CheckOrderHistory;
import net.class101.automateduitest.scenarios.core.LoginAsUserHasKit;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class OrderAndShipping {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.getInstance(LoginAsUserHasKit.class).proceed().validate();
    }

    @Test
    void orderHistory() {
        SF.getInstance(CheckOrderHistory.class).proceed().validate();
    }

    @Test
    void orderDetail() {
        SF.getInstance(CheckOrderDetail.class).proceed().validate();
    }
}
