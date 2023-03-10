package net.class101.automateduitest.testGroups;

import static com.codeborne.selenide.Selenide.closeWebDriver;

import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.classmate.ChangeAutoPlay;
import net.class101.automateduitest.resources.testcases.classmate.ChangePlaySpeed;
import net.class101.automateduitest.resources.testcases.classmate.ChangeServiceRegionJP;
import net.class101.automateduitest.resources.testcases.classmate.ChangeServiceRegionToEN;
import net.class101.automateduitest.resources.testcases.classmate.ChangeVideoQuality;
import net.class101.automateduitest.resources.testcases.classmate.CheckCashTab;
import net.class101.automateduitest.resources.testcases.classmate.CheckCreatorCenterTab;
import net.class101.automateduitest.resources.testcases.classmate.CheckEnquiryTab;
import net.class101.automateduitest.resources.testcases.classmate.CheckFAQTab;
import net.class101.automateduitest.resources.testcases.classmate.CheckLectureTabMenu;
import net.class101.automateduitest.resources.testcases.classmate.CheckOrderTab;
import net.class101.automateduitest.resources.testcases.classmate.CheckPlayLecture;
import net.class101.automateduitest.resources.testcases.classmate.CheckReferralTab;
import net.class101.automateduitest.resources.testcases.classmate.CheckSettingTab;
import net.class101.automateduitest.resources.testcases.classmate.CheckSubscriptionStatusFalse;
import net.class101.automateduitest.resources.testcases.classmate.CheckSubscriptionStatusTrue;
import net.class101.automateduitest.resources.testcases.commerce.CheckCancelSubscription;
import net.class101.automateduitest.resources.testcases.commerce.CheckFreeTrial;
import net.class101.automateduitest.resources.testcases.commerce.CheckKitPurchase;
import net.class101.automateduitest.resources.testcases.commerce.CheckOrderDetail;
import net.class101.automateduitest.resources.testcases.commerce.CheckOrderHistory;
import net.class101.automateduitest.resources.testcases.commerce.CheckRefundKit;
import net.class101.automateduitest.resources.testcases.commerce.CheckRefundSubscription;
import net.class101.automateduitest.resources.testcases.commerce.CheckYearlySubscription;
import net.class101.automateduitest.resources.testcases.core.CheckAppleLoginPage;
import net.class101.automateduitest.resources.testcases.core.CheckEmailSignUpPage;
import net.class101.automateduitest.resources.testcases.core.CheckFacebookLoginPage;
import net.class101.automateduitest.resources.testcases.core.CheckGoogleLoginPage;
import net.class101.automateduitest.resources.testcases.core.CheckKakaoLoginPage;
import net.class101.automateduitest.resources.testcases.core.CheckNaverLoginPage;
import net.class101.automateduitest.resources.testcases.core.LoginAsNewUser;
import net.class101.automateduitest.resources.testcases.core.LoginAsNonSubscriber;
import net.class101.automateduitest.resources.testcases.core.LoginAsSubscriber;
import net.class101.automateduitest.resources.testcases.core.LoginAsUserHasKit;
import net.class101.automateduitest.resources.testcases.core.LoginAsYearlySubscriber;
import net.class101.automateduitest.resources.testcases.core.Logout;
import net.class101.automateduitest.resources.testcases.creator.CheckAddClass;
import net.class101.automateduitest.resources.testcases.creator.CheckAddDigitalFile;
import net.class101.automateduitest.resources.testcases.creator.CheckAddEBook;
import net.class101.automateduitest.resources.testcases.creator.CheckClassCommentTab;
import net.class101.automateduitest.resources.testcases.creator.CheckClassNews;
import net.class101.automateduitest.resources.testcases.creator.CheckClassSettlement;
import net.class101.automateduitest.resources.testcases.creator.CheckCommentAnswered;
import net.class101.automateduitest.resources.testcases.creator.CheckCommentNotAnswered;
import net.class101.automateduitest.resources.testcases.creator.CheckCreatorGuideTab;
import net.class101.automateduitest.resources.testcases.creator.CheckCreatorReferralTab;
import net.class101.automateduitest.resources.testcases.creator.CheckFileRequestTab;
import net.class101.automateduitest.resources.testcases.creator.CheckKitSettlement;
import net.class101.automateduitest.resources.testcases.creator.CheckOrderAndShippingTab;
import net.class101.automateduitest.resources.testcases.creator.CheckPlusSettlement;
import net.class101.automateduitest.resources.testcases.creator.CheckProductList;
import net.class101.automateduitest.resources.testcases.creator.CheckRequestClassReview;
import net.class101.automateduitest.resources.testcases.creator.CheckStockTab;
import net.class101.automateduitest.resources.testcases.creator.DeleteFirstProduct;
import net.class101.automateduitest.resources.testcases.creator.LoginAsCreatorHasClass;
import net.class101.automateduitest.resources.testcases.creator.LoginAsCreatorHasRevenue;
import net.class101.automateduitest.resources.testcases.creator.LoginAsCreatorNew;
import net.class101.automateduitest.resources.testcases.website.CheckCurationSection;
import net.class101.automateduitest.resources.testcases.website.CheckMyClassSection;
import net.class101.automateduitest.resources.testcases.website.CheckRecommendedCategorySection;
import net.class101.automateduitest.resources.testcases.website.CheckRecommendedClassSection;
import net.class101.automateduitest.resources.testcases.website.CheckSubCategory;
import net.class101.automateduitest.resources.testcases.website.CheckSubscriptionPlan;
import net.class101.automateduitest.resources.testcases.website.SaveClass;
import net.class101.automateduitest.resources.testcases.website.SearchKeyword;
import net.class101.automateduitest.resources.testcases.website.UnSaveClass;
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

