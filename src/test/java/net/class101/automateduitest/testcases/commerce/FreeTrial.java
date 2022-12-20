package net.class101.automateduitest.testcases.commerce;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.actions.commerce.CheckFreeTrial;
import net.class101.automateduitest.resources.actions.core.LoginAsNewUser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FreeTrial {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.get(LoginAsNewUser.class).execute().validate();
    }

    @Test
    void freeTrial() {
        SF.get(CheckFreeTrial.class).execute().validate();
    }
}
