package net.class101.automateduitest;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public final class Constants {
    public static final String STAGING_URL = "https://staging.class101.net/plus/ko";
    public static final String CLASS101_USER_ID = "referral_1@101.inc";
    public static final String CLASS101_PASSWORD = "class101!";
    public static final String CLASS101_EMAIL_INPUT_FIELD = "input[name='email']";
    public static final String CLASS101_PASSWORD_INPUT_FIELD = "input[name='password']";
    public static final String LOGIN_PAGE_LOGIN_BUTTON = "button[type='submit']";
    public static final String USER_NAVIGATION_PROFILE_IMG = "img[alt='profile']";
    public static final By USER_NAVIGATION_LOGIN_BUTTON = Selectors.withText("로그인");
    public static final By LOGIN_PAGE_ALL_LOGIN_BUTTON = Selectors.withText("다른 방법으로 로그인");
    public static final By LOGIN_PAGE_NAVER_BUTTON = Selectors.withText("네이버");
    public static final By LOGIN_PAGE_FACEBOOK_BUTTON = Selectors.withText("페이스북");
    public static final By MY_PAGE_LOGOUT_BUTTON = Selectors.withText("로그아웃");
    public static final String FACEBOOK_EMAIL_INPUT_FIELD = "input[id='email']";
    public static final String FACEBOOK_PASSWORD_INPUT_FIELD = "input[name='pass']";
    public static final String FACEBOOK_LOGIN_BUTTON = "button[type='submit']";
    public static final String FACEBOOK_USER_ID = "steven@101.inc";
    public static final String FACEBOOK_PASSWORD = "class101!";
    public static final String NAVER_ID_INPUT_FIELD = "input[id='id']";
    public static final String NAVER_PASSWORD_INPUT_FIELD = "input[id='pw']";
    public static final String NAVER_LOGIN_BUTTON = "button[class='btn_login']";
    public static final String NAVER_USER_ID = "candy6731";
    public static final String NAVER_PASSWORD = "class101!";
    public static final String SEARCH_BAR = "input";
    public static final By TRENDING_CLASS_SECTION = Selectors.withText("실시간 인기 클래스");
    public static final By FIRST_SAVE_BUTTON_ON_TRENDING_NOW = Selectors.byXpath("//section[contains(.,'실시간 인기 클래스')]/div[3]/div/div/div/div/div/button");
    public static final By FIRST_SAVE_BUTTON_ON_SAVED_CLASS = Selectors.byXpath("//section[contains(.,'찜한 클래스')]/div[3]/div/div/div/div/div/div[2]");
    public static final By SAVED_CLASSES_SECTION_TITLE = Selectors.byXpath("//h4[contains(.,'찜한 클래스')]");
    public static final By RECOMMENDATION_SECTION = Selectors.withText("추천 클래스");
//    public static final By FIRST_ITEM_OF_COOKING_SECTION = Selectors.byXpath("//section[contains(.,'요리 클래스')]/div[3]/div/div/div/div");
//    public static final By FIRST_ITEM_OF_TRENDING_NOW = Selectors.byXpath("//section[contains(.,'인기 클래스')]/div[3]/div/div/div/div");
//    public static final By USER_NAVIGATION_LOGO = Selectors.byXpath("//a[@href='/plus/ko']");
//    public static final By FIRST_RECOMMENDATION_CLASS_TITLE = Selectors.byXpath("//section[contains(.,'추천 클래스')]/div[3]/div/div/div/div/div/div/a/div[2]/span");
    public static final By FIRST_CURATION_ITEM = Selectors.byXpath("//img[@alt='desktop-hero-banner']");
    public static final By CLASS101_PLUS_SUBSCRIBE_BUTTON = Selectors.withText("시작하기");
    public static final By SUBSCRIPTION_PLAN_TITLE = Selectors.withText("구독 상품");
    public static final By RECOMMENDATION_CATEGORY_SECTION = Selectors.withText("관심 클래스를 발견하지 못하셨나요?");
    public static final By ENGLISH_CATEGORY_BUTTON = Selectors.byXpath("//button[contains(.,'영어')]");
    public static final By ENGLISH_PLP_TITLE = Selectors.byXpath("//h1[contains(.,'영어')]");
    public static final String CLASS_HISTORY_USER_ID = "sbtestc422@101.inc";
    public static final String CLASS_HISTORY_PASSWORD = "test001!";

}
