package net.class101.automateduitest.tests.creator;

import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.testcases.creator.*;
import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ServiceRegionEnTest {

    @BeforeAll
    static void beforeAll() {
        Utils.setTestConfig();
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorNew.class).proceed();
    }

    @AfterEach // 서비스 지역을 KR로 변경하는 케이스 추가
    void afterEach() {
        CreatorHome.Actions.openPage();
        SF.get(CheckServiceRegionEnInKr.class).proceed();
        Selenide.refresh();
    }

    @AfterAll
    static void afterAll() {
        SF.get(LogoutCreatorCenterGlobal.class).proceed();
    }

    @Test
    void testServiceRegionJp() {
        SF.get(CheckServiceRegionEn.class).proceed().validate();
    }

}
