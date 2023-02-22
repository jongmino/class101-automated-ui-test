package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명: 크리에이터 센터로 로그인 후 서비스 지역을 JP, EN, KR로 변경되는지 체크한다.
 * @분류: 크리에이터 센터 - 지역 설정 - 지역 변경 후 크리에이터 가이드 센터로 진입하여 국가 별 URL 확인
 * @테스트_선행조건:
 *  1) 크리에이터 홈으로 진입한다
 */

public class CheckServiceRegionKr implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorHome.profileImg().click();
        CreatorHome.serviceRegionSettingButtonEn().shouldBe(Condition.visible).click();
        CreatorHome.serviceRegionKr().shouldBe(Condition.visible).click();
        CreatorHome.serviceRegionSaveButtonEn().click();
        CreatorHome.serviceRegionToastAlertEn().shouldBe(Condition.visible);
        CreatorProductPage.creatorCenterLogo().click(); // EN에서는 간헐적으로 서비스 지역 변경이 안될 때 refresh를 해도 서비스 지역이 변경이 안되고 크센 로고를 클릭해야지만 변경이 되어서 크센 로고를 클릭하도록 함.
        CreatorHome.serviceRegionGuideCenterKr().shouldBe(Condition.visible).click();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(Utils.urlContains("ko"));

    }

}
