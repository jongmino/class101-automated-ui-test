package net.class101.automateduitest.resources.actions.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.AllLoginPage;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.LoginPage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * @설명: 미구독 유저로 로그인이 정상적으로 되는지를 테스트 한다.
 * @분류: 로그인 - 미구독 유저
 * @테스트 선행조건:
 *   1) 홈페이지를 연다
 */
public class LoginAsNonSubscriber implements TestAction {

    @Override
    public TestAction execute() {
        Home.Actions.openPage();
        //유저 네비게이션 우상단 로그인 버튼 클릭
        Home.Elements.loginButton().click();
        //다른 방법으로 로그인 버튼 클릭
        LoginPage.Elements.allLoginButton().click();
        AllLoginPage.Actions.loginAsNonSubscriber();
        return this;
    }

    @Override
    public void validate() {
        Home.Elements.userProfileImg().shouldBe(Condition.visible).hover();
    }
}
