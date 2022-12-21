package net.class101.automateduitest.resources.testcases.commerce;

import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.plus.ProductDetailPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.Assert.assertTrue;

/**
 * @설명: 준비물 구매하기 버튼을 클릭했을 때 준비물 구매 페이지로 이동되는지 테스트한다
 * @분류: 커머스 - 준비물 구매하기 - 진입 - 클래스에 준비물 키트가 있을 경우 - [준비물 구매하기] 버튼 클릭
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 구독 계정으로 로그인 한다
 */
public class CheckKitPurchase implements TestCase {

    @Override
    public TestCase proceed() {
        ProductDetailPage.Actions.openKitPage();
        ProductDetailPage.buyKitButton().click();
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
