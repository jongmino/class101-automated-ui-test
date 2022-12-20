package net.class101.automateduitest.testcases.creator;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.actions.creator.CheckOrderAndShippingTab;
import net.class101.automateduitest.resources.actions.creator.CheckPaymentCompleted;
import net.class101.automateduitest.resources.actions.creator.LoginAsCreatorHasClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class OrderAndShippingTab {

    @BeforeAll
    static void beforeAll() {
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorHasClass.class).execute().validate();
    }

    @Test
    void orderAndShippingTab() {
        SF.get(CheckOrderAndShippingTab.class).execute().validate();
        SF.get(CheckPaymentCompleted.class).execute().validate();
    }
}
