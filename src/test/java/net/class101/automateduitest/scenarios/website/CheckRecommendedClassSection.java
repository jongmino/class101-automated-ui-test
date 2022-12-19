package net.class101.automateduitest.scenarios.website;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 * 구독 메인 - 클래스 섹션 - 취향 추천 클래스 - 섹션 노출 확인
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 로그인한다
 */
public class CheckRecommendedClassSection implements TestScenario {

    @Override
    public TestScenario proceed() {
        Home.Actions.openPage();
        return this;
    }

    @Override
    public void validate() {
        Home.Elements.recommendedClassSectionTitle().shouldBe(Condition.visible);
    }
}
