package net.class101.automateduitest.resources.testcases.internaltest;

import net.class101.automateduitest.resources.common.Properties;
import net.class101.automateduitest.resources.common.PropertyLoader;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLoginPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명 : 클래스 생성을 위해 어드민 권한 계정으로 로그인한다.
 * @분류: 어드민 - 어드민 권한 계정
 * @테스트_선행조건:
 *  1) 어드민 권한이 있는 계정으로 로그인한다.
 */

public class LoginAsAdminUserInAdmin implements TestCase {

    @Override
    public TestCase proceed() {
        final Map<String, Properties.Account> accounts = PropertyLoader.getProperties().accounts;
        final String email = accounts.get("creatorAdminUser").id;
        final String password = accounts.get("creatorAdminUser").pw;
        CreatorLoginPage.Actions.login(email, password);
        //CreatorProductPage.creatorCenterLogo();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(Utils.urlContains("products"));
    }
}
