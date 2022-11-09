package net.class101.automateduitest.TestGroups;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static net.class101.automateduitest.Common.Behaviors.changeServiceRegion;
import static net.class101.automateduitest.Common.Behaviors.checkCashTab;
import static net.class101.automateduitest.Common.Behaviors.checkMyPageMenu;
import static net.class101.automateduitest.Common.Behaviors.checkSubscriptionStatusWithNonSubscribed;
import static net.class101.automateduitest.Common.Behaviors.checkSubscriptionStatusWithSubscribed;
import static net.class101.automateduitest.Common.Behaviors.checkVideoPlayerFunctionality;
import static net.class101.automateduitest.Common.Behaviors.loginWithEmail;
import static net.class101.automateduitest.Common.Behaviors.loginWithNaver;
import static net.class101.automateduitest.Common.Behaviors.logout;
import static net.class101.automateduitest.Common.Behaviors.openUrl;
import static net.class101.automateduitest.Common.Behaviors.playClass;
import static net.class101.automateduitest.Common.Behaviors.saveAndUnSaveClass;
import static net.class101.automateduitest.Common.Behaviors.searchKeyword;
import static net.class101.automateduitest.Common.Behaviors.verifyCurationItemAndClassInformation;
import static net.class101.automateduitest.Common.Behaviors.verifyMyClassSection;
import static net.class101.automateduitest.Common.Behaviors.verifyRecommendedCategorySection;
import static net.class101.automateduitest.Common.Behaviors.verifyRecommendedClassSection;

import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.Constants;
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

    @Nested
    @DisplayName("코어 플랫폼")
    public class CorePlatform{

        @Nested
        @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
        @DisplayName("로그인 검증")
        public class ThirdPartyLogin {
            @BeforeAll
            static void beforeAll() {
                openUrl(Constants.STAGING_PLUS_HOME_URL);
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
                logout();
            }

            @Test
            @Order(1)
            @DisplayName("네이버 로그인")
            void verifyNaverLogin() throws InterruptedException {
                loginWithNaver(Constants.NAVER_USER_ID, Constants.NAVER_PASSWORD);
            }

            @Test
            @Order(3)
            @DisplayName("이메일 로그인")
            void verifyEmailLogin() {
                loginWithEmail(Constants.CLASS101_USER_ID, Constants.CLASS101_PASSWORD);
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
                openUrl(Constants.STAGING_PLUS_HOME_URL);

                loginWithEmail(Constants.CLASS101_USER_ID, Constants.CLASS101_PASSWORD);
            }

            @BeforeEach
            void setUp() {
                open(Constants.STAGING_PLUS_HOME_URL);
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @Test
            @DisplayName("큐레이션 섹션 및 클래스 상세정보")
            void verifyCurationSection() throws InterruptedException {
                verifyCurationItemAndClassInformation();
            }

            @Test
            @DisplayName("검색 기능")
            void verifySearchBar() throws InterruptedException {
                searchKeyword();
            }

            @Test
            @DisplayName("추천 카테고리")
            void verifyRecommendedCategory() throws InterruptedException {
                verifyRecommendedCategorySection();
            }

            @Test
            @DisplayName("추천 클래스")
            void verifyRecommendedClass() {
                verifyRecommendedClassSection();
            }

            @Test
            @DisplayName("찜하기 추가 / 제거")
            void verifySaveClass() throws InterruptedException {
                saveAndUnSaveClass();
            }
        }

        @Nested
        @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
        @DisplayName("구독 유저")
        public class WithSubscribedAccount{
            @BeforeAll
            static void beforeAll() {
                openUrl(Constants.STAGING_PLUS_HOME_URL);
                loginWithEmail(Constants.MY_CLASS_USER_ID, Constants.MY_CLASS_PASSWORD);
            }

            @BeforeEach
            void setUp() {
                open(Constants.STAGING_PLUS_HOME_URL);
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @Test
            @Order(2)
            @DisplayName("내 클래스 섹션 검증")
            void verifyMyClass() {
                verifyMyClassSection();
            }
        }
    }

    @Nested
    @DisplayName("클래스메이트 플랫폼")
    public class ClassmatePlatform{
        @Nested
        @DisplayName("미구독 유저")
        public class WithNonSubscribedAccount {

            @BeforeAll
            static void beforeAll() {
                openUrl(Constants.STAGING_PLUS_HOME_URL);
                loginWithEmail(Constants.CLASS101_USER_ID, Constants.CLASS101_PASSWORD);

            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @BeforeEach
            void setUp() {
                open(Constants.STAGING_PLUS_HOME_URL);
            }

            @Test
            @DisplayName("마이페이지 캐시탭 확인")
            void verifyMyPageCashTab() {
                checkCashTab();
            }

            @Test
            @DisplayName("마이페이지 구독 탭 확인 - 미구독")
            void verifyMyPageSubscriptionStatus() {
                checkSubscriptionStatusWithNonSubscribed();
            }

            @Test
            @DisplayName("마이페이지 서비스 리전 변경 기능 확인")
            void verifyMyPageServiceRegion() throws InterruptedException {
                changeServiceRegion();
            }

            @Test
            @DisplayName("마이페이지 좌측 네비게이션 메뉴 페이지 이동 확인")
            void verifyMyPageMenu() throws InterruptedException {
                checkMyPageMenu();
            }
        }

        @Nested
        @DisplayName("구독 유저")
        public class WithSubscribedAccount {

            @BeforeAll
            static void beforeAll() {
                openUrl(Constants.STAGING_PLUS_HOME_URL);
                loginWithEmail(Constants.MY_CLASS_USER_ID, Constants.MY_CLASS_PASSWORD);
            }
            
            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @BeforeEach
            void setUp() {
                open(Constants.STAGING_PLUS_HOME_URL);
            }

            @Test
            @DisplayName("마이페이지 구독 탭 확인 - 구독")
            void verifyMyPageSubscriptionStatus() {
                checkSubscriptionStatusWithSubscribed();
            }

            @Test
            @DisplayName("영상 재생 확인")
            void verifyVideoPlay() {
                playClass();
            }

            @Test
            @DisplayName("플레이어 기능 확인")
            void verifyVideoPlayerFunctionality() throws InterruptedException {
                checkVideoPlayerFunctionality();
            }
        }
    }
}
