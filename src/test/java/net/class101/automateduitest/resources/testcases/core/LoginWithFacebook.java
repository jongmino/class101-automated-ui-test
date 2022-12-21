package net.class101.automateduitest.resources.testcases.core;

import net.class101.automateduitest.resources.common.PropertyLoader;
import net.class101.automateduitest.resources.pages.plus.AllLoginPage;
import net.class101.automateduitest.resources.pages.plus.FaceBookLoginPage;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.LoginPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.Assert.assertTrue;

import static com.codeborne.selenide.Condition.text;

/**
 * @설명: 페이스북 유저로 로그인한다
 * @분류: 로그인 - 페이스북 유저
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 */
public class LoginWithFacebook implements TestCase {

    @Override
    public TestCase proceed() {
        Home.loginButton().click();
        LoginPage.allLoginButton().click();
        AllLoginPage.loginWithFaceBookButton().click();

        final String FACEBOOK_USER_ID = PropertyLoader.getProperties().accounts.get("plusFacebook").id;
        final String FACEBOOK_PASSWORD = PropertyLoader.getProperties().accounts.get("plusFacebook").pw;
        FaceBookLoginPage.emailInputElement().sendKeys(FACEBOOK_USER_ID);
        FaceBookLoginPage.emailInputElement().shouldHave(text(FACEBOOK_USER_ID));
        FaceBookLoginPage.passwordInputElement().sendKeys(FACEBOOK_PASSWORD);
        FaceBookLoginPage.passwordInputElement().shouldHave(text(FACEBOOK_PASSWORD));
        FaceBookLoginPage.loginButton().click();

        return this;
    }

    @Override
    public void validate() {
        assertTrue(Home.userProfileImg().exists());
    }
}
