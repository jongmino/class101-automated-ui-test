package net.class101.automateduitest.scenarios.website;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 * Login Needed
 * 추천 클래스 섹션 검증
 * Todo(boulder): 새로고침을 해도 추천클래스 실시간 반영이 안되는 경우가 많아서 검증 보류
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
