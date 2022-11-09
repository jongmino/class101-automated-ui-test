package net.class101.automateduitest.Common;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static net.class101.automateduitest.Common.Util.urlContains;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.class101.automateduitest.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public final class Behaviors {

    /**
     * 설정 적용 및 웹드라이버 실행
     */
    public static void openUrl(String url) {
        //브라우저 크기 최대화
        Configuration.browserSize = "1920x1080";
        //테스트 타임아웃 20초
        Configuration.timeout = 20000;
        //브라우저 창 위치 초기화
        Configuration.browserPosition = "0x0";
        open(url);
    }

    /**
     * 자체 로그인 검증
     */
    public static void loginWithEmail(String userId, String password) {
        //유저 네비게이션 우상단 로그인 버튼 클릭
        $(Constants.USER_NAVIGATION_LOGIN_BUTTON).click();
        //다른 방법으로 로그인 버튼 클릭
        $(Constants.LOGIN_PAGE_ALL_LOGIN_BUTTON).click();
        //아이디 입력 필드에 아이디 입력
        $(Constants.CLASS101_EMAIL_INPUT_FIELD).sendKeys(userId);
        //비밀번호 입력 필드에 비밀번호 입력
        $(Constants.CLASS101_PASSWORD_INPUT_FIELD).sendKeys(password);
        //로그인 버튼 클릭
        $(Constants.LOGIN_PAGE_LOGIN_BUTTON).click();
        //유저 네비게이션 우상단 프로필 이미지로 로그인 성공 확인
        $(Constants.USER_NAVIGATION_PROFILE_IMG).shouldBe(Condition.visible).click();
    }

    /**
     * 페이스북 로그인 검증
     */
    public static void loginWithFaceBook(String userId, String password) {
        //유저 네비게이션 우상단 로그인 버튼 클릭
        $(Constants.USER_NAVIGATION_LOGIN_BUTTON).click();
        //다른 방법으로 로그인 버튼 클릭
        $(Constants.LOGIN_PAGE_ALL_LOGIN_BUTTON).click();
        //페이스북으로 로그인 버튼 클릭
        $(Constants.LOGIN_PAGE_FACEBOOK_BUTTON).click();
        //페이스북 아이디 입력 필드에 아이디 입력
        $(Constants.FACEBOOK_EMAIL_INPUT_FIELD).sendKeys(Constants.FACEBOOK_USER_ID);
        //페이스북 비밀번호 입력 필드에 비밀번호 입력
        $(Constants.FACEBOOK_PASSWORD_INPUT_FIELD).sendKeys(Constants.FACEBOOK_PASSWORD);
        //로그인 버튼 클릭
        $(Constants.FACEBOOK_LOGIN_BUTTON).click();
        //유저 네비게이션 우상단 프로필 이미지로 로그인 성공 확인
        $(Constants.USER_NAVIGATION_PROFILE_IMG).shouldBe(Condition.visible).click();
    }

    /**
     * 네이버 로그인 검증
     * 네이버 로그인은 오토메이션을 잡아내기 때문에 클립보드를 이용하는 방법으로 우회
     */
    public static void loginWithNaver(String userId, String password) throws InterruptedException {
        SelenideElement naverEmailField = $(Constants.NAVER_ID_INPUT_FIELD);
        SelenideElement naverPasswordField = $(Constants.NAVER_PASSWORD_INPUT_FIELD);

        //우상단 로그인 버튼 클릭
        $(Constants.USER_NAVIGATION_LOGIN_BUTTON).click();
        //다른 방법으로 로그인 버튼 클릭
        $(Constants.LOGIN_PAGE_ALL_LOGIN_BUTTON).click();
        //네이버로 로그인하기 버튼 클릭
        $(Constants.LOGIN_PAGE_NAVER_BUTTON).click();

        //네이버 로그인 아이디 입력 필드 클릭
        naverEmailField.click();
        //클립보드에 아이디 복사
        Selenide.clipboard().setText(userId);
        //붙여넣기
        naverEmailField.sendKeys(Util.paste());

        Thread.sleep(1000);

        //같은 방법으로 비밀번호 입력
        naverPasswordField.click();
        Selenide.clipboard().setText(password);
        naverPasswordField.sendKeys(Util.paste());

        Thread.sleep(1000);

        $(Constants.NAVER_LOGIN_BUTTON).click();
        //유저 네비게이션 우상단 프로필 이미지로 로그인 성공 확인
        $(Constants.USER_NAVIGATION_PROFILE_IMG).shouldBe(Condition.visible).click();
    }

    /**
     * Login Needed
     * 로그아웃 검증
     */
    public static void logout() {
        //우상단 유저 프로필 클릭
        $(Constants.USER_NAVIGATION_PROFILE_IMG).click();

        //마이페이지 로그아웃 버튼 클릭
        $(Constants.MY_PAGE_LOGOUT_BUTTON).click();

        //인기 클래스 섹션 확인으로 정상 로그아웃 및 홈으로 이동 확인
        //> 정상 로그아웃 됐으나 이미지 프로필 컴포넌트가 업데이트 안되는 경우가 있어서
        //> 해당 방법으로 우회
        $(Constants.TRENDING_CLASS_SECTION).shouldBe(Condition.visible);
    }

    /**
     * Login Needed
     * 큐레이션 아이템 및 클래스 상세정보 검증
     */
    public static void verifyCurationItemAndClassInformation() throws InterruptedException {
        //큐레이션 아이템 클릭
        $(Constants.FIRST_CURATION_ITEM).click();

        //클래스 상세페이지에서 클래스소개 및 크리에이터 탭 확인
        $(Constants.CLASS_INTRODUCTION_TAB_ON_PDP).shouldBe(Condition.visible);
        $(Constants.CREATOR_INTRODUCTION_TAB_ON_PDP).shouldBe(Condition.visible);

        Thread.sleep(2000);

        //(비구독) 구독 시작하기 버튼 클릭
        $(Constants.CLASS101_PLUS_SUBSCRIBE_BUTTON).click();
        //플랜 선택 페이지 이동 확인
        $(Constants.SUBSCRIPTION_PLAN_TITLE).shouldBe(Condition.visible);
    }

    /**
     * Login Needed
     * 수강중인 클래스 섹션 검증
     */
    public static void verifyMyClassSection() {
        //내 클래스 섹션 확인
        $(Constants.MY_CLASS_SECTION).shouldBe(Condition.visible);
    }

    /**
     * 추천 카테고리 검증
     */
    public static void verifyRecommendedCategorySection() throws InterruptedException {
        //추천 카테고리 섹션 확인
        $(Constants.RECOMMENDED_CATEGORY_SECTION).shouldBe(Condition.visible);
        //영어 카테고리 클릭
        $(Constants.ENGLISH_CATEGORY_BUTTON).click();
        Thread.sleep(1000);
        //카테고리 페이지로 이동 확인
        assertTrue(urlContains("categories"));

        //영어 회화 서브카테고리 클릭
        $(Constants.SUBCATEGORY_ENGLISH_COMMUNICATION).click();
        Thread.sleep(1000);
        //URL 상의 Category ID로 페이지 이동 확인
        assertTrue(WebDriverRunner.url().contains(Constants.SUBCATEGORY_ID_ENGLISH_COMMUNICATION));
    }

    /**
     * Login Needed
     * 추천 클래스 섹션 검증
     */
    public static void verifyRecommendedClassSection() {
        //추천 클래스 섹션 확인
        $(Constants.RECOMMENDED_CLASS_SECTION).shouldBe(Condition.visible);

//        SelenideElement firstRecommendationClassTitle = $(Constants.FIRST_RECOMMENDATION_CLASS_TITLE);
//        String firstRecommendationClassTitleBeforeChange = firstRecommendationClassTitle.getText();
//
//        $(Constants.FIRST_ITEM_OF_COOKING_SECTION).click();
//        Selenide.refresh();
//        $(Constants.USER_NAVIGATION_LOGO).click();
//
//        String firstRecommendationClassTitleAfterChange = firstRecommendationClassTitle.getText();
//
//        $(Constants.FIRST_ITEM_OF_TRENDING_NOW).click();
//        Selenide.refresh();
//        $(Constants.USER_NAVIGATION_LOGO).click();
//
//        assertNotEquals(firstRecommendationClassTitleBeforeChange, firstRecommendationClassTitleAfterChange, "recommendation classes should not be same after viewing PDP page");
    }

    /**
     * Login Needed
     * 찜하기 검증
     */
    public static void saveAndUnSaveClass() throws InterruptedException {

        //실시간 인기 클래스 첫번째 아이템 찜하기
        $(Constants.FIRST_SAVE_BUTTON_ON_TRENDING_NOW).click();
        Thread.sleep(3000);
        //찜하기 섹션 생성 확인
        $(Constants.SAVED_CLASSES_SECTION_TITLE).shouldBe(Condition.visible);

        Thread.sleep(3000);
        //실시간 인기 클래스 첫번째 아이템 찜하기 취소
        $(Constants.FIRST_SAVE_BUTTON_ON_TRENDING_NOW).click();
        //찜하기 섹션 사라짐 확인
        $$(Constants.SAVED_CLASSES_SECTION_TITLE).shouldBe(CollectionCondition.size(0));
    }

    /**
     * 검색기능 검증
     */
    public static void searchKeyword() throws InterruptedException {
        //검색창 클릭
        $(Constants.SEARCH_BAR).click();
        //검색 패널 확인
        $(Constants.SEARCH_PANEL_TITLE).shouldBe(Condition.visible);
        //검색 키워드 입력
        $(Constants.SEARCH_BAR_INPUT_AFTER_CLICK).sendKeys("공예");
        //검색
        $(Constants.SEARCH_BAR_INPUT_AFTER_CLICK).pressEnter();
        Thread.sleep(2000);
        //검색 결과 확인
        $(Constants.SEARCH_RESULT_CRAFTS_CATEGORY).shouldBe(Condition.visible);
    }

    public static void checkCashTab() {
        //유저 네비게이션 프로필 이미지 클릭
        $(Constants.USER_NAVIGATION_PROFILE_IMG).click();
        //캐시탭 확인
        $(Constants.MY_PAGE_CASH_TAB).shouldBe(Condition.visible);
    }

    public static void checkSubscriptionStatusWithNonSubscribed() {
        //유저 네비게이션 프로필 이미지 클릭
        $(Constants.USER_NAVIGATION_PROFILE_IMG).click();
        //캐시탭 확인
        $(Constants.MY_PAGE_SUBSCRIPTION_STATUS_NON).shouldBe(Condition.visible);
    }


    public static void checkSubscriptionStatusWithSubscribed() {
        //유저 네비게이션 프로필 이미지 클릭
        $(Constants.USER_NAVIGATION_PROFILE_IMG).click();
        //캐시탭 확인
        $(Constants.MY_PAGE_SUBSCRIPTION_STATUS_SUBSCRIBED).shouldBe(Condition.visible);
    }
    public static void checkMyPageMenu() throws InterruptedException {
        //유저 네비게이션 프로필 이미지 클릭
        $(Constants.USER_NAVIGATION_PROFILE_IMG).click();
        //주문 및 배송 탭 확인
        $(Constants.MY_PAGE_ORDER_TAB).click();
        Thread.sleep(500);
        assertTrue(urlContains("orders"));
        //친구초대 탭 확인
        $(Constants.MY_PAGE_REFERRAL_TAB).click();
        Thread.sleep(500);
        assertTrue(urlContains("classmate-referral"));
        //크리에이터 센터 탭 확인
        $(Constants.MY_PAGE_CREATOR_CENTER_TAB).click();
        Thread.sleep(500);
        assertTrue(urlContains("creator.class101.net"));
        open(Constants.STAGING_PLUS_MY_PAGE_URL);
        //자주 묻는 질문 탭 확인
        $(Constants.MY_PAGE_FAQ_TAB).shouldBe(Condition.visible);
        //1:1 문의 탭 확인
        $(Constants.MY_PAGE_ENQUIRY_TAB).click();
        Thread.sleep(500);
        $(Constants.CHANNEL_TALK_MODAL).shouldBe(Condition.visible);
        //설정 탭 확인
        $(Constants.MY_PAGE_SETTING_TAB).click();
        Thread.sleep(500);
        assertTrue(urlContains("setting"));
    }

    public static void changeServiceRegion() throws InterruptedException {
        //유저 네비게이션 프로필 이미지 클릭
        $(Constants.USER_NAVIGATION_PROFILE_IMG).click();
        //설정 탭 클릭
        $(Constants.MY_PAGE_SETTING_TAB).click();
        //지역변경 버튼 클릭
        $(Constants.SETTING_SERVICE_REGION_BUTTON).click();
        //영어로 변경
        $(Constants.SERVICE_REGION_US_BUTTON).click();

        Thread.sleep(1000);
        assertTrue(urlContains("en"));


        open(Constants.STAGING_PLUS_MY_PAGE_URL);
        //설정 탭 클릭
        $(Constants.MY_PAGE_SETTING_TAB).click();
        //지역변경 버튼 클릭
        $(Constants.SETTING_SERVICE_REGION_BUTTON).click();
        //일본어로 변경
        $(Constants.SERVICE_REGION_JP_BUTTON).click();

        Thread.sleep(1000);
        assertTrue(urlContains("ja"));

    }

    public static void playClass() {
        $(Constants.FIRST_CURATION_ITEM).click();
        $(Constants.PLAY_BUTTON_ON_PDP).click();
        $(Constants.VIDEO_PLAYING).shouldBe(Condition.visible);
    }


    public static void creatorCenterCategory() throws InterruptedException {
        List<By> categorySelectors = new ArrayList<>();
        categorySelectors.add(Constants.FIRST_CATEGORY_SELECTOR);
        categorySelectors.add(Constants.SECOND_CATEGORY_SELECTOR);
        categorySelectors.add(Constants.THIRD_CATEGORY_SELECTOR);
        categorySelectors.add(Constants.FOURTH_CATEGORY_SELECTOR);

        $(Constants.CLASS101_EMAIL_INPUT_FIELD).sendKeys(Constants.CREATOR_USER_ID);
        $(Constants.CLASS101_PASSWORD_INPUT_FIELD).sendKeys(Constants.CREATOR_PASSWORD);
        $(Constants.LOGIN_PAGE_LOGIN_BUTTON).click();
        Thread.sleep(5000);
        $(Constants.CREATE_PRODUCT_BUTTON).should(Condition.enabled).click();
        Thread.sleep(2000);
        $(Constants.CREATE_CLASS_BUTTON).click();
        $(Constants.CREATE_CLASS_PAGE_CATEGORY_SECTION).click();

        for(By selectorXPath: categorySelectors) {
            Thread.sleep(1000);
            if($$(selectorXPath).size() > 0){
                SelenideElement selector = $(selectorXPath);
                int optionSize = selector.findAll("option").size();
                selector.selectOption(new Random().nextInt(optionSize - 1));
            }
        }
    }

    public static void checkVideoPlayerFunctionality() throws InterruptedException {
        SelenideElement playSpeedButton = $(Constants.VIDEO_PLAY_SPEED_BUTTON);
        SelenideElement settingButton = $(Constants.VIDEO_SETTING_BUTTON);
        SelenideElement firstQualityOption = $(Constants.VIDEO_SETTING_FIRST_RADIO_OPTION_NOT_CHECKED);
        $(Constants.FIRST_CURATION_ITEM).click();
        $(Constants.PLAY_BUTTON_ON_PDP).click();
        $(Constants.VIDEO_PLAYING).hover();
        playSpeedButton.shouldBe(Condition.visible);

        //재생 속도 변경 확인
        String playSpeedSvgPathBefore = playSpeedButton.find("svg").find("path").getAttribute("d");
        Thread.sleep(1000);
        playSpeedButton.click();
        String playSpeedSvgPathAfter = playSpeedButton.find("svg").find("path").getAttribute("d");
        assertNotEquals(playSpeedSvgPathBefore, playSpeedSvgPathAfter);

        //화질 변경 확인
        settingButton.shouldBe(Condition.visible).click();
        $(Constants.VIDEO_SETTING_QUALITY_BUTTON).click();
        String qualityOptionValue = firstQualityOption.find("input").getValue();
        firstQualityOption.click();
        settingButton.click();
        Thread.sleep(1000);
        String currentQuality  = $(Constants.VIDEO_SETTING_QUALITY_CURRENT_VALUE).getText();
        assertTrue(currentQuality.contains(qualityOptionValue));

        //자동 재생 옵션 변경 확인
        $(Constants.VIDEO_SETTING_AUTO_PLAY_BUTTON).click();
        String autoPlayOptionValue = $(Constants.UNCHECKED_AUTO_PLAY_OPTION_TEXT).getText();
        firstQualityOption.click();
        settingButton.click();
        Thread.sleep(1000);
        String currentAutoPlayOption = $(Constants.VIDEO_SETTING_AUTO_PLAY_CURRENT_VALUE).getText();
        assertTrue(currentAutoPlayOption.contains(autoPlayOptionValue));
    }
}
