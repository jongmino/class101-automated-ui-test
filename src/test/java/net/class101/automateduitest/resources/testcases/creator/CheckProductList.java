package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.common.PropertyLoader;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static com.codeborne.selenide.Selenide.open;

/**
 * 크리에이터 센터 - 상품 - 리스트 - 리스트 목록 확인
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 상품을 보유한 계정으로 로그인한다
 */
public class CheckProductList implements TestCase {

    @Override
    public TestCase proceed() {
        final String STAGING_CREATOR_PRODUCT_PAGE =
                PropertyLoader.getProperties().urls.get("creatorProduct").staging;
        open(STAGING_CREATOR_PRODUCT_PAGE);
        return this;
    }

    @Override
    public void validate() {
        CreatorProductPage.productList().shouldBe(Condition.visible);
    }
}
