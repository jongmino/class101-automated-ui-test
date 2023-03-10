package net.class101.automateduitest.resources.testcases.core;

import net.class101.automateduitest.resources.common.Properties;
import net.class101.automateduitest.resources.common.PropertyLoader;
import net.class101.automateduitest.resources.pages.plus.AllLoginPage;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.LoginPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * @설명: 미구독 유저로 로그인이 정상적으로 되는지를 테스트 한다.
 * @분류: 로그인 - 미구독 유저
 * @테스트 선행조건:
 *   1) 홈페이지를 연다
 */
public class LoginAsNonSubscriber implements TestCase {

    @Override
    public TestCase proceed() {
        Home.Actions.openPage();
        Home.loginButton().click();
        LoginPage.allLoginButton().click();

        final Map<String, Properties.Account> accounts = PropertyLoader.getProperties().accounts;
        final String plusNonSubscriberId = accounts.get("plusNonSubscriber").id;
        final String plusNonSubscriberPw = accounts.get("plusNonSubscriber").pw;
        AllLoginPage.Actions.login(plusNonSubscriberId, plusNonSubscriberPw);
        Home.footerTermsOfUse();
        return this;
    }

    @Override
    public void validate() {
       assertTrue(Home.footerTermsOfUse().exists());
    }
}
