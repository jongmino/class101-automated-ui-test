package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.testcases.TestCase;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명: 크리에이터 센터로 로그인 후 서비스 지역을 JP, EN, KR로 변경되는지 체크한다.
 * @분류: 크리에이터 센터 - 지역 설정 - 지역 변경 후 크리에이터 가이드 센터로 진입하여 국가 별 URL 확인
 * @테스트_선행조건:
 *  1) 크리에이터 홈으로 진입한다
 */

public class CheckServiceRegionJp implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorHome.profileImg().click();
        CreatorHome.serviceRegionSettingButtonKr().shouldBe(Condition.visible).click();
        CreatorHome.serviceRegionJp().shouldBe(Condition.visible).click();
        CreatorHome.serviceRegionSaveButtonKr().click();
        CreatorHome.serviceRegionToastAlertKr().shouldBe(Condition.visible);
        getWebDriver().navigate().refresh(); // 간헐적으로 서비스 지역이 변경되지 않아 refresh를 추가했고 크리에이터 센터 로고를 클릭으로 새로고침읋 하려고 했는데 크센 로고 클릭으로는 작동을 안함..
        CreatorHome.serviceRegionGuideCenterJp().shouldBe(Condition.visible).click();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(Utils.urlContains("ja"));

    }

}
