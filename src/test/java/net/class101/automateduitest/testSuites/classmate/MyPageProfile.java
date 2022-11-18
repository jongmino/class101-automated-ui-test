package net.class101.automateduitest.testSuites.classmate;

import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.classmate.CheckCashTab;
import net.class101.automateduitest.scenarios.core.LoginAsNonSubscriber;
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
        LoginAsNonSubscriber.getInstance().proceed().validate();
        CheckCashTab.getInstance().proceed().validate();
    }
}
