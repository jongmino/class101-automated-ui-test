package net.class101.automateduitest.tests.commerce;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.commerce.CheckKitPurchase;
import net.class101.automateduitest.resources.testcases.core.LoginAsSubscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BuyKit {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.get(LoginAsSubscriber.class).proceed().validate();
    }

    @Test
    void buyKit() {
        SF.get(CheckKitPurchase.class).proceed().validate();
    }
}
