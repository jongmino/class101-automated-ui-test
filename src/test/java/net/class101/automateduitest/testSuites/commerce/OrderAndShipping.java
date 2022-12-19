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
        SF.get(LoginAsUserHasKit.class).proceed().validate();
    }

    @Test
    void orderHistory() {
        SF.get(CheckOrderHistory.class).proceed().validate();
    }

    @Test
    void orderDetail() {
        SF.get(CheckOrderDetail.class).proceed().validate();
    }
}
