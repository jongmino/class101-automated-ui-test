package net.class101.automateduitest.resources.testcases.core;

import net.class101.automateduitest.resources.common.Properties;
import net.class101.automateduitest.resources.common.PropertyLoader;
import net.class101.automateduitest.resources.pages.plus.AllLoginPage;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.LoginPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Map;


/**
 * @설명: 연간 구독 중인 유저로 로그인한다
 * @분류: 로그인 - 연간 구독 유저
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
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
        Home.footerTermsOfUse();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(Home.userProfileImg().exists());
    }
}
