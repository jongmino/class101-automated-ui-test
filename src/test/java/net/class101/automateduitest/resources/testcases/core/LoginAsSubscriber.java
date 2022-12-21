package net.class101.automateduitest.resources.testcases.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.common.Properties;
import net.class101.automateduitest.resources.common.PropertyLoader;
import net.class101.automateduitest.resources.pages.plus.AllLoginPage;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.LoginPage;
import net.class101.automateduitest.resources.testcases.TestCase;
import java.util.Map;

/**
 * @설명: 클래스 수강 이력이 있는 구독 유저로 로그인한다
 * @분류: 로그인 - 구독 유저 (월간)
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 */
public class LoginAsSubscriber implements TestCase {

    @Override
    public TestCase proceed() {
        Home.loginButton().click();
        LoginPage.allLoginButton().click();

        final Map<String, Properties.Account> accounts = PropertyLoader.getProperties().accounts;
        final String SUBSCRIBED_USER_ID = accounts.get("plusSubscriber").id;
        final String SUBSCRIBED_PASSWORD = accounts.get("plusSubscriber").pw;
        AllLoginPage.Actions.login(SUBSCRIBED_USER_ID, SUBSCRIBED_PASSWORD);
        return this;
    }

    @Override
    public void validate() {
        Home.userProfileImg().shouldBe(Condition.visible).hover();
    }
}
