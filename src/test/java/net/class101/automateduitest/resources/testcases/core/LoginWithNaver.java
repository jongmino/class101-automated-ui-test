package net.class101.automateduitest.resources.testcases.core;

import net.class101.automateduitest.resources.pages.plus.AllLoginPage;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.LoginPage;
import net.class101.automateduitest.resources.pages.plus.NaverLoginPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.Assert.assertTrue;

/**
 * @설명: 네이버 유저로 로그인한다
 * @분류: 로그인 - 네이버 유저
 * @테스트_선행조건: 
 *  1) 홈페이지를 연다
 */
public class LoginWithNaver implements TestCase {

    @Override
    public TestCase proceed() {
        Home.Actions.openPage();
        Home.loginButton().click();
        LoginPage.allLoginButton().click();
        AllLoginPage.loginWithNaverButton().click();
        NaverLoginPage.Actions.defaultLogin();
        Home.trendingNowSectionTitle();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(Home.userProfileImg().exists());
    }
}
