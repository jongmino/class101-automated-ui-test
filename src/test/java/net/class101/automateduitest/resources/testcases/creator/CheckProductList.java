package net.class101.automateduitest.resources.testcases.creator;

import net.class101.automateduitest.resources.common.PropertyLoader;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.Assert.assertTrue;

import static com.codeborne.selenide.Selenide.open;

/**
 * @설명: 크리에이터 센터의 '상품 페이지' 에서 상품 목록이 정상 노출되는지 테스트한다
 * @분류: 크리에이터 센터 - 상품 - 리스트 - 리스트 목록 확인
 * @테스트_선행조건:
 *  1) 크리에이터 홈으로 진입한다
 *  2) 상품을 보유한 계정으로 로그인한다
 */
public class CheckProductList implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorProductPage.Actions.openPage();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(CreatorProductPage.productList().exists());
    }
}
