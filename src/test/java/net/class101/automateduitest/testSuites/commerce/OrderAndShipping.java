package net.class101.automateduitest.testSuites.commerce;

import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.commerce.CheckOrderHistory;
import net.class101.automateduitest.scenarios.core.LoginAsUserHasKit;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class OrderAndShipping {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        LoginAsUserHasKit.getInstance().proceed().validate();
    }

    @Test
    void orderHistory() {
        CheckOrderHistory.getInstance().proceed().validate();
    }
}
