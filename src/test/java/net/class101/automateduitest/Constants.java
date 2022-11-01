package net.class101.automateduitest;

import com.codeborne.selenide.Selectors;
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
    public static final By MY_PAGE_LOGOUT_BUTTON = Selectors.withText("로그아웃");

}
