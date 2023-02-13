package net.class101.automateduitest.resources.testcases.website;

import static net.class101.automateduitest.resources.common.Utils.urlContains;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.ProductListPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명: 홈화면 가장 아래에 추천 카테고리 섹션이 정상 노출 되고, 카테고리 클릭 시 카테고리 페이지로 정상 이동되는지 테스트한다
 * @분류: 구독 메인 - 추천 카테고리 - 추천 카테고리 확인
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 로그인한다
 */
public class CheckRecommendedCategorySection implements TestCase {

    @Override
    public TestCase proceed() {
        Home.Actions.openPage();
        //추천 카테고리 섹션 확인
        Home.recommendedCategorySectionTitle().scrollIntoView(true).shouldBe(Condition.visible);
        //영어 카테고리 클릭
        Home.englishCategoryButton().scrollIntoView(true).shouldBe(Condition.enabled).click();
        ProductListPage.englishCategoryPageTitle();

        return this;
    }

    @Override
    public void validate() {
        //카테고리 페이지로 이동 확인
        assertTrue(urlContains("categories"));
    }
}
