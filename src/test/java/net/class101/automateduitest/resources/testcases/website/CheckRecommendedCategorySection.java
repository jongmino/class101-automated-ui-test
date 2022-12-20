package net.class101.automateduitest.resources.testcases.website;

import static net.class101.automateduitest.resources.common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.ProductListPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 구독 메인 - 추천 카테고리 - 추천 카테고리 확인
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 로그인한다
 */
public class CheckRecommendedCategorySection implements TestCase {

    @Override
    public TestCase proceed() {
        //추천 카테고리 섹션 확인
        Home.recommendedCategorySectionTitle().scrollIntoView(true).shouldBe(Condition.visible);
        //영어 카테고리 클릭
        Home.englishCategoryButton().scrollIntoView(true).shouldBe(Condition.enabled).click();
        ProductListPage.englishCategoryPageTitle().shouldBe(Condition.visible);

        return this;
    }

    @Override
    public void validate() {
        //카테고리 페이지로 이동 확인
        assertTrue(urlContains("categories"));
    }
}
