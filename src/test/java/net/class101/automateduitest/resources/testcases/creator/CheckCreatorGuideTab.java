package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorGuideCenterPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명: 크리에이터 센터에서 '크리에이터 가이드 센터' 메뉴 클릭시 '크리에이터 가이드 센터' 페이지로 정상적으로 이동 되는지 테스트한다
 * @분류: 크리에이터 센터 - 크리에이터 가이드 센터 - 진입 - SNB > 크리에이터 가이드 센터 클릭
 * @테스트_선행조건:
 *  1) 크리에이터 홈으로 진입한다
 *  2) 로그인한다
 */
public class CheckCreatorGuideTab implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorLeftNavigation.creatorGuideTab().shouldBe(Condition.enabled).click();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(CreatorGuideCenterPage.creatorGuideCenterTitle().exists());
    }
}
