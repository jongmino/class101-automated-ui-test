package net.class101.automateduitest.resources.testcases.creator;

import net.class101.automateduitest.resources.common.Properties;
import net.class101.automateduitest.resources.common.PropertyLoader;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLoginPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명 : 클래스 생성을 위해 크리에이터 계정으로 로그인한다.
 * @분류: 크리에이터 센터 - 크리에이터 계정
 * @테스트_선행조건:
 *  1) 크리에이터 계정으로 로그인한다.
 */
public class LoginAsCreatorUser implements TestCase {

    @Override
    public TestCase proceed() {
        final Map<String, Properties.Account> accounts = PropertyLoader.getProperties().accounts;
        final String email = accounts.get("creatorUser").id;
        final String password = accounts.get("creatorUser").pw;
        CreatorLoginPage.Actions.login(email, password);
        CreatorProductPage.creatorCenterLogo();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(CreatorHome.profileImg().exists());
    }
}
