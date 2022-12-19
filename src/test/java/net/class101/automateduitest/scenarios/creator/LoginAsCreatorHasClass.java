package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.pages.creatorCenter.CreatorLoginPage;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 * 로그인 - 클래스를 보유한 계정
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 */
public class LoginAsCreatorHasClass implements TestScenario {

    @Override
    public TestScenario proceed() {
        CreatorLoginPage.Actions.loginAsCreatorHasClass();
        return this;
    }

    @Override
    public void validate() {
        CreatorHome.Elements.profileImg().shouldBe(Condition.visible).hover();
    }
}
