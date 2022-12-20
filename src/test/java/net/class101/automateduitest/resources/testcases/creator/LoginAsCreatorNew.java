package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.common.Properties;
import net.class101.automateduitest.resources.common.PropertyLoader;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLoginPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import java.util.Map;

/**
 * 로그인 - 크리에이터 신규 계정
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 */
public class LoginAsCreatorNew implements TestCase {

    @Override
    public TestCase proceed() {
        final Map<String, Properties.Account> accounts = PropertyLoader.getProperties().accounts;
        final String email = accounts.get("creatorNew").id;
        final String password = accounts.get("creatorNew").pw;
        CreatorLoginPage.Actions.login(email, password);
        return this;
    }

    @Override
    public void validate() {
        CreatorHome.profileImg().shouldBe(Condition.visible).hover();
    }
}
