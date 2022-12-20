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
 * 로그인 - 연간 구독 유저
 * <p>
 * Prerequisite:
 * 1) 홈페이지를 연다
 */
public class LoginAsYearlySubscriber implements TestCase {

    @Override
    public TestCase proceed() {
        Home.loginButton().click();
        LoginPage.allLoginButton().click();

        final Map<String, Properties.Account> accounts = PropertyLoader.getProperties().accounts;
        final String YEARLY_SUBSCRIBER_USER_ID = accounts.get("plusYearlySubscriber").id;
        final String YEARLY_SUBSCRIBER_PASSWORD = accounts.get("plusYearlySubscriber").pw;
        AllLoginPage.Actions.login(YEARLY_SUBSCRIBER_USER_ID, YEARLY_SUBSCRIBER_PASSWORD);
        return this;
    }

    @Override
    public void validate() {
        Home.userProfileImg().shouldBe(Condition.visible).hover();
    }
}
