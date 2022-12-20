package net.class101.automateduitest.resources.testcases.classmate;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLoginPage;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 마이페이지 - 메뉴영역 - 각 메뉴 페이지 이동 확인 - 각 메뉴 별 페이지 랜딩 확인 - 크리에이터 센터 메뉴
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 로그인 한다
 */
public class CheckCreatorCenterTab implements TestCase {

    @Override
    public TestCase proceed() {
        MyPage.Actions.openPage();
        MyPage.Elements.creatorCenterTab().click();

        return this;
    }

    @Override
    public void validate() {
        CreatorLoginPage.Elements.emailInputElement().shouldBe(Condition.visible);
    }
}
