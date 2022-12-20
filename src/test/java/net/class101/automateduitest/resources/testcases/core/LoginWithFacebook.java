package net.class101.automateduitest.resources.testcases.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.common.PropertyLoader;
import net.class101.automateduitest.resources.pages.plus.AllLoginPage;
import net.class101.automateduitest.resources.pages.plus.FaceBookLoginPage;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.LoginPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static com.codeborne.selenide.Condition.text;

/**
 *  로그인 - 페이스북 유저
 *
 *  Prerequisite:
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
        Home.userProfileImg().shouldBe(Condition.visible).hover();
    }
}
