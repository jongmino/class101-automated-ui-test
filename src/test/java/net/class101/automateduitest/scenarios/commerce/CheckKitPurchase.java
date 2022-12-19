package net.class101.automateduitest.scenarios.commerce;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.common.Utils;
import net.class101.automateduitest.pages.plus.ProductDetailPage;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 * 커머스 - 준비물 구매하기 - 진입 - 클래스에 준비물 키트가 있을 경우 - [준비물 구매하기] 버튼 클릭
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 구독 계정으로 로그인 한다
 */
public class CheckKitPurchase implements TestScenario {

    @Override
    public TestScenario proceed() {
        ProductDetailPage.Actions.openKitPage();
        ProductDetailPage.Elements.buyKitButton().shouldBe(Condition.visible).click();
        Selenide.switchTo().window(1);

        return this;
    }

    @Override
    public void validate() {
        assertTrue(Utils.urlContains("kits"));
        Selenide.closeWindow();
        Selenide.switchTo().window(0);
    }
}
