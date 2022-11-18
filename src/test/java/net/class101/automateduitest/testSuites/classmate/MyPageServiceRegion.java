package net.class101.automateduitest.testSuites.classmate;

import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.classmate.ChangeServiceRegionEN;
import net.class101.automateduitest.scenarios.classmate.ChangeServiceRegionJP;
import net.class101.automateduitest.scenarios.core.LoginAsNonSubscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class MyPageServiceRegion {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
    }

    @Test
    void verifyChangingServiceRegion() throws InterruptedException {
        LoginAsNonSubscriber.getInstance().proceed().validate();
        ChangeServiceRegionEN.getInstance().proceed().validate();
        ChangeServiceRegionJP.getInstance().proceed().validate();
    }
}