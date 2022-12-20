package net.class101.automateduitest.resources.actions.classmate;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 마이페이지 - 구독 - 구독 상태 확인 - 계정 상태에 맞는 구독 상태가 표기된다 - 구독
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 로그인 한다
 */
public class CheckSubscriptionStatusTrue implements TestAction {

    @Override
    public TestAction execute() {
        //유저 네비게이션 프로필 이미지 클릭
        MyPage.Actions.openPage();
        return this;
    }

    @Override
    public void validate() {
        //구독 탭 확인
        MyPage.Elements.subscriptionStatusTrue().shouldBe(Condition.visible);
    }
}