package net.class101.automateduitest.testSuites.commerce;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.commerce.CheckFreeTrial;
import net.class101.automateduitest.scenarios.core.LoginAsNewUser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FreeTrial {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.getInstance(LoginAsNewUser.class).proceed().validate();
    }

    @Test
    void freeTrial() {
        SF.getInstance(CheckFreeTrial.class).proceed().validate();
    }
}
