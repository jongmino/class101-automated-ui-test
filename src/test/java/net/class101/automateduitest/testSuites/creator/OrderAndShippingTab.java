package net.class101.automateduitest.testSuites.creator;

import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.scenarios.creator.CheckOrderAndShippingTab;
import net.class101.automateduitest.scenarios.creator.CheckPaymentCompleted;
import net.class101.automateduitest.scenarios.creator.LoginAsCreatorHasClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class OrderAndShippingTab {

    @BeforeAll
    static void beforeAll() {
        CreatorHome.Actions.openPage();
        LoginAsCreatorHasClass.getInstance().proceed().validate();
    }

    @Test
    void orderAndShippingTab() {
        CheckOrderAndShippingTab.getInstance().proceed().validate();
        CheckPaymentCompleted.getInstance().proceed().validate();
    }
}
