package net.class101.automateduitest.testcases.creator;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.actions.creator.CheckStockTab;
import net.class101.automateduitest.resources.actions.creator.LoginAsCreatorHasClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Stock {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 20000;
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorHasClass.class).execute().validate();
    }

    @Test
    void stockPage() {
        SF.get(CheckStockTab.class).execute().validate();
    }
}
