package net.class101.automateduitest.resources.actions.classmate;

import static net.class101.automateduitest.common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.ClassmateReferralPage;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 마이페이지 - 메뉴영역 - 각 메뉴 페이지 이동 확인 - 각 메뉴 별 페이지 랜딩 확인 - 친구 초대 메뉴
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 로그인 한다
 */
public class CheckReferralTab implements TestAction {

    @Override
    public TestAction execute() {
        MyPage.Actions.openPage();
        MyPage.Elements.referralTab().click();
        ClassmateReferralPage.Elements.copyReferralLinkButton().shouldBe(Condition.visible);

        return this;
    }

    @Override
    public void validate() {
        assertTrue(urlContains("classmate-referral"));
    }
}
