package net.class101.automateduitest.tests.classmate;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.classmate.ChangeServiceRegionToEN;
import net.class101.automateduitest.resources.testcases.classmate.ChangeServiceRegionJP;
import net.class101.automateduitest.resources.testcases.core.LoginAsNonSubscriber;
import net.class101.automateduitest.resources.testcases.core.Logout;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class MyPageServiceRegion {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        SF.get(LoginAsNonSubscriber.class).proceed();
    }

    @AfterAll
    void tearDown() {
        SF.get(Logout.class).proceed();
    }

    @Test
    void verifyChangingServiceRegion() {
        SF.get(ChangeServiceRegionToEN.class).proceed().validate();
        SF.get(ChangeServiceRegionJP.class).proceed().validate();
    }
}
