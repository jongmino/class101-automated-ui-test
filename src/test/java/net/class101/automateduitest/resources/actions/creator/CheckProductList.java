package net.class101.automateduitest.resources.actions.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 크리에이터 센터 - 상품 - 리스트 - 리스트 목록 확인
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 상품을 보유한 계정으로 로그인한다
 */
public class CheckProductList implements TestAction {

    @Override
    public TestAction execute() {
        CreatorProductPage.Actions.openPage();
        return this;
    }

    @Override
    public void validate() {
        CreatorProductPage.Elements.productList().shouldBe(Condition.visible);
    }
}