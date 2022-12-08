package net.class101.automateduitest.testSuites.creator;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.scenarios.creator.CheckClassSettlement;
import net.class101.automateduitest.scenarios.creator.CheckKitSettlement;
import net.class101.automateduitest.scenarios.creator.CheckPlusSettlement;
import net.class101.automateduitest.scenarios.creator.LoginAsCreatorHasClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Settlement {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 20000;
        CreatorHome.Actions.openPage();
        SF.getInstance(LoginAsCreatorHasClass.class).proceed().validate();
    }

    @AfterEach
    void tearDown() {
        CreatorHome.Actions.openPage();
    }

    @Test
    void classSettlement() {
        SF.getInstance(CheckClassSettlement.class).proceed().validate();
    }

    @Test
    void plusSettlement() {
        SF.getInstance(CheckPlusSettlement.class).proceed().validate();
    }

    @Test
    void kitSettlement() {
        SF.getInstance(CheckKitSettlement.class).proceed().validate();
    }
}
