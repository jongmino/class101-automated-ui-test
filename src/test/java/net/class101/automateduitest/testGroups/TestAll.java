package net.class101.automateduitest.testGroups;

import static com.codeborne.selenide.Selenide.closeWebDriver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.classmate.ChangeAutoPlay;
import net.class101.automateduitest.scenarios.classmate.ChangePlaySpeed;
import net.class101.automateduitest.scenarios.classmate.ChangeServiceRegionEN;
import net.class101.automateduitest.scenarios.classmate.ChangeServiceRegionJP;
import net.class101.automateduitest.scenarios.classmate.ChangeVideoQuality;
import net.class101.automateduitest.scenarios.classmate.CheckCashTab;
import net.class101.automateduitest.scenarios.classmate.CheckCreatorCenterTab;
import net.class101.automateduitest.scenarios.classmate.CheckEnquiryTab;
import net.class101.automateduitest.scenarios.classmate.CheckFAQTab;
import net.class101.automateduitest.scenarios.classmate.CheckOrderTab;
import net.class101.automateduitest.scenarios.classmate.CheckReferralTab;
import net.class101.automateduitest.scenarios.classmate.CheckSettingTab;
import net.class101.automateduitest.scenarios.classmate.CheckSubscriptionStatusFalse;
import net.class101.automateduitest.scenarios.classmate.CheckSubscriptionStatusTrue;
import net.class101.automateduitest.scenarios.classmate.PlayLecture;
import net.class101.automateduitest.scenarios.core.LoginAsNonSubscriber;
import net.class101.automateduitest.scenarios.core.LoginAsSubscriber;
import net.class101.automateduitest.scenarios.core.LoginWithFacebook;
import net.class101.automateduitest.scenarios.core.LoginWithNaver;
import net.class101.automateduitest.scenarios.core.Logout;
import net.class101.automateduitest.scenarios.website.CheckCurationSection;
import net.class101.automateduitest.scenarios.website.CheckMyClassSection;
import net.class101.automateduitest.scenarios.website.CheckRecommendedCategorySection;
import net.class101.automateduitest.scenarios.website.CheckRecommendedClassSection;
import net.class101.automateduitest.scenarios.website.CheckSubscriptionPlan;
import net.class101.automateduitest.scenarios.website.SaveClass;
import net.class101.automateduitest.scenarios.website.SearchKeyword;
import net.class101.automateduitest.scenarios.website.UnSaveClass;
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
                Home.Actions.openPage();
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
                Logout.getInstance().proceed().validate();
            }

            @Test
            @Order(1)
            @DisplayName("네이버 로그인")
            void verifyNaverLogin() {
                LoginWithNaver.getInstance().proceed().validate();
            }

            @Test
            @Order(3)
            @DisplayName("이메일 로그인")
            void verifyEmailLogin() {
                LoginAsNonSubscriber.getInstance().proceed().validate();
            }

//            @Test
//            @Order(3)
//            @DisplayName("페이스북 로그인")
//            void loginWithFacebook() {
//                LoginWithFacebook.getInstance().proceed().validate();
//            }
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
                Home.Actions.openPage();
                LoginAsNonSubscriber.getInstance().proceed().validate();
            }

            @BeforeEach
            void setUp() {
                Home.Actions.openPage();
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @Test
            @DisplayName("큐레이션 섹션 및 클래스 상세정보")
            void verifyCurationSection() {
                CheckCurationSection.getInstance().proceed().validate();
                CheckSubscriptionPlan.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("검색 기능")
            void verifySearchBar() {
                SearchKeyword.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("추천 카테고리")
            void verifyRecommendedCategory() {
                CheckRecommendedCategorySection.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("추천 클래스")
            void verifyRecommendedClass() {
                CheckRecommendedClassSection.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("찜하기 추가 / 제거")
            void verifySaveClass() throws InterruptedException {
                SaveClass.getInstance().proceed().validate();
                UnSaveClass.getInstance().proceed().validate();
            }
        }

        @Nested
        @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
        @DisplayName("구독 유저")
        public class WithSubscribedAccount {

            @BeforeAll
            static void beforeAll() {
                Home.Actions.openPage();
                LoginAsSubscriber.getInstance().proceed().validate();
            }

            @BeforeEach
            void setUp() {
                Home.Actions.openPage();
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @Test
            @Order(2)
            @DisplayName("내 클래스 섹션 검증")
            void verifyMyClass() {
                CheckMyClassSection.getInstance().proceed().validate();
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
                Home.Actions.openPage();
                LoginAsNonSubscriber.getInstance().proceed().validate();
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @BeforeEach
            void setUp() {
                Home.Actions.openPage();
            }

            @Test
            @DisplayName("마이페이지 캐시탭 확인")
            void verifyMyPageCashTab() {
                CheckCashTab.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("마이페이지 구독 탭 확인 - 미구독")
            void verifyMyPageSubscriptionStatus() {
                CheckSubscriptionStatusFalse.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("마이페이지 서비스 리전 변경 기능 확인")
            void verifyMyPageServiceRegion() {
                ChangeServiceRegionEN.getInstance().proceed().validate();
                ChangeServiceRegionJP.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("마이페이지 좌측 네비게이션 메뉴 페이지 이동 확인")
            void verifyMyPageMenu() {
                CheckOrderTab.getInstance().proceed().validate();
                CheckReferralTab.getInstance().proceed().validate();
                CheckCreatorCenterTab.getInstance().proceed().validate();
                CheckFAQTab.getInstance().proceed().validate();
                CheckEnquiryTab.getInstance().proceed().validate();
                CheckSettingTab.getInstance().proceed().validate();
            }
        }

        @Nested
        @DisplayName("구독 유저")
        public class WithSubscribedAccount {

            @BeforeAll
            static void beforeAll() {
                Home.Actions.openPage();
                LoginAsSubscriber.getInstance().proceed().validate();
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @BeforeEach
            void setUp() {
                Home.Actions.openPage();
            }

            @Test
            @DisplayName("마이페이지 구독 탭 확인 - 구독")
            void verifyMyPageSubscriptionStatus() {
                CheckSubscriptionStatusTrue.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("영상 재생 확인")
            void verifyVideoPlay() {
                PlayLecture.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("플레이어 기능 확인")
            void verifyVideoPlayerFunctionality() throws InterruptedException {
                PlayLecture.getInstance().proceed();
                ChangePlaySpeed.getInstance().proceed().validate();
                ChangeVideoQuality.getInstance().proceed().validate();
                ChangeAutoPlay.getInstance().proceed().validate();
            }
        }
    }
}