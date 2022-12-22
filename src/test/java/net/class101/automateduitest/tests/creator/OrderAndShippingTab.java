package net.class101.automateduitest.tests.creator;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.testcases.creator.CheckOrderAndShippingTab;
import net.class101.automateduitest.resources.testcases.creator.CheckPaymentCompleted;
import net.class101.automateduitest.resources.testcases.creator.LoginAsCreatorHasClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class OrderAndShippingTab {

    @BeforeAll
    static void beforeAll() {
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorHasClass.class).proceed();
    }

    @Test
    void orderAndShippingTab() {
        SF.get(CheckOrderAndShippingTab.class).proceed().validate();
        SF.get(CheckPaymentCompleted.class).proceed().validate();
    }
}
