package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorGuideCenterPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 크리에이터 센터 - 크리에이터 가이드 센터 - 진입 - SNB > 크리에이터 가이드 센터 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 로그인한다
 */
public class CheckCreatorGuideTab implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorLeftNavigation.Elements.creatorGuideTab().shouldBe(Condition.enabled).click();
        return this;
    }

    @Override
    public void validate() {
        CreatorGuideCenterPage.Elements.creatorGuideCenterTitle().shouldBe(Condition.visible);
    }
}
