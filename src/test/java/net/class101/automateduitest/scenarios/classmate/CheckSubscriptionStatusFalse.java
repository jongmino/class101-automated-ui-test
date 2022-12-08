package net.class101.automateduitest.scenarios.classmate;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckSubscriptionStatusFalse implements TestScenario {

    @Override
    public TestScenario proceed() {
        //유저 네비게이션 프로필 이미지 클릭
        MyPage.Actions.openPage();
        return this;
    }

    @Override
    public void validate() {
        //구독 탭 확인
        MyPage.Elements.subscriptionStatusFalse().shouldBe(Condition.visible);
    }
}
