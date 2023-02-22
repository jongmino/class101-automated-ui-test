package net.class101.automateduitest.tests.creator;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.testcases.creator.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ServiceRegionJpTest {

    @BeforeAll
    static void beforeAll() {
        Utils.setTestConfig();
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorNew.class).proceed();
    }

    @AfterEach // 서비스 지역을 KR로 변경하는 케이스 추가
    void afterEach() {
        CreatorHome.Actions.openPage();
        SF.get(CheckServiceRegionKr.class).proceed();
        getWebDriver().navigate().refresh();
    }

    @AfterAll
    static void afterAll() {
        SF.get(LogoutCreatorCenter.class).proceed();
    }

    @Test
    void testServiceRegionJp() {
        SF.get(CheckServiceRegionJp.class).proceed().validate();
    }

}
