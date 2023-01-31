package net.class101.automateduitest.resources.testcases.core;

import net.class101.automateduitest.resources.common.Properties;
import net.class101.automateduitest.resources.common.PropertyLoader;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.plus.AllLoginPage;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.LoginPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Map;

/**
 * @설명: 무료체험 이력이 없는 신규 유저로 로그인한다
 * @분류: 로그인 - 신규 유저
 * @테스트_선행조건:
 *   1) 홈페이지를 연다
 */
public class LoginAsNewUser implements TestCase {

    @Override
    public TestCase proceed() {
        Home.loginButton().click();
        LoginPage.allLoginButton().click();
        final Map<String, Properties.Account> accounts = PropertyLoader.getProperties().accounts;
        final String NEW_USER_ID = accounts.get("plusNewUser").id;
        final String NEW_PASSWORD = accounts.get("plusNewUser").pw;
        AllLoginPage.Actions.login(NEW_USER_ID, NEW_PASSWORD);
        Home.trendingNowSectionTitle();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(Home.userProfileImg().exists());
    }
}
