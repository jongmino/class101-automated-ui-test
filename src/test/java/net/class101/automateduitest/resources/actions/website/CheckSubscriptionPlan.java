package net.class101.automateduitest.resources.actions.website;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.ProductDetailPage;
import net.class101.automateduitest.resources.pages.plus.SelectPlanPage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 구독 메인 - 클래스 섹션 - 큐레이션 컬렉션 - 하단 CTA 버튼 [클래스 101+ 시작하기] 클릭 - 정기결제 구독 플랜 페이지로 이동한다
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 미구독 계정으로 로그인한다
 */
public class CheckSubscriptionPlan implements TestAction {

    @Override
    public TestAction execute() {

        ProductDetailPage.Elements.startSubscriptionButton().shouldBe(Condition.visible).shouldBe(Condition.enabled).click();
        return this;
    }

    @Override
    public void validate() {
        //플랜 선택 페이지 이동 확인
        SelectPlanPage.Elements.subscribePlanTitle().shouldBe(Condition.visible);
    }
}
