package net.class101.automateduitest.tests.creator;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.testcases.creator.CheckClassSettlement;
import net.class101.automateduitest.resources.testcases.creator.CheckKitSettlement;
import net.class101.automateduitest.resources.testcases.creator.CheckPlusSettlement;
import net.class101.automateduitest.resources.testcases.creator.LoginAsCreatorHasClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Settlement {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 20000;
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorHasClass.class).proceed().validate();
    }

    @AfterEach
    void tearDown() {
        CreatorHome.Actions.openPage();
    }

    @Test
    void classSettlement() {
        SF.get(CheckClassSettlement.class).proceed().validate();
    }

    @Test
    void plusSettlement() {
        SF.get(CheckPlusSettlement.class).proceed().validate();
    }

    @Test
    void kitSettlement() {
        SF.get(CheckKitSettlement.class).proceed().validate();
    }
}
