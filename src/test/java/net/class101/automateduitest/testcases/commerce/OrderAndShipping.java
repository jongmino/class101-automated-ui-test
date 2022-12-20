package net.class101.automateduitest.testcases.commerce;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.actions.commerce.CheckOrderDetail;
import net.class101.automateduitest.resources.actions.commerce.CheckOrderHistory;
import net.class101.automateduitest.resources.actions.core.LoginAsUserHasKit;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class OrderAndShipping {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.get(LoginAsUserHasKit.class).execute().validate();
    }

    @Test
    void orderHistory() {
        SF.get(CheckOrderHistory.class).execute().validate();
    }

    @Test
    void orderDetail() {
        SF.get(CheckOrderDetail.class).execute().validate();
    }
}
