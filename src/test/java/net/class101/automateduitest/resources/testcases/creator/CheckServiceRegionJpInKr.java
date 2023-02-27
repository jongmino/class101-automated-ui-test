package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.testcases.TestCase;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * @설명: 서비스 지역이 JP인 상태에서 KR로 변경한다.
 * @분류: 크리에이터 센터 - 서비스 지역 JP - 서비스 지역을 KR로 변경
 * @테스트_선행조건:
 *  1) 서비스 지역이 JP인 상태에서 실행한다.
 */

public class CheckServiceRegionJpInKr implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorHome.profileImg().click();
        CreatorHome.serviceRegionSettingButton().click();
        CreatorHome.serviceRegionKr().click();
        CreatorHome.serviceRegionSaveButton().click();
        Selenide.refresh();
        return this;
    }

    @Override
    public void validate() {

    }

}
