package net.class101.automateduitest.tests.commerce;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.commerce.CheckFreeTrial;
import net.class101.automateduitest.resources.testcases.core.LoginAsNewUser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FreeTrial {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.get(LoginAsNewUser.class).proceed().validate();
    }

    @Test
    void freeTrial() {
        SF.get(CheckFreeTrial.class).proceed().validate();
    }
}
