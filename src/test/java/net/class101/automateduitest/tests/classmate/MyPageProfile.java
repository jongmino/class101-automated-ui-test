package net.class101.automateduitest.tests.classmate;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.classmate.CheckCashTab;
import net.class101.automateduitest.resources.testcases.core.LoginAsNonSubscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class MyPageProfile {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
    }

    @Test
    void verifyCashTab() {
        SF.get(LoginAsNonSubscriber.class).proceed().validate();
        SF.get(CheckCashTab.class).proceed().validate();
    }
}
