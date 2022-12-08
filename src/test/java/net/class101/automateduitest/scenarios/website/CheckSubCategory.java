package net.class101.automateduitest.scenarios.website;

import static net.class101.automateduitest.common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.class101.automateduitest.pages.plus.ProductListPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckSubCategory implements TestScenario {

    @Override
    public TestScenario proceed() {
        try {
            //영어 회화 서브카테고리 클릭
            ProductListPage.Elements.englishCommunicationSubCategoryButton().click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public void validate() {
        //URL 상의 Category ID로 페이지 이동 확인
        assertTrue(urlContains(ProductListPage.Elements.SUBCATEGORY_ID_ENGLISH_COMMUNICATION));
    }
}
