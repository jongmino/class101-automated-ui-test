package net.class101.automateduitest.resources.testcases.website;

import static net.class101.automateduitest.common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.CollectionCondition;
import net.class101.automateduitest.resources.pages.plus.ProductListPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 클래스 - PLP - 카테고리 - 카테고리 선택 - 하위 카테고리 진입
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 로그인한다
 */
public class CheckSubCategory implements TestCase {

    @Override
    public TestCase proceed() {

        ProductListPage.Elements.englishCommunicationSubCategoryButton().click();
        ProductListPage.Elements.productItemList().shouldHave(CollectionCondition.sizeLessThan(20));
        return this;
    }

    @Override
    public void validate() {
        //URL 상의 Category ID로 페이지 이동 확인
        assertTrue(urlContains(ProductListPage.SUBCATEGORY_ID_ENGLISH_COMMUNICATION));
    }
}
