package net.class101.automateduitest.resources.testcases.commerce;

import net.class101.automateduitest.resources.pages.plus.ProductDetailPage;
import net.class101.automateduitest.resources.testcases.TestCase;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * @설명: 준비물이 없는 클래스 PDP 진입 시 [준비물 구매]CTA 미노출을 테스트한다.
 @분류: 커머스 - 클래스 PDP - [준비물 구매]CTA 미노출 확인
 @테스트 선행조건:
 1) 홈페이지를 연다
 2) 구독 계정으로 로그인을 한다
 */
public class CheckNoBuyKitButton implements TestCase {


    @Override
    public TestCase proceed() {
        ProductDetailPage.Actions.noKitClassPage();

        return this;
    }

    @Override
    public void validate() {
        assertTrue(!ProductDetailPage.hasKitButton());
    }
}
