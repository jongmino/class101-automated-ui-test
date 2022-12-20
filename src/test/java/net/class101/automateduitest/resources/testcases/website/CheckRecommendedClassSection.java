package net.class101.automateduitest.resources.testcases.website;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 구독 메인 - 클래스 섹션 - 취향 추천 클래스 - 섹션 노출 확인
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 로그인한다
 */
public class CheckRecommendedClassSection implements TestCase {

    @Override
    public TestCase proceed() {
        Home.Actions.openPage();
        return this;
    }

    @Override
    public void validate() {
        Home.recommendedClassSectionTitle().shouldBe(Condition.visible);
    }
}
