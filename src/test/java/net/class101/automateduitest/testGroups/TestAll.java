package net.class101.automateduitest.testGroups;

import static com.codeborne.selenide.Selenide.closeWebDriver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.pages.creatorCenter.CreatorProductPage;
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
import net.class101.automateduitest.scenarios.classmate.CheckLectureTabMenu;
import net.class101.automateduitest.scenarios.classmate.CheckOrderTab;
import net.class101.automateduitest.scenarios.classmate.CheckReferralTab;
import net.class101.automateduitest.scenarios.classmate.CheckSettingTab;
import net.class101.automateduitest.scenarios.classmate.CheckSubscriptionStatusFalse;
import net.class101.automateduitest.scenarios.classmate.CheckSubscriptionStatusTrue;
import net.class101.automateduitest.scenarios.classmate.CheckPlayLecture;
import net.class101.automateduitest.scenarios.commerce.CheckCancelSubscription;
import net.class101.automateduitest.scenarios.commerce.CheckRefundKit;
import net.class101.automateduitest.scenarios.commerce.CheckRefundSubscription;
import net.class101.automateduitest.scenarios.commerce.CheckYearlySubscription;
import net.class101.automateduitest.scenarios.core.CheckAppleLoginPage;
import net.class101.automateduitest.scenarios.core.CheckEmailSignUpPage;
import net.class101.automateduitest.scenarios.core.CheckFacebookLoginPage;
import net.class101.automateduitest.scenarios.core.CheckGoogleLoginPage;
import net.class101.automateduitest.scenarios.core.CheckKakaoLoginPage;
import net.class101.automateduitest.scenarios.core.CheckNaverLoginPage;
import net.class101.automateduitest.scenarios.core.LoginAsNonSubscriber;
import net.class101.automateduitest.scenarios.commerce.CheckKitPurchase;
import net.class101.automateduitest.scenarios.commerce.CheckOrderDetail;
import net.class101.automateduitest.scenarios.commerce.CheckOrderHistory;
import net.class101.automateduitest.scenarios.core.LoginAsSubscriber;
import net.class101.automateduitest.scenarios.core.LoginAsUserHasKit;
import net.class101.automateduitest.scenarios.core.LoginAsYearlySubscriber;
import net.class101.automateduitest.scenarios.core.LoginWithNaver;
import net.class101.automateduitest.scenarios.core.Logout;
import net.class101.automateduitest.scenarios.creator.CheckAddClass;
import net.class101.automateduitest.scenarios.creator.CheckAddDigitalFile;
import net.class101.automateduitest.scenarios.creator.CheckAddEBook;
import net.class101.automateduitest.scenarios.creator.CheckClassCommentTab;
import net.class101.automateduitest.scenarios.creator.CheckClassNews;
import net.class101.automateduitest.scenarios.creator.CheckClassSettlement;
import net.class101.automateduitest.scenarios.creator.CheckCommentAnswered;
import net.class101.automateduitest.scenarios.creator.CheckCommentNotAnswered;
import net.class101.automateduitest.scenarios.creator.CheckCreatorGuideTab;
import net.class101.automateduitest.scenarios.creator.CheckCreatorReferralTab;
import net.class101.automateduitest.scenarios.creator.CheckFileRequestTab;
import net.class101.automateduitest.scenarios.creator.CheckKitSettlement;
import net.class101.automateduitest.scenarios.creator.CheckOrderAndShippingTab;
import net.class101.automateduitest.scenarios.creator.CheckPlusSettlement;
import net.class101.automateduitest.scenarios.creator.CheckProductList;
import net.class101.automateduitest.scenarios.creator.CheckStockTab;
import net.class101.automateduitest.scenarios.creator.DeleteFirstProduct;
import net.class101.automateduitest.scenarios.creator.LoginAsCreatorHasClass;
import net.class101.automateduitest.scenarios.creator.LoginAsCreatorHasRevenue;
import net.class101.automateduitest.scenarios.creator.LoginAsCreatorNew;
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
        Configuration.timeout = 60000;
        //브라우저 창 위치 초기화
        Configuration.browserPosition = "0x0";
    }

    @Nested
    @DisplayName("코어 플랫폼")
    public class CorePlatform {
        @Nested
        @DisplayName("회원가입")
        public class SignUp {
            @BeforeAll
            static void beforeAll() {
                Home.Actions.openPage();
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @Test
            @DisplayName("회원가입 - 애플 로그인 페이지")
            void appleLoginPage() {
                SF.getInstance(CheckAppleLoginPage.class).proceed().validate();
            }

            @Test
            @DisplayName("회원가입 - 페이스북 로그인 페이지")
            void facebookLoginPage() {
                SF.getInstance(CheckFacebookLoginPage.class).proceed().validate();
            }

            @Test
            @DisplayName("회원가입 - 구글 로그인 페이지")
            void googleLoginPage() {
                SF.getInstance(CheckGoogleLoginPage.class).proceed().validate();
            }

            @Test
            @DisplayName("회원가입 - 카카오 로그인 페이지")
            void kakaoPage() {
                SF.getInstance(CheckKakaoLoginPage.class).proceed().validate();
            }

            @Test
            @DisplayName("회원가입 - 네이버 로그인 페이지")
            void naverPage() {
                SF.getInstance(CheckNaverLoginPage.class).proceed().validate();
            }

            @Test
            @DisplayName("회원가입 - 이메일로 시작하기")
            void emailSignUpPage() {
                SF.getInstance(CheckEmailSignUpPage.class).proceed().validate();
            }
        }

        @Nested
        @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
        @DisplayName("로그인")
        public class SignIn {

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
                SF.getInstance(Logout.class).proceed().validate();
            }

            @Test
            @Order(1)
            @DisplayName("네이버 로그인")
            void verifyNaverLogin() {
                SF.getInstance(LoginWithNaver.class).proceed().validate();
            }

            @Test
            @Order(3)
            @DisplayName("이메일 로그인")
            void verifyEmailLogin() {
                SF.getInstance(LoginAsNonSubscriber.class).proceed().validate();
            }

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
    public class WebsitePlatform {

        @Nested
        @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
        @DisplayName("미구독 유저")
        public class WithNonSubscribeAccount {

            @BeforeAll
            static void beforeAll() {
                Home.Actions.openPage();
                SF.getInstance(LoginAsNonSubscriber.class).proceed().validate();
            }

            @AfterEach
            void tearDown() {
                Home.Actions.openPage();
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @Test
            @DisplayName("큐레이션 섹션 및 클래스 상세정보")
            void verifyCurationSection() {
                SF.getInstance(CheckCurationSection.class).proceed().validate();
                SF.getInstance(CheckSubscriptionPlan.class).proceed().validate();
            }

            @Test
            @DisplayName("검색 기능")
            void verifySearchBar() {
                SF.getInstance(SearchKeyword.class).proceed().validate();
            }

            @Test
            @DisplayName("추천 카테고리")
            void verifyRecommendedCategory() {
                SF.getInstance(CheckRecommendedCategorySection.class).proceed().validate();
            }

            @Test
            @DisplayName("추천 클래스")
            void verifyRecommendedClass() {
                SF.getInstance(CheckRecommendedClassSection.class).proceed().validate();
            }

        }

        @Nested
        @DisplayName("구독 유저")
        public class WithSubscribedAccount {

            @BeforeAll
            static void beforeAll() {
                Home.Actions.openPage();
                SF.getInstance(LoginAsSubscriber.class).proceed().validate();
            }

            @AfterEach
            void tearDown() {
                Home.Actions.openPage();
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @Test
            @DisplayName("내 클래스 섹션 검증")
            void verifyMyClass() {
                SF.getInstance(CheckMyClassSection.class).proceed().validate();
            }

            @Test
            @DisplayName("찜하기 추가 / 제거")
            void verifySaveClass() throws InterruptedException {
                SF.getInstance(SaveClass.class).proceed().validate();
                SF.getInstance(UnSaveClass.class).proceed().validate();
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
                SF.getInstance(LoginAsNonSubscriber.class).proceed().validate();
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @AfterEach
            void tearDown() {
                Home.Actions.openPage();
            }

            @Test
            @DisplayName("마이페이지 캐시탭 확인")
            void verifyMyPageCashTab() {
                SF.getInstance(CheckCashTab.class).proceed().validate();
            }

            @Test
            @DisplayName("마이페이지 구독 탭 확인 - 미구독")
            void verifyMyPageSubscriptionStatus() {
                SF.getInstance(CheckSubscriptionStatusFalse.class).proceed().validate();
            }

            @Test
            @DisplayName("마이페이지 서비스 리전 변경 기능 확인")
            void verifyMyPageServiceRegion() {
                SF.getInstance(ChangeServiceRegionEN.class).proceed().validate();
                SF.getInstance(ChangeServiceRegionJP.class).proceed().validate();
            }

            @Test
            @DisplayName("마이페이지 좌측 네비게이션 메뉴 페이지 이동 확인")
            void verifyMyPageMenu() {
                SF.getInstance(CheckOrderTab.class).proceed().validate();
                SF.getInstance(CheckReferralTab.class).proceed().validate();
                SF.getInstance(CheckCreatorCenterTab.class).proceed().validate();
                SF.getInstance(CheckFAQTab.class).proceed().validate();
                SF.getInstance(CheckEnquiryTab.class).proceed().validate();
                SF.getInstance(CheckSettingTab.class).proceed().validate();
            }
        }

        @Nested
        @DisplayName("구독 유저")
        public class WithSubscribedAccount {

            @BeforeAll
            static void beforeAll() {
                Home.Actions.openPage();
                SF.getInstance(LoginAsSubscriber.class).proceed().validate();
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @AfterEach
            void tearDown() {
                Home.Actions.openPage();
            }

            @Test
            @DisplayName("마이페이지 구독 탭 확인 - 구독")
            void verifyMyPageSubscriptionStatus() {
                SF.getInstance(CheckSubscriptionStatusTrue.class).proceed().validate();
            }

            @Test
            @DisplayName("영상 재생 확인")
            void verifyVideoPlay() {
                SF.getInstance(CheckPlayLecture.class).proceed().validate();
            }

            @Test
            @DisplayName("플레이어 기능 확인")
            void verifyVideoPlayerFunctionality() {
                SF.getInstance(CheckPlayLecture.class).proceed();
                SF.getInstance(ChangePlaySpeed.class).proceed().validate();
                SF.getInstance(ChangeVideoQuality.class).proceed().validate();
                SF.getInstance(ChangeAutoPlay.class).proceed().validate();
            }

            @Test
            @DisplayName("수강환경 탭 메뉴 확인")
            void lectureTabMenu() {
                SF.getInstance(CheckLectureTabMenu.class).proceed().validate();
            }
        }
    }

    @Nested
    @DisplayName("크리에이터 플랫폼")
    public class CreatorPlatform {
        @Nested
        @DisplayName("크리에이터 상품 테스트 계정")
        public class CreatorProductTestAccount {

            @BeforeAll
            static void beforeAll() {
                CreatorHome.Actions.openPage();
                SF.getInstance(LoginAsCreatorNew.class).proceed().validate();
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @BeforeEach
            void setUp() {
                CreatorProductPage.Elements.creatorCenterLogo().click();
            }

            @AfterEach
            void tearDown() {
                SF.getInstance(DeleteFirstProduct.class).proceed();
            }

            @Test
            @DisplayName("클래스 만들기")
            void addClass() {
                SF.getInstance(CheckAddClass.class).proceed().validate();
            }

            @Test
            @DisplayName("디지털 파일 만들기")
            void addDigitalFile() {
                SF.getInstance(CheckAddDigitalFile.class).proceed().validate();
            }

            @Test
            @DisplayName("전자책 만들기")
            void addEBook() {
                SF.getInstance(CheckAddEBook.class).proceed().validate();
            }
        }

        @Nested
        @DisplayName("크리에이터 클래스 정보 테스트 계정")
        public class CreatorClassTestAccount {

            @BeforeAll
            static void beforeAll() {
                CreatorHome.Actions.openPage();
                SF.getInstance(LoginAsCreatorHasClass.class).proceed().validate();
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @AfterEach
            void tearDown() {
                CreatorHome.Actions.openPage();
            }

            @Test
            @DisplayName("상품 리스트 목록")
            void productList() {
                SF.getInstance(CheckProductList.class).proceed().validate();
            }

            @Test
            @DisplayName("클래스 댓글 페이지")
            void commentPage() {
                SF.getInstance(CheckClassCommentTab.class).proceed().validate();
            }

            @Test
            @DisplayName("클래스 댓글 페이지 답변완료")
            void commentAnswered() {
                SF.getInstance(CheckCommentAnswered.class).proceed().validate();
            }

            @Test
            @DisplayName("클래스 댓글 페이지 답변 대기중")
            void commentNotAnswered() {
                SF.getInstance(CheckCommentNotAnswered.class).proceed().validate();
            }

            @Test
            @DisplayName("클래스 소식")
            void classNews() {
                SF.getInstance(CheckClassNews.class).proceed().validate();
            }

            @Test
            @DisplayName("파일 요청 내역")
            void fileRequestTab() {
                SF.getInstance(CheckFileRequestTab.class).proceed().validate();
            }

            @Test
            @DisplayName("주문 및 배송")
            void orderAndShippingTab() {
                SF.getInstance(CheckOrderAndShippingTab.class).proceed().validate();
            }

            @Test
            @DisplayName("재고")
            void stockTab() {
                SF.getInstance(CheckStockTab.class).proceed().validate();
            }

            @Test
            @DisplayName("클래스 정산")
            void classSettlement() {
                SF.getInstance(CheckClassSettlement.class).proceed().validate();
            }
            @Test
            @DisplayName("키트 정산")
            void kitSettlement() {
                SF.getInstance(CheckKitSettlement.class).proceed().validate();
            }

            @Test
            @DisplayName("크리에이터 가이드 센터")
            void creatorGuideCenter() {
                SF.getInstance(CheckCreatorGuideTab.class).proceed().validate();
            }
        }

        @Nested
        @DisplayName("크리에이터 정산 테스트 계정")
        public class CreatorHasRevenue {
            @BeforeAll
            static void beforeAll() {
                CreatorHome.Actions.openPage();
                SF.getInstance(LoginAsCreatorHasRevenue.class).proceed().validate();
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @AfterEach
            void tearDown() {
                CreatorHome.Actions.openPage();
            }

            @Test
            @DisplayName("클래스101+ 초대")
            void    referralTab() {
                SF.getInstance(CheckCreatorReferralTab.class).proceed().validate();
            }

            @Test
            @DisplayName("클래스101+ 정산")
            void plusSettlement() {
                SF.getInstance(CheckPlusSettlement.class).proceed().validate();
            }

        }
    }

    @Nested
    @DisplayName("커머스 플랫폼")
    public class CommercePlatform {

        @Nested
        @DisplayName("미구독 계정")
        public class NonSubscriber {
            @BeforeAll
            static void beforeAll() {
                Home.Actions.openPage();
                SF.getInstance(LoginAsNonSubscriber.class).proceed().validate();
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @AfterEach
            void tearDown() {
                Home.Actions.openPage();
            }

            @Test
            void yearlyPlan() {
                SF.getInstance(CheckYearlySubscription.class).proceed().validate();
            }
        }

        @Nested
        @DisplayName("연간 구독 계정")
        public class Subscriber {

            @BeforeAll
            static void beforeAll() {
                Home.Actions.openPage();
                SF.getInstance(LoginAsYearlySubscriber.class).proceed().validate();
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @AfterEach
            void tearDown() {
                Home.Actions.openPage();
            }

            @Test
            @DisplayName("준비물 구매")
            void buyKit() {
                SF.getInstance(CheckKitPurchase.class).proceed().validate();
            }

            @Test
            @DisplayName("구독 취소")
            void cancelSubscription() {
                SF.getInstance(CheckCancelSubscription.class).proceed().validate();
            }

            @Test
            @DisplayName("구독 환불")
            void refundSubscription() {
                SF.getInstance(CheckRefundSubscription.class).proceed().validate();
            }
        }

        @Nested
        @DisplayName("키트 계정")
        public class UserHasKit {

            @BeforeAll
            static void beforeAll() {
                Home.Actions.openPage();
                SF.getInstance(LoginAsUserHasKit.class).proceed().validate();
            }

            @AfterAll
            static void afterAll() {
                closeWebDriver();
            }

            @AfterEach
            void tearDown() {
                Home.Actions.openPage();
            }

            @Test
            @DisplayName("주문 및 배송 진입")
            void orderHistory() {
                SF.getInstance(CheckOrderHistory.class).proceed().validate();
            }

            @Test
            @DisplayName("주문 및 배송 자세히 보기")
            void orderDetail() {
                SF.getInstance(CheckOrderDetail.class).proceed().validate();
            }

            @Test
            @DisplayName("키트 환불")
            void refundKit() {
                SF.getInstance(CheckRefundKit.class).proceed().validate();
            }
        }
    }
}
