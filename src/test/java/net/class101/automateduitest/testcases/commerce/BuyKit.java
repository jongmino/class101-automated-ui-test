package net.class101.automateduitest.testcases.commerce;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.actions.commerce.CheckKitPurchase;
import net.class101.automateduitest.resources.actions.core.LoginAsSubscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BuyKit {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.get(LoginAsSubscriber.class).execute().validate();
    }

    @Test
    void buyKit() {
        SF.get(CheckKitPurchase.class).execute().validate();
    }
}
