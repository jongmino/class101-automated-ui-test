package net.class101.automateduitest.resources.testcases.creator;

import net.class101.automateduitest.resources.common.Properties;
import net.class101.automateduitest.resources.common.PropertyLoader;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLoginPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.Assert.assertTrue;

import java.util.Map;

/**
 * @설명: 클래스를 보유한 크리에이터 계정으로 로그인한다
 * @분류: 로그인 - 클래스를 보유한 계정
 * @테스트_선행조건:
 *  1) 크리에이터 홈으로 진입한다
 */
public class LoginAsCreatorHasClass implements TestCase {

    @Override
    public TestCase proceed() {
        final Map<String, Properties.Account> accounts = PropertyLoader.getProperties().accounts;
        final String email = accounts.get("creatorHasClass").id;
        final String password = accounts.get("creatorHasRevenue").pw;
        CreatorLoginPage.Actions.login(email, password);
        return this;
    }

    @Override
    public void validate() {
        assertTrue(CreatorHome.profileImg().exists());
    }
}
