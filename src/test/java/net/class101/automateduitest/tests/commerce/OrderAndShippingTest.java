package net.class101.automateduitest.tests.commerce;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.commerce.CheckOrderDetail;
import net.class101.automateduitest.resources.testcases.commerce.CheckOrderHistory;
import net.class101.automateduitest.resources.testcases.core.LoginAsUserHasKit;
import net.class101.automateduitest.resources.testcases.core.Logout;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class OrderAndShippingTest {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.get(LoginAsUserHasKit.class).proceed();
    }

    @AfterAll
    static void afterAll() {
        SF.get(Logout.class).proceed();
    }

    @Test
    void testOrderHistory() {
        SF.get(CheckOrderHistory.class).proceed().validate();
    }

    @Test
    void testOrderDetail() {
        SF.get(CheckOrderDetail.class).proceed().validate();
    }
}
