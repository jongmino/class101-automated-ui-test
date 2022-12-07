package net.class101.automateduitest.testGroups;

import static com.codeborne.selenide.Selenide.closeWebDriver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
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
import net.class101.automateduitest.scenarios.commerce.CheckRefundKit;
import net.class101.automateduitest.scenarios.core.LoginAsNonSubscriber;
import net.class101.automateduitest.scenarios.commerce.CheckKitPurchase;
import net.class101.automateduitest.scenarios.commerce.CheckOrderDetail;
import net.class101.automateduitest.scenarios.commerce.CheckOrderHistory;
import net.class101.automateduitest.scenarios.core.LoginAsSubscriber;
import net.class101.automateduitest.scenarios.core.LoginAsUserHasKit;
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
import net.class101.automateduitest.scenarios.creator.CheckOrderAndShippingTab;
import net.class101.automateduitest.scenarios.creator.CheckPlusSettlement;
import net.class101.automateduitest.scenarios.creator.CheckProductList;
import net.class101.automateduitest.scenarios.creator.CheckStockTab;
import net.class101.automateduitest.scenarios.creator.DeleteFirstProduct;
import net.class101.automateduitest.scenarios.creator.LoginAsCreatorHasClass;
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
            }

            @Test
            @DisplayName("회원가입 - 페이스북 로그인 페이지")
            void facebookLoginPage() {
            }

            @Test
            @DisplayName("회원가입 - 구글 로그인 페이지")
            void googleLoginPage() {
            }

            @Test
            @DisplayName("회원가입 - 카카오 로그인 페이지")
            void kakaoPage() {
            }

            @Test
            @DisplayName("회원가입 - 네이버 로그인 페이지")
            void naverPage() {
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

        }

        @Nested
        @DisplayName("구독 유저")
        public class WithSubscribedAccount {

            @BeforeAll
            static void beforeAll() {
                Home.Actions.openPage();
                LoginAsSubscriber.getInstance().proceed().validate();
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
                CheckMyClassSection.getInstance().proceed().validate();
            }


            @Test
            @DisplayName("찜하기 추가 / 제거")
            void verifySaveClass() throws InterruptedException {
                SaveClass.getInstance().proceed().validate();
                UnSaveClass.getInstance().proceed().validate();
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

            @AfterEach
            void tearDown() {
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

            @AfterEach
            void tearDown() {
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
                CheckPlayLecture.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("플레이어 기능 확인")
            void verifyVideoPlayerFunctionality() throws InterruptedException {
                CheckPlayLecture.getInstance().proceed();
                ChangePlaySpeed.getInstance().proceed().validate();
                ChangeVideoQuality.getInstance().proceed().validate();
                ChangeAutoPlay.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("수강환경 탭 메뉴 확인")
            void lectureTabMenu() {
                CheckLectureTabMenu.getInstance().proceed().validate();
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
                LoginAsCreatorNew.getInstance().proceed().validate();
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
                DeleteFirstProduct.getInstance().proceed();
            }

            @Test
            @DisplayName("클래스 만들기")
            void addClass() {
                CheckAddClass.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("디지털 파일 만들기")
            void addDigitalFile() {
                CheckAddDigitalFile.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("전자책 만들기")
            void addEBook() {
                CheckAddEBook.getInstance().proceed().validate();
            }
        }

        @Nested
        @DisplayName("크리에이터 클래스 정보 테스트 계정")
        public class CreatorClassTestAccount {

            @BeforeAll
            static void beforeAll() {
                CreatorHome.Actions.openPage();
                LoginAsCreatorHasClass.getInstance().proceed().validate();
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
                CheckProductList.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("클래스 댓글 페이지")
            void commentPage() {
                CheckClassCommentTab.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("클래스 댓글 페이지 답변완료")
            void commentAnswered() {
                CheckCommentAnswered.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("클래스 댓글 페이지 답변 대기중")
            void commentNotAnswered() {
                CheckCommentNotAnswered.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("클래스 소식")
            void classNews() {
                CheckClassNews.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("클래스101+ 초대")
            void referralTab() {
                CheckCreatorReferralTab.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("파일 요청 내역")
            void fileRequestTab() {
                CheckFileRequestTab.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("주문 및 배송")
            void orderAndShippingTab() {
                CheckOrderAndShippingTab.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("재고")
            void stockTab() {
                CheckStockTab.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("클래스 정산")
            void classSettlement() {
                CheckClassSettlement.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("클래스101+ 정산")
            void plusSettlement() {
                CheckPlusSettlement.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("키트 정산")
            void kitSettlement() {
                CheckPlusSettlement.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("크리에이터 가이드 센터")
            void creatorGuideCenter() {
                CheckCreatorGuideTab.getInstance().proceed().validate();
            }
        }
    }

    @Nested
    @DisplayName("커머스 플랫폼")
    public class CommercePlatform {

        @Nested
        @DisplayName("구독 계정")
        public class Subscriber{

            @BeforeAll
            static void beforeAll() {
                Home.Actions.openPage();
                LoginAsSubscriber.getInstance().proceed().validate();
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
                CheckKitPurchase.getInstance().proceed().validate();
            }
        }

        @Nested
        @DisplayName("키트 계정")
        public class UserHasKit{

            @BeforeAll
            static void beforeAll() {
                Home.Actions.openPage();
                LoginAsUserHasKit.getInstance().proceed().validate();
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
                CheckOrderHistory.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("주문 및 배송 자세히 보기")
            void orderDetail() {
                CheckOrderDetail.getInstance().proceed().validate();
            }

            @Test
            @DisplayName("키트 환불")
            void refundKit() {
                CheckRefundKit.getInstance().proceed().validate();
            }
        }
    }
}
