package net.class101.automateduitest.resources.testcases.creator;

import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorReferralPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명: 크리에이터 센터에서 '클래스101+ 초대' 메뉴 클릭시 크리에이터 레퍼럴 페이지로 정상적으로 이동되는지 테스트한다
 * @분류: 크리에이터 센터 - 클래스101+ 초대 - 진입 - SNB > 클래스101+ 초대 클릭
 * @테스트_선행조건:
 *  1) 크리에이터 홈으로 진입한다
 *  2) 약관에 동의한 계정으로 로그인한다
 */
public class CheckCreatorReferralTab implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorLeftNavigation.referralTab().click();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(CreatorReferralPage.creatorReferralPageTitle().exists());
    }
}
