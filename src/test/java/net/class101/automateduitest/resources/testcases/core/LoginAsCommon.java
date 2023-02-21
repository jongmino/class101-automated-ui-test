package net.class101.automateduitest.resources.testcases.core;

import net.class101.automateduitest.resources.common.Properties;
import net.class101.automateduitest.resources.common.PropertyLoader;
import net.class101.automateduitest.resources.pages.plus.AllLoginPage;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.LoginPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명: 닉네임 변경, 프로필 이미지 변경에 사용할 공통 계정이며, 구독/비구독 계정 여부와 관계 없이 다른 쪽에서도 사용할 수 있도록 만들었습니다.
 * @분류: 로그인 - 공통 계정.
 * @테스트_선행조건:
 *  1) 구독 홈으로 진입한다.
 */

public class LoginAsCommon implements TestCase {
    @Override
    public TestCase proceed() {
        Home.Actions.openPage();
        Home.loginButton().click(); //유저 네비게이션 우상단 로그인 버튼 클릭
        LoginPage.allLoginButton().click(); //다른 방법으로 로그인 버튼 클릭
        final Map<String, Properties.Account> accounts = PropertyLoader.getProperties().accounts;
        final String commonUserId = accounts.get("commonUser").id;
        final String commonUserPw = accounts.get("commonUser").pw;
        AllLoginPage.Actions.login(commonUserId, commonUserPw);
        Home.trendingNowSectionTitle();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(Home.userProfileImg().exists());
    }
}
