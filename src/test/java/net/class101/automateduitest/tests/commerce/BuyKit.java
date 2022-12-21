package net.class101.automateduitest.tests.commerce;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.commerce.CheckKitPurchase;
import net.class101.automateduitest.resources.testcases.core.LoginAsSubscriber;
import net.class101.automateduitest.resources.testcases.core.Logout;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BuyKit {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.get(LoginAsSubscriber.class).proceed();
    }

    @AfterEach
    void tearDown() {
        SF.get(Logout.class).proceed();
    }

    @Test
    void buyKit() {
        SF.get(CheckKitPurchase.class).proceed().validate();
    }
}
