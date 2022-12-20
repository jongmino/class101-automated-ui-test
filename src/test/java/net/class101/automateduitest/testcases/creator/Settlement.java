package net.class101.automateduitest.testcases.creator;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.actions.creator.CheckClassSettlement;
import net.class101.automateduitest.resources.actions.creator.CheckKitSettlement;
import net.class101.automateduitest.resources.actions.creator.CheckPlusSettlement;
import net.class101.automateduitest.resources.actions.creator.LoginAsCreatorHasClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Settlement {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 20000;
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorHasClass.class).execute().validate();
    }

    @AfterEach
    void tearDown() {
        CreatorHome.Actions.openPage();
    }

    @Test
    void classSettlement() {
        SF.get(CheckClassSettlement.class).execute().validate();
    }

    @Test
    void plusSettlement() {
        SF.get(CheckPlusSettlement.class).execute().validate();
    }

    @Test
    void kitSettlement() {
        SF.get(CheckKitSettlement.class).execute().validate();
    }
}
