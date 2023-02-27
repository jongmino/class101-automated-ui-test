package net.class101.automateduitest.tests.creator;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.testcases.creator.*;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ServiceRegionTest {

    @BeforeAll
    static void beforeAll() {
        Utils.setTestConfig();
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorNew.class).proceed();
    }

    @AfterEach
    void afterEach() {
        CreatorHome.Actions.openPage();
    }

    @AfterAll
    static void afterAll() {
        SF.get(LogoutCreatorCenter.class).proceed();
    }

    @Test
    @Order(1)
    void testServiceRegionJp() {
        SF.get(CheckServiceRegionJp.class).proceed().validate();
    }

    @Test
    @Order(2)
    void testServiceRegionEn() {
        SF.get(CheckServiceRegionEn.class).proceed().validate();
    }

    @Test
    @Order(3)
    void testServiceRegionKr() {
        SF.get(CheckServiceRegionEnInKr.class).proceed().validate();
    }
}
