package net.class101.automateduitest.resources.actions.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLoginPage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 로그인 - 클래스 101+ 정산 내역을 보유한 계정
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 */
public class LoginAsCreatorHasRevenue implements TestAction {

    @Override
    public TestAction execute() {
        CreatorLoginPage.Actions.loginAsCreatorHasRevenue();
        return this;
    }

    @Override
    public void validate() {
        CreatorHome.Elements.profileImg().shouldBe(Condition.visible).hover();
    }
}
