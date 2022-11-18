package net.class101.automateduitest.scenarios.website;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.pages.plus.ProductDetailPage;
import net.class101.automateduitest.pages.plus.SubscribePlanPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckSubscriptionPlan implements TestScenario {

    private static CheckSubscriptionPlan instance = null;

    public static CheckSubscriptionPlan getInstance() {
        if(instance == null) {
            instance = new CheckSubscriptionPlan();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {

        try {
            Thread.sleep(2000);

            //(비구독) 구독 시작하기 버튼 클릭
            ProductDetailPage.Elements.startSubscriptionButton().click();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        return this;
    }

    @Override
    public void validate() {

        //플랜 선택 페이지 이동 확인
        SubscribePlanPage.Elements.subscribePlanTitle().shouldBe(Condition.visible);
    }
}
