package net.class101.automateduitest.resources.actions.website;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 구독 메인 - 클래스 섹션 - 취향 추천 클래스 - 섹션 노출 확인
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 로그인한다
 */
public class CheckRecommendedClassSection implements TestAction {

    @Override
    public TestAction execute() {
        Home.Actions.openPage();
        return this;
    }

    @Override
    public void validate() {
        Home.Elements.recommendedClassSectionTitle().shouldBe(Condition.visible);
    }
}