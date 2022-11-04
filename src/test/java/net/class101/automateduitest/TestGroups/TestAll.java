package net.class101.automateduitest.TestGroups;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static net.class101.automateduitest.Common.Behaviors.loginWithEmail;
import static net.class101.automateduitest.Common.Behaviors.loginWithFaceBook;
import static net.class101.automateduitest.Common.Behaviors.loginWithNaver;
import static net.class101.automateduitest.Common.Behaviors.logout;
import static net.class101.automateduitest.Common.Behaviors.openUrl;
import static net.class101.automateduitest.Common.Behaviors.saveAndUnSaveClass;
import static net.class101.automateduitest.Common.Behaviors.searchKeyword;
import static net.class101.automateduitest.Common.Behaviors.verifyCurationItemAndClassInformation;
import static net.class101.automateduitest.Common.Behaviors.verifyMyClassSection;
import static net.class101.automateduitest.Common.Behaviors.verifyRecommendedCategorySection;
import static net.class101.automateduitest.Common.Behaviors.verifyRecommendedClassSection;

import net.class101.automateduitest.Constants;
import org.junit.jupiter.api.AfterAll;
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
        @DisplayName("3P 로그인 검증")
        public class ThirdPartyLogin {
            @BeforeAll
            static void beforeAll() {
                openUrl(Constants.STAGING_URL);
            }

            @Test
            @Order(1)
            @DisplayName("네이버 로그인")
            void verifyNaverLogin() throws InterruptedException {
                loginWithNaver(Constants.NAVER_USER_ID, Constants.NAVER_PASSWORD);
            }

            @Test
            @Order(2)
            @DisplayName("로그아웃")
            void verifyLogout() {
                logout();
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
        @Order(2)
        @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
        @DisplayName("미구독 유저 기능 검증")
        public class WithNonSubscribeAccount {
            @BeforeAll
            static void beforeAll() {
                openUrl(Constants.STAGING_URL);
            }

            @BeforeEach
            void setUp() {
                open(Constants.STAGING_URL);
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @Test
            @Order(1)
            @DisplayName("이메일 로그인")
            void login() {
                loginWithEmail(Constants.CLASS101_USER_ID, Constants.CLASS101_PASSWORD);
            }

            @Test
            @Order(2)
            @DisplayName("큐레이션 섹션을 확인 및 클래스 상세정보 검증")
            void verifyCurationSection() throws InterruptedException {
                verifyCurationItemAndClassInformation();
            }

            @Test
            @Order(3)
            @DisplayName("검색 기능 검증")
            void verifySearchBar() throws InterruptedException {
                searchKeyword();
            }

            @Test
            @Order(4)
            @DisplayName("추천 카테고리 검증")
            void verifyRecommendedCategory() throws InterruptedException {
                verifyRecommendedCategorySection();
            }

            @Test
            @Order(5)
            @DisplayName("추천 클래스 검증")
            void verifyRecommendedClass() {
                verifyRecommendedClassSection();
            }

            @Test
            @Order(6)
            @DisplayName("찜하기 검증")
            void verifySaveClass() throws InterruptedException {
                saveAndUnSaveClass();
            }
        }

        @Nested
        @Order(3)
        @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
        @DisplayName("구독 유저 기능 검증")
        public class WithSubscribedAccount{
            @BeforeAll
            static void beforeAll() {
                openUrl(Constants.STAGING_URL);
            }

            @BeforeEach
            void setUp() {
                open(Constants.STAGING_URL);
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @Test
            @Order(1)
            @DisplayName("로그인")
            void login() {
                loginWithEmail(Constants.MY_CLASS_USER_ID, Constants.MY_CLASS_PASSWORD);
            }

            @Test
            @Order(2)
            @DisplayName("내 클래스 섹션 검증")
            void verifyMyClass() {
                verifyMyClassSection();
            }
        }
    }
}
