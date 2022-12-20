package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.common.Properties;
import net.class101.automateduitest.common.PropertyLoader;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLoginPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import java.util.Map;

/**
 * 로그인 - 클래스를 보유한 계정
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 */
public class LoginAsCreatorHasClass implements TestCase {

    @Override
    public TestCase proceed() {
        final Map<String, Properties.Account> accounts = PropertyLoader.getProperties().accounts;
        final String email = accounts.get("creatorHasClass").id;
        final String password = accounts.get("creatorHasRevenue").pw;
        CreatorLoginPage.Elements.emailInputElement().sendKeys(email);
        CreatorLoginPage.Elements.passwordInputElement().sendKeys(password);
        CreatorLoginPage.Elements.loginButtonElement().click();
        return this;
    }

    @Override
    public void validate() {
        CreatorHome.Elements.profileImg().shouldBe(Condition.visible).hover();
    }
}
