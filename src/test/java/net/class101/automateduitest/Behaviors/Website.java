package net.class101.automateduitest.Behaviors;

import static net.class101.automateduitest.Common.Util.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.Pages.Plus.Home;
import net.class101.automateduitest.Pages.Plus.ProductDetailPage;
import net.class101.automateduitest.Pages.Plus.ProductListPage;
import net.class101.automateduitest.Pages.Plus.SubscribePlanPage;

public final class Website {

    /**
     * Non-Subscribed Login Needed
     * 큐레이션 아이템 및 클래스 상세정보 검증
     */
    public static void verifyCurationSectionAndClassInfo() throws InterruptedException {
        //큐레이션 섹션 검증
        Home.firstCurationItem().click();

        //PDP 검증
        ProductDetailPage.classInfoTab().shouldBe(Condition.visible);
        ProductDetailPage.creatorInfoTab().shouldBe(Condition.visible);

        Thread.sleep(2000);

        //(비구독) 구독 시작하기 버튼 클릭
        ProductDetailPage.startSubscriptionButton().click();
        //플랜 선택 페이지 이동 확인
        SubscribePlanPage.subscribePlanTitle().shouldBe(Condition.visible);
    }

    /**
     * Login Needed
     * 수강중인 클래스 섹션 검증
     */
    public static void verifyMyClassSection() {
        Home.myClassSectionTitle().shouldBe(Condition.visible);
    }

    /**
     * 추천 카테고리 검증
     */
    public static void verifyRecommendedCategorySection() throws InterruptedException {
        //추천 카테고리 섹션 확인
        Home.recommendedCategorySectionTitle().shouldBe(Condition.visible);
        //영어 카테고리 클릭
        Home.englishCategoryButton().click();
        Thread.sleep(1000);
        //카테고리 페이지로 이동 확인
        assertTrue(urlContains("categories"));

        //영어 회화 서브카테고리 클릭
        ProductListPage.englishCommunicationSubCategoryButton().click();
        Thread.sleep(1000);
        //URL 상의 Category ID로 페이지 이동 확인
        assertTrue(urlContains(ProductListPage.SUBCATEGORY_ID_ENGLISH_COMMUNICATION));
    }

    /**
     * Login Needed
     * 추천 클래스 섹션 검증
     * Todo(boulder): 새로고침을 해도 추천클래스 실시간 반영이 안되는 경우가 많아서 검증 보류
     */
    public static void verifyRecommendedClassSection() {
        Home.recommendedClassSectionTitle().shouldBe(Condition.visible);
    }

    /**
     * Login Needed
     * 찜하기 검증
     */
    public static void  saveAndUnSaveClass() throws InterruptedException {

        //실시간 인기 클래스 첫번째 아이템 찜하기
        Home.firstSaveButtonOnTrendingNow().click();
        Thread.sleep(2000);
        //찜하기 섹션 생성 확인
        Home.savedClassesSectionTitle().shouldBe(Condition.visible);

        Thread.sleep(2000);
        //실시간 인기 클래스 첫번째 아이템 찜하기 취소
        Home.firstSaveButtonOnTrendingNow().click();
        //찜하기 섹션 사라짐 확인
        Home.waitForSavedClassesDisappear();
    }

    /**
     * 검색기능 검증
     */
    public static void searchKeyword() throws InterruptedException {
        //검색창 클릭
        Home.searchBar().click();
        //검색 패널 확인
        Home.searchPanelTitle().shouldBe(Condition.visible);
        //검색 키워드 입력
        Home.searchBarInput().sendKeys("공예");
        //검색
        Home.searchBarInput().pressEnter();
        Thread.sleep(2000);
        //검색 결과 확인
        ProductListPage.craftsCategoryTab().shouldBe(Condition.visible);
    }
}