@DisplayName("?????? ?????????")
@TestInstance(Lifecycle.PER_CLASS)
public class TestAll {

    @BeforeAll
    void beforeAll() {
        //test config
        Utils.setTestConfig();
    }

    @Nested
    @DisplayName("?????? ?????????")
    @TestInstance(Lifecycle.PER_CLASS)
    public class CorePlatform {

        @Nested
        @DisplayName("????????????")
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
            @DisplayName("???????????? - ?????? ????????? ?????????")
            void testAppleLoginPage() {
                SF.get(CheckAppleLoginPage.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("???????????? - ???????????? ????????? ?????????")
            void testFacebookLoginPage() {
                SF.get(CheckFacebookLoginPage.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("???????????? - ?????? ????????? ?????????")
            void testGoogleLoginPage() {
                SF.get(CheckGoogleLoginPage.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("???????????? - ????????? ????????? ?????????")
            void testKakaoPage() {
                SF.get(CheckKakaoLoginPage.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("???????????? - ????????? ????????? ?????????")
            void testNaverPage() {
                SF.get(CheckNaverLoginPage.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("???????????? - ???????????? ????????????")
            void testEmailSignUpPage() {
                SF.get(CheckEmailSignUpPage.class)
                    .proceed()
                    .validate();
            }
        }

        @Nested
        @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
        @DisplayName("?????????")
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
            @DisplayName("????????? ?????????")
            void testEmailLogin() {
                SF.get(LoginAsNonSubscriber.class)
                    .proceed()
                    .validate();
            }
//
//            @Test
//            @Order(2)
//            @DisplayName("????????? ?????????")
//            void testNaverLogin() {
//                SF.get(LoginWithNaver.class).proceed().validate();
//            }
//            @Test
//            @Order(3)
//            @DisplayName("???????????? ?????????")
//            void loginWithFacebook() {
//                SF.getInstance(LoginWithFacebook.class).proceed().validate();
//            }
        }

    }

    @Nested
    @DisplayName("???????????? ?????????")
    @TestInstance(Lifecycle.PER_CLASS)
    public class WebsitePlatform {

        @Nested
        @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
        @DisplayName("????????? ??????")
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
            @DisplayName("???????????? ?????? - ?????? ?????? ??????")
            void testSubscriptionPlan() {
                SF.get(CheckSubscriptionPlan.class)
                    .proceed()
                    .validate();
            }

        }

        @Nested
        @DisplayName("?????? ??????")
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
            @DisplayName("??? ????????? ?????? ??????")
            void testMyClass() {
                SF.get(CheckMyClassSection.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("????????? ?????? / ??????")
            void testSaveClass() throws InterruptedException {
                SF.get(SaveClass.class)
                    .proceed()
                    .validate();
                SF.get(UnSaveClass.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("?????? ??????")
            void testSearchBar() {
                SF.get(SearchKeyword.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("?????? ???????????? / ??????????????????")
            void testRecommendedCategory() {
                SF.get(CheckRecommendedCategorySection.class)
                    .proceed()
                    .validate();
                SF.get(CheckSubCategory.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("?????? ?????????")
            void testRecommendedClass() {
                SF.get(CheckRecommendedClassSection.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("???????????? ?????? ??? ????????? ????????????")
            void testCurationSection() {
                SF.get(CheckCurationSection.class)
                    .proceed()
                    .validate();
            }

        }
    }

    @Nested
    @DisplayName("?????????????????? ?????????")
    @TestInstance(Lifecycle.PER_CLASS)
    public class ClassmatePlatform {

        @Nested
        @DisplayName("????????? ??????")
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
            @DisplayName("??????????????? ?????? ??? ?????? - ?????????")
            void testMyPageSubscriptionStatus() {
                SF.get(CheckSubscriptionStatusFalse.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("??????????????? ?????? ??????????????? ?????? ????????? ?????? ??????")
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
        @DisplayName("?????? ??????")
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
            @DisplayName("??????????????? ????????? ??????")
            void testMyPageCashTab() {
                SF.get(CheckCashTab.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("??????????????? ????????? ?????? ?????? ?????? ??????")
            void testMyPageServiceRegion() {
                SF.get(ChangeServiceRegionToEN.class)
                    .proceed()
                    .validate();
                SF.get(ChangeServiceRegionJP.class)
                    .proceed()
                    .validate();
            }
            @Test
            @DisplayName("??????????????? ?????? ??? ?????? - ??????")
            void testMyPageSubscriptionStatus() {
                SF.get(CheckSubscriptionStatusTrue.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("?????? ?????? ??????")
            void testVideoPlay() {
                SF.get(CheckPlayLecture.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("???????????? ?????? ?????? - ?????? ??????")
            void testVideoPlayerPlaySpeed() {
                SF.get(ChangePlaySpeed.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("???????????? ?????? ?????? - ?????? ??????")
            void testVideoPlayerVideoQuality() {
                SF.get(ChangeVideoQuality.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("???????????? ?????? ?????? - ?????? ?????? ??????")
            void testVideoPlayerAutoPlay() {
                SF.get(ChangeAutoPlay.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("???????????? ??? ?????? ??????")
            void testLectureTabMenu() {
                SF.get(CheckLectureTabMenu.class)
                    .proceed()
                    .validate();
            }
        }
    }

    @Nested
    @DisplayName("??????????????? ?????????")
    @TestInstance(Lifecycle.PER_CLASS)
    public class CreatorPlatform {

        @Nested
        @DisplayName("??????????????? ?????? ????????? ??????")
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
            @DisplayName("????????? ?????????")
            void testAddClass() {
                SF.get(CheckAddClass.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("????????? ?????? ?????????")
            void testAddDigitalFile() {
                SF.get(CheckAddDigitalFile.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("????????? ?????????")
            void testAddEBook() {
                SF.get(CheckAddEBook.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("?????? ??????")
            void testRequestReview() {
                SF.get(CheckRequestClassReview.class)
                    .proceed()
                    .validate();
            }
        }

        @Nested
        @DisplayName("??????????????? ????????? ?????? ????????? ??????")
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
            @DisplayName("?????? ?????????")
            void testProductList() {
                SF.get(CheckProductList.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("????????? ?????? ?????????")
            void testCommentPage() {
                SF.get(CheckClassCommentTab.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("????????? ?????? ????????? ????????????")
            void testCommentAnswered() {
                SF.get(CheckCommentAnswered.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("????????? ?????? ????????? ?????? ?????????")
            void testCommentNotAnswered() {
                SF.get(CheckCommentNotAnswered.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("????????? ??????")
            void testClassNews() {
                SF.get(CheckClassNews.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("?????? ?????? ??????")
            void testFileRequestTab() {
                SF.get(CheckFileRequestTab.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("?????? ??? ??????")
            void testOrderAndShippingTab() {
                SF.get(CheckOrderAndShippingTab.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("??????")
            void testStockTab() {
                SF.get(CheckStockTab.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("????????? ??????")
            void testClassSettlement() {
                SF.get(CheckClassSettlement.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("?????? ??????")
            void testKitSettlement() {
                SF.get(CheckKitSettlement.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("??????????????? ????????? ??????")
            void testCreatorGuideCenter() {
                SF.get(CheckCreatorGuideTab.class)
                    .proceed()
                    .validate();
            }
        }

        @Nested
        @DisplayName("??????????????? ?????? ????????? ??????")
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
            @DisplayName("?????????101+ ??????")
            void testReferralTab() {
                SF.get(CheckCreatorReferralTab.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("?????????101+ ??????")
            void testPlusSettlement() {
                SF.get(CheckPlusSettlement.class)
                    .proceed()
                    .validate();
            }
        }
    }

    @Nested
    @DisplayName("????????? ?????????")
    @TestInstance(Lifecycle.PER_CLASS)
    public class CommercePlatform {

//        @Nested
//        @DisplayName("?????? ??????")
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
//            @DisplayName("?????? ??????")
//            void testFreeTrial() {
//                SF.get(CheckFreeTrial.class)
//                    .proceed()
//                    .validate();
//            }
//        }

        @Nested
        @DisplayName("????????? ??????")
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
            @DisplayName("?????? ??????")
            void testYearlyPlan() {
                SF.get(CheckYearlySubscription.class)
                    .proceed()
                    .validate();
            }
        }

        @Nested
        @DisplayName("?????? ?????? ??????")
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

//            TODO(Boulder): ????????? ????????? ?????? ????????? ??????
//            @Test
//            @DisplayName("????????? ??????")
//            void testBuyKit() {
//                SF.get(CheckKitPurchase.class)
//                    .proceed()
//                    .validate();
//            }

            @Test
            @DisplayName("?????? ??????")
            void testCancelSubscription() {
                SF.get(CheckCancelSubscription.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("?????? ??????")
            void testRefundSubscription() {
                SF.get(CheckRefundSubscription.class)
                    .proceed()
                    .validate();
            }
        }

        @Nested
        @DisplayName("?????? ??????")
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
            @DisplayName("?????? ??? ?????? ??????")
            void testOrderHistory() {
                SF.get(CheckOrderHistory.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("?????? ??? ?????? ????????? ??????")
            void testOrderDetail() {
                SF.get(CheckOrderDetail.class)
                    .proceed()
                    .validate();
            }

            @Test
            @DisplayName("?????? ??????")
            void testRefundKit() {
                SF.get(CheckRefundKit.class)
                    .proceed()
                    .validate();
            }
        }
    }
}
