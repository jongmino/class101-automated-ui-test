package net.class101.automateduitest.resources.testcases.website;

import static net.class101.automateduitest.resources.common.Utils.urlContains;

import com.codeborne.selenide.CollectionCondition;
import net.class101.automateduitest.resources.pages.plus.ProductListPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명: 카테고리 페이지에서 하위 카테고리 클릭 시 하위 카테고리 페이지로 정상 진입되는지 테스트한다
 * @분류: 클래스 - PLP - 카테고리 - 카테고리 선택 - 하위 카테고리 진입
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 로그인한다
 */
public class CheckSubCategory implements TestCase {

    @Override
    public TestCase proceed() {

        ProductListPage.englishCommunicationSubCategoryButton().click();
        ProductListPage.productItemList().shouldHave(CollectionCondition.sizeLessThan(20));
        return this;
    }

    @Override
    public void validate() {
        //URL 상의 Category ID로 페이지 이동 확인
        assertTrue(urlContains(ProductListPage.SUBCATEGORY_ID_ENGLISH_COMMUNICATION));
    }
}
