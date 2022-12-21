package net.class101.automateduitest.resources.testcases.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.common.Properties;
import net.class101.automateduitest.resources.common.PropertyLoader;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.plus.AllLoginPage;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.LoginPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import java.util.Map;

import static net.class101.automateduitest.resources.common.Utils.waitFor;

/**
 * @설명: 미구독 유저로 로그인이 정상적으로 되는지를 테스트 한다.
 * @분류: 로그인 - 미구독 유저
 * @테스트 선행조건:
 * 1) 홈페이지를 연다
 */
public class LoginAsNonSubscriber implements TestCase {

    @Override
    public TestCase proceed() {
        //유저 네비게이션 우상단 로그인 버튼 클릭
        waitFor(Home.loginButton()).click();
        //다른 방법으로 로그인 버튼 클릭
        waitFor(LoginPage.allLoginButton()).click();

        final Map<String, Properties.Account> accounts = PropertyLoader.getProperties().accounts;
        final String plusNonSubscriberId = accounts.get("plusNonSubscriber").id;
        final String plusNonSubscriberPw = accounts.get("plusNonSubscriber").pw;
        AllLoginPage.Actions.login(plusNonSubscriberId, plusNonSubscriberPw);
        return this;
    }

    @Override
    public void validate() {
        waitFor(Home.userProfileImg()).shouldBe(Condition.visible).hover();
    }
}
