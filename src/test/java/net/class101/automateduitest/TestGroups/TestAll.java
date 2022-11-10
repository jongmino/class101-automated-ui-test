package net.class101.automateduitest.TestGroups;

import static com.codeborne.selenide.Selenide.closeWebDriver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.Behaviors.Classmate;
import net.class101.automateduitest.Behaviors.Core;
import net.class101.automateduitest.Behaviors.Website;
import net.class101.automateduitest.Pages.Plus.Home;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("전체 테스트")
public class TestAll {

    @BeforeAll
    static void beforeAll() {
        //브라우저 크기 최대화
        Configuration.browserSize = "1920x1080";
        //테스트 타임아웃 20초
        Configuration.timeout = 20000;
        //브라우저 창 위치 초기화
        Configuration.browserPosition = "0x0";
    }

    @Nested
    @DisplayName("코어 플랫폼")
    public class CorePlatform {

        @Nested
        @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
        @DisplayName("로그인 검증")
        public class ThirdPartyLogin {

            @BeforeAll
            static void beforeAll() {
                Home.openPage();
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @BeforeEach
            void setUp() {
                Selenide.refresh();
            }

            @AfterEach
            void tearDown() {
                Core.logout();
            }

            @Test
            @Order(1)
            @DisplayName("네이버 로그인")
            void verifyNaverLogin() throws InterruptedException {
                Core.loginWithNaver();
            }

            @Test
            @Order(3)
            @DisplayName("이메일 로그인")
            void verifyEmailLogin() {
                Core.loginWithNonSubscribedUser();
            }
            //        @Test
            //        @Order(3)
            //        @DisplayName("페이스북 로그인")
            //        void loginWithFacebook() {
            //            loginWithFaceBook(Constants.FACEBOOK_USER_ID, Constants.FACEBOOK_PASSWORD);
            //            logout();
            //        }
        }

    }

    @Nested
    @DisplayName("웹사이트 플랫폼")
    public class WebsitePlatform {

        @Nested
        @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
        @DisplayName("미구독 유저")
        public class WithNonSubscribeAccount {

            @BeforeAll
            static void beforeAll() {
                Home.openPage();
                Core.loginWithNonSubscribedUser();
            }

            @BeforeEach
            void setUp() {
                Home.openPage();
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @Test
            @DisplayName("큐레이션 섹션 및 클래스 상세정보")
            void verifyCurationSection() throws InterruptedException {
                Website.verifyCurationSectionAndClassInfo();
            }

            @Test
            @DisplayName("검색 기능")
            void verifySearchBar() throws InterruptedException {
                Website.searchKeyword();
            }

            @Test
            @DisplayName("추천 카테고리")
            void verifyRecommendedCategory() throws InterruptedException {
                Website.verifyRecommendedCategorySection();
            }

            @Test
            @DisplayName("추천 클래스")
            void verifyRecommendedClass() {
                Website.verifyRecommendedClassSection();
            }

            @Test
            @DisplayName("찜하기 추가 / 제거")
            void verifySaveClass() throws InterruptedException {
                Website.saveAndUnSaveClass();
            }
        }

        @Nested
        @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
        @DisplayName("구독 유저")
        public class WithSubscribedAccount {

            @BeforeAll
            static void beforeAll() {
                Home.openPage();
                Core.loginWithSubscribedUser();
            }

            @BeforeEach
            void setUp() {
                Home.openPage();
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @Test
            @Order(2)
            @DisplayName("내 클래스 섹션 검증")
            void verifyMyClass() {
                Website.verifyMyClassSection();
            }
        }
    }

    @Nested
    @DisplayName("클래스메이트 플랫폼")
    public class ClassmatePlatform {

        @Nested
        @DisplayName("미구독 유저")
        public class WithNonSubscribedAccount {

            @BeforeAll
            static void beforeAll() {
                Home.openPage();
                Core.loginWithNonSubscribedUser();

            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @BeforeEach
            void setUp() {
                Home.openPage();
            }

            @Test
            @DisplayName("마이페이지 캐시탭 확인")
            void verifyMyPageCashTab() {
                Classmate.checkCashTab();
            }

            @Test
            @DisplayName("마이페이지 구독 탭 확인 - 미구독")
            void verifyMyPageSubscriptionStatus() {
                Classmate.checkSubscriptionStatusWithNonSubscribed();
            }

            @Test
            @DisplayName("마이페이지 서비스 리전 변경 기능 확인")
            void verifyMyPageServiceRegion() throws InterruptedException {
                Classmate.changeServiceRegion();
            }

            @Test
            @DisplayName("마이페이지 좌측 네비게이션 메뉴 페이지 이동 확인")
            void verifyMyPageMenu() throws InterruptedException {
                Classmate.checkMyPageMenu();
            }
        }

        @Nested
        @DisplayName("구독 유저")
        public class WithSubscribedAccount {

            @BeforeAll
            static void beforeAll() {
                Home.openPage();
                Core.loginWithSubscribedUser();
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @BeforeEach
            void setUp() {
                Home.openPage();
            }

            @Test
            @DisplayName("마이페이지 구독 탭 확인 - 구독")
            void verifyMyPageSubscriptionStatus() {
                Classmate.checkSubscriptionStatusWithSubscribed();
            }

            @Test
            @DisplayName("영상 재생 확인")
            void verifyVideoPlay() {
                Classmate.playClass();
            }

            @Test
            @DisplayName("플레이어 기능 확인")
            void verifyVideoPlayerFunctionality() throws InterruptedException {
                Classmate.checkVideoPlayerFunctionality();
            }
        }
    }
}
