package net.class101.automateduitest.testSuites.creator;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.scenarios.creator.CheckStockTab;
import net.class101.automateduitest.scenarios.creator.LoginAsCreatorHasClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Stock {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 20000;
        CreatorHome.Actions.openPage();
        LoginAsCreatorHasClass.getInstance().proceed().validate();
    }

    @Test
    void stockPage() {
        CheckStockTab.getInstance().proceed().validate();
    }
}
