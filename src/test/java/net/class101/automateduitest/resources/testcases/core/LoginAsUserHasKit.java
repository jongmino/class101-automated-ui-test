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
 *  로그인 - 키트 주문 이력 보유 유저
 *
 *  Prerequisite:
 *  1) 홈페이지를 연다
 */
public class LoginAsUserHasKit implements TestCase {

    @Override
    public TestCase proceed() {
        Home.loginButton().click();
        LoginPage.allLoginButton().click();

        final Map<String, Properties.Account> accounts = PropertyLoader.getProperties().accounts;
        final String KIT_USER_ID = accounts.get("plusHasKit").id;
        final String KIT_PASSWORD = accounts.get("plusHasKit").pw;
        AllLoginPage.Actions.login(KIT_USER_ID, KIT_PASSWORD);
        return this;
    }

    @Override
    public void validate() {
        Home.userProfileImg().shouldBe(Condition.visible).hover();
    }
}
