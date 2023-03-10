package net.class101.automateduitest.testGroups;

import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.classmate.*;
import net.class101.automateduitest.resources.testcases.commerce.*;
import net.class101.automateduitest.resources.testcases.core.*;
import net.class101.automateduitest.resources.testcases.creator.*;
import net.class101.automateduitest.resources.testcases.website.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import static com.codeborne.selenide.Selenide.closeWebDriver;

@DisplayName("전체 테스트")
@TestInstance(Lifecycle.PER_CLASS)
public class RegressionTestAll {

    @BeforeAll
    void beforeAll() {
        //test config
        Utils.setTestConfig();
    }

    @Nested
    @DisplayName("코어 플랫폼")
    @TestInstance(Lifecycle.PER_CLASS)
    public class CorePlatform {

        @Nested
        @DisplayName("회원가입")
        @TestInstance(Lifecycle.PER_CLASS)
        public class SignUp {

            @BeforeAll
            void beforeAll() {
                Home.Actions.openPage();
            }

            @AfterAll
            void afterAll() {
                closeWebDriver();
            }

            @Test
            @DisplayName("회원가입 - 애플 로그인 페이지")
            void testAppleLoginPage() {
                SF.get(CheckAppleLoginPage.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("회원가입 - 페이스북 로그인 페이지")
            void testFacebookLoginPage() {
                SF.get(CheckFacebookLoginPage.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("회원가입 - 구글 로그인 페이지")
            void testGoogleLoginPage() {
                SF.get(CheckGoogleLoginPage.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("회원가입 - 카카오 로그인 페이지")
            void testKakaoPage() {
                SF.get(CheckKakaoLoginPage.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("회원가입 - 네이버 로그인 페이지")
            void testNaverPage() {
                SF.get(CheckNaverLoginPage.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("회원가입 - 이메일로 시작하기")
            void testEmailSignUpPage() {
                SF.get(CheckEmailSignUpPage.class)
                    .proceed()
                    .validate();
            }
        }

        @Nested
        @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
        @DisplayName("로그인")
        @TestInstance(Lifecycle.PER_CLASS)
        public class SignIn {

            @BeforeAll
            void beforeAll() {
                Home.Actions.openPage();
            }

            @AfterAll
            void afterAll() {
                closeWebDriver();
            }

            @BeforeEach
            void setUp() {
                Selenide.refresh();
            }

            @AfterEach
            void tearDown() {
                SF.get(Logout.class)
                    .proceed()
                    .validate();
            }

            @Test
            @Order(1)
            @DisplayName("이메일 로그인")
            void testEmailLogin() {
                SF.get(LoginAsNonSubscriber.class)
                    .proceed()
                    .validate();
            }
//
//            @Test
//            @Order(2)
//            @DisplayName("네이버 로그인")
//            void testNaverLogin() {
//                SF.get(LoginWithNaver.class).proceed().validate();
//            }
//            @Test
//            @Order(3)
//            @DisplayName("페이스북 로그인")
//            void loginWithFacebook() {
//                SF.getInstance(LoginWithFacebook.class).proceed().validate();
//            }
        }

    }

    @Nested
    @DisplayName("웹사이트 플랫폼")
    @TestInstance(Lifecycle.PER_CLASS)
    public class WebsitePlatform {

        @Nested
        @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
        @DisplayName("미구독 유저")
        @TestInstance(Lifecycle.PER_CLASS)
        public class WithNonSubscribeAccount {

            @BeforeAll
            void beforeAll() {
                Home.Actions.openPage();
                SF.get(LoginAsNewUser.class)
                    .proceed();
            }

            @AfterEach
            void tearDown() {
                Home.Actions.openPage();
            }

            @AfterAll
            void afterAll() {
                closeWebDriver();
            }

            @Test
            @DisplayName("큐레이션 섹션 - 구독 플랜 선택")
            void testSubscriptionPlan() {
                SF.get(CheckSubscriptionPlan.class)
                    .proceed()
                    .validate();
            }

        }

        @Nested
        @DisplayName("구독 유저")
        @TestInstance(Lifecycle.PER_CLASS)
        public class WithSubscribedAccount {

            @BeforeAll
            void beforeAll() {
                Home.Actions.openPage();
                SF.get(LoginAsSubscriber.class)
                    .proceed();
            }

            @AfterEach
            void tearDown() {
                Home.Actions.openPage();
            }

            @AfterAll
            void afterAll() {
                closeWebDriver();
            }

            @Test
            @DisplayName("내 클래스 섹션 검증")
            void testMyClass() {
                SF.get(CheckMyClassSection.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("찜하기 추가 / 제거")
            void testSaveClass() throws InterruptedException {
                SF.get(SaveClass.class)
                    .proceed()
                    .validate();
                SF.get(UnSaveClass.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("검색 기능")
            void testSearchBar() {
                SF.get(SearchKeyword.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("추천 카테고리 / 서브카테고리")
            void testRecommendedCategory() {
                SF.get(CheckRecommendedCategorySection.class)
                    .proceed()
                    .validate();
                SF.get(CheckSubCategory.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("추천 클래스")
            void testRecommendedClass() {
                SF.get(CheckRecommendedClassSection.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("큐레이션 섹션 및 클래스 상세정보")
            void testCurationSection() {
                SF.get(CheckCurationSection.class)
                    .proceed()
                    .validate();
            }

        }
    }

    @Nested
    @DisplayName("클래스메이트 플랫폼")
    @TestInstance(Lifecycle.PER_CLASS)
    public class ClassmatePlatform {

        @Nested
        @DisplayName("미구독 유저")
        @TestInstance(Lifecycle.PER_CLASS)
        public class WithNonSubscribedAccount {

            @BeforeAll
            void beforeAll() {
                Home.Actions.openPage();
                SF.get(LoginAsNewUser.class)
                    .proceed();
            }

            @AfterAll
            void afterAll() {
                closeWebDriver();
            }

            @AfterEach
            void tearDown() {
                Home.Actions.openPage();
            }

            @Test
            @DisplayName("마이페이지 구독 탭 확인 - 미구독")
            void testMyPageSubscriptionStatus() {
                SF.get(CheckSubscriptionStatusFalse.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("마이페이지 좌측 네비게이션 메뉴 페이지 이동 확인")
            void testMyPageMenu() {
                SF.get(CheckOrderTab.class)
                    .proceed()
                    .validate();
                SF.get(CheckReferralTab.class)
                    .proceed()
                    .validate();
                SF.get(CheckCreatorCenterTab.class)
                    .proceed()
                    .validate();
                SF.get(CheckFAQTab.class)
                    .proceed()
                    .validate();
                SF.get(CheckEnquiryTab.class)
                    .proceed()
                    .validate();
                SF.get(CheckSettingTab.class)
                    .proceed()
                    .validate();
            }
        }

        @Nested
        @DisplayName("구독 유저")
        @TestInstance(Lifecycle.PER_CLASS)
        public class WithSubscribedAccount {

            @BeforeAll
            void beforeAll() {
                Home.Actions.openPage();
                SF.get(LoginAsYearlySubscriber.class)
                    .proceed();
            }

            @AfterAll
            void afterAll() {
                closeWebDriver();
            }

            @AfterEach
            void tearDown() {
                Home.Actions.openPage();
            }

            @Test
            @DisplayName("마이페이지 캐시탭 확인")
            void testMyPageCashTab() {
                SF.get(CheckCashTab.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("마이페이지 서비스 리전 변경 기능 확인")
            void testMyPageServiceRegion() {
                SF.get(ChangeServiceRegionToEN.class)
                    .proceed()
                    .validate();
                SF.get(ChangeServiceRegionJP.class)
                    .proceed()
                    .validate();
            }
            @Test
            @DisplayName("마이페이지 구독 탭 확인 - 구독")
            void testMyPageSubscriptionStatus() {
                SF.get(CheckSubscriptionStatusTrue.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("영상 재생 확인")
            void testVideoPlay() {
                SF.get(CheckPlayLecture.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("플레이어 기능 확인 - 재생 속도")
            void testVideoPlayerPlaySpeed() {
                SF.get(ChangePlaySpeed.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("플레이어 기능 확인 - 화질 설정")
            void testVideoPlayerVideoQuality() {
                SF.get(ChangeVideoQuality.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("플레이어 기능 확인 - 자동 재생 설정")
            void testVideoPlayerAutoPlay() {
                SF.get(ChangeAutoPlay.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("수강환경 탭 메뉴 확인")
            void testLectureTabMenu() {
                SF.get(CheckLectureTabMenu.class)
                    .proceed()
                    .validate();
            }
        }
    }

    @Nested
    @DisplayName("크리에이터 플랫폼")
    @TestInstance(Lifecycle.PER_CLASS)
    public class CreatorPlatform {

        @Nested
        @DisplayName("크리에이터 상품 테스트 계정")
        @TestInstance(Lifecycle.PER_CLASS)
        public class CreatorProductTestAccount {

            @BeforeAll
            void beforeAll() {
                CreatorHome.Actions.openPage();
                SF.get(LoginAsCreatorNew.class)
                    .proceed();
            }

            @AfterAll
            void afterAll() {
                closeWebDriver();
            }

            @BeforeEach
            void setUp() {
                CreatorProductPage.creatorCenterLogo()
                    .click();
            }

            @AfterEach
            void tearDown() {
                SF.get(DeleteFirstProduct.class)
                    .proceed();
            }

            @Test
            @DisplayName("클래스 만들기")
            void testAddClass() {
                SF.get(CheckAddClass.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("디지털 파일 만들기")
            void testAddDigitalFile() {
                SF.get(CheckAddDigitalFile.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("전자책 만들기")
            void testAddEBook() {
                SF.get(CheckAddEBook.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("검토 요청")
            void testRequestReview() {
                SF.get(CheckRequestClassReview.class)
                    .proceed()
                    .validate();
            }
        }

        @Nested
        @DisplayName("크리에이터 클래스 정보 테스트 계정")
        @TestInstance(Lifecycle.PER_CLASS)
        public class CreatorClassTestAccount {

            @BeforeAll
            void beforeAll() {
                CreatorHome.Actions.openPage();
                SF.get(LoginAsCreatorHasClass.class)
                    .proceed();
            }

            @AfterAll
            void afterAll() {
                closeWebDriver();
            }

            @AfterEach
            void tearDown() {
                CreatorHome.Actions.openPage();
            }

            @Test
            @DisplayName("상품 리스트")
            void testProductList() {
                SF.get(CheckProductList.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("클래스 댓글 페이지")
            void testCommentPage() {
                SF.get(CheckClassCommentTab.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("클래스 댓글 페이지 답변완료")
            void testCommentAnswered() {
                SF.get(CheckCommentAnswered.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("클래스 댓글 페이지 답변 대기중")
            void testCommentNotAnswered() {
                SF.get(CheckCommentNotAnswered.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("클래스 소식")
            void testClassNews() {
                SF.get(CheckClassNews.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("파일 요청 내역")
            void testFileRequestTab() {
                SF.get(CheckFileRequestTab.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("주문 및 배송")
            void testOrderAndShippingTab() {
                SF.get(CheckOrderAndShippingTab.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("재고")
            void testStockTab() {
                SF.get(CheckStockTab.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("클래스 정산")
            void testClassSettlement() {
                SF.get(CheckClassSettlement.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("키트 정산")
            void testKitSettlement() {
                SF.get(CheckKitSettlement.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("크리에이터 가이드 센터")
            void testCreatorGuideCenter() {
                SF.get(CheckCreatorGuideTab.class)
                    .proceed()
                    .validate();
            }
        }

        @Nested
        @DisplayName("크리에이터 정산 테스트 계정")
        @TestInstance(Lifecycle.PER_CLASS)
        public class CreatorHasRevenue {

            @BeforeAll
            void beforeAll() {
                CreatorHome.Actions.openPage();
                SF.get(LoginAsCreatorHasRevenue.class)
                    .proceed();
            }

            @AfterAll
            void afterAll() {
                closeWebDriver();
            }

            @AfterEach
            void tearDown() {
                CreatorHome.Actions.openPage();
            }

            @Test
            @DisplayName("클래스101+ 초대")
            void testReferralTab() {
                SF.get(CheckCreatorReferralTab.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("클래스101+ 정산")
            void testPlusSettlement() {
                SF.get(CheckPlusSettlement.class)
                    .proceed()
                    .validate();
            }
        }
    }

    @Nested
    @DisplayName("커머스 플랫폼")
    @TestInstance(Lifecycle.PER_CLASS)
    public class CommercePlatform {

//        @Nested
//        @DisplayName("신규 계정")
//        @TestInstance(Lifecycle.PER_CLASS)
//        public class NewUser {
//
//            @BeforeAll
//            void beforeAll() {
//                Home.Actions.openPage();
//                SF.get(LoginAsNewUser.class)
//                    .proceed();
//            }
//
//            @Test
//            @DisplayName("무료 체험")
//            void testFreeTrial() {
//                SF.get(CheckFreeTrial.class)
//                    .proceed()
//                    .validate();
//            }
//        }

        @Nested
        @DisplayName("미구독 계정")
        @TestInstance(Lifecycle.PER_CLASS)
        public class NonSubscriber {

            @BeforeAll
            void beforeAll() {
                Home.Actions.openPage();
                SF.get(LoginAsNewUser.class)
                    .proceed();
            }

            @AfterAll
            void afterAll() {
                closeWebDriver();
            }

            @AfterEach
            void tearDown() {
                Home.Actions.openPage();
            }

            @Test
            @DisplayName("연간 구독")
            void testYearlyPlan() {
                SF.get(CheckYearlySubscription.class)
                    .proceed()
                    .validate();
            }
        }

        @Nested
        @DisplayName("연간 구독 계정")
        @TestInstance(Lifecycle.PER_CLASS)
        public class Subscriber {

            @BeforeAll
            void beforeAll() {
                Home.Actions.openPage();
                SF.get(LoginAsYearlySubscriber.class)
                    .proceed();
            }

            @AfterAll
            void afterAll() {
                closeWebDriver();
            }

            @AfterEach
            void tearDown() {
                Home.Actions.openPage();
            }

//            TODO(Boulder): 준비물 구매가 있는 페이지 요청
//            @Test
//            @DisplayName("준비물 구매")
//            void testBuyKit() {
//                SF.get(CheckKitPurchase.class)
//                    .proceed()
//                    .validate();
//            }

            @Test
            @DisplayName("구독 취소")
            void testCancelSubscription() {
                SF.get(CheckCancelSubscription.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("구독 환불")
            void testRefundSubscription() {
                SF.get(CheckRefundSubscription.class)
                    .proceed()
                    .validate();
            }
        }

        @Nested
        @DisplayName("키트 계정")
        @TestInstance(Lifecycle.PER_CLASS)
        public class UserHasKit {

            @BeforeAll
            void beforeAll() {
                Home.Actions.openPage();
                SF.get(LoginAsUserHasKit.class)
                    .proceed();
            }

            @AfterAll
            void afterAll() {
                closeWebDriver();
            }

            @AfterEach
            void tearDown() {
                Home.Actions.openPage();
            }

            @Test
            @DisplayName("주문 및 배송 진입")
            void testOrderHistory() {
                SF.get(CheckOrderHistory.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("주문 및 배송 자세히 보기")
            void testOrderDetail() {
                SF.get(CheckOrderDetail.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("키트 환불")
            void testRefundKit() {
                SF.get(CheckRefundKit.class)
                    .proceed()
                    .validate();
            }
        }
    }
}
