package net.class101.automateduitest.testSuites.commerce;

import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.commerce.CheckKitPurchase;
import net.class101.automateduitest.scenarios.core.LoginAsSubscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BuyKit {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        LoginAsSubscriber.getInstance().proceed().validate();
    }

    @Test
    void buyKit() {
        CheckKitPurchase.getInstance().proceed().validate();
    }
}