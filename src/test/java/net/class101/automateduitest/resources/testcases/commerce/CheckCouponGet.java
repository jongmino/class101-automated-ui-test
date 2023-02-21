package net.class101.automateduitest.resources.testcases.commerce;

import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.resources.pages.plus.KitBuyPage;
import net.class101.automateduitest.resources.pages.plus.ProductDetailPage;
import net.class101.automateduitest.resources.testcases.TestCase;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * @설명: 준비물PDP에서 [최대 n원 쿠폰 받기] cta > [쿠폰 전체 다운받기] cta 클릭하여 쿠폰 다운로드를 테스트 한다.
 * @분류: 커머스 - 준비물PDP - [쿠폰 전체 다운받기] cta 클릭 > 쿠폰 다운 확인
 * @테스트_선행조건:
 * 1) 홈페이지를 연다
 * 2) 쿠폰 다운 이력이 없는 계정으로 로그인 한다
 */

public class CheckCouponGet implements TestCase {

    @Override
    public TestCase proceed() {
        ProductDetailPage.Actions.openKitPage();
        ProductDetailPage.buyKitButton().click();
        Selenide.switchTo().window(1);
        KitBuyPage.couponButton().click();
        KitBuyPage.couponDownloadButton().click();

        return this;
    }

    @Override
    public void validate() {
        assertTrue(KitBuyPage.couponAllDownloadButton().exists());
    }
}
