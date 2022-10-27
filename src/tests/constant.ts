const USER_NAVIGATION_LOGIN_BUTTON = "//a[contains(@href,'login')]";
const SIGN_IN_WITH_OTHER_METHODS_BUTTON = "//a[contains(@href,'login/all') and contains(.,'다른')]";
const CLASS101_ID_FORM = "//input[@name='email']";
const CLASS101_PASSWORD_FORM = "//input[@name='password']";
const FACEBOOK_ID_FORM = "//input[@id='email']";
const FACEBOOK_PASSWORD_FORM = "//input[@name='pass']";
const FACEBOOK_LOGIN_BUTTON = "//button[@id='loginbutton']";
const CLASS101_USER_ID = 'referral_1@101.inc';
const CLASS101_PASSWORD = 'class101!';
const FACEBOOK_USER_ID = 'steven@101.inc';
const FACEBOOK_PASSWORD = 'class101!';
const LOGIN_PAGE_LOGIN_BUTTON = "//button[@type='submit' and contains(.,'로그인')]";
const LOGIN_PAGE_FACEBOOK_BUTTON = "//button[contains(.,'페이스북')]";
const LOGIN_PAGE_NAVER_BUTTON = "//button[contains(.,'네이버')]";
const USER_NAVIGATION_PROFILE_THUMBNAIL = "//img[@alt='profile']";
const CLASS101_SUBSCRIPTION_URL_STAGING = 'https://staging.class101.net/plus/ko';
const MY_PAGE_LOGOUT_BUTTON = "//button[contains(.,'로그아웃')]";
const NAVER_ID_FORM = "//input[@id='id']";
const NAVER_PASSWORD_FORM = "//input[@id='pw']";
const NAVER_LOGIN_BUTTON = "//button[@class='btn_login']";
const NAVER_USER_ID = 'candy6731';
const NAVER_PASSWORD = 'class101!';
const FIRST_SAVE_BUTTON_ON_TRENDING_NOW = '//section[contains(.,\'실시간 인기 클래스\')]/div[3]/div/div/div/div/div/button';
const SAVED_CLASSES_TITLE = "//h4[contains(.,'찜한 클래스')]";

export default {
  USER_NAVIGATION_LOGIN_BUTTON,
  SIGN_IN_WITH_OTHER_METHODS_BUTTON,
  CLASS101_ID_FORM,
  CLASS101_PASSWORD_FORM,
  FACEBOOK_ID_FORM,
  FACEBOOK_PASSWORD_FORM,
  CLASS101_USER_ID,
  CLASS101_PASSWORD,
  FACEBOOK_USER_ID,
  FACEBOOK_PASSWORD,
  FACEBOOK_LOGIN_BUTTON,
  LOGIN_PAGE_LOGIN_BUTTON,
  USER_NAVIGATION_PROFILE_THUMBNAIL,
  LOGIN_PAGE_FACEBOOK_BUTTON,
  CLASS101_SUBSCRIPTION_URL_STAGING,
  MY_PAGE_LOGOUT_BUTTON,
  LOGIN_PAGE_NAVER_BUTTON,
  NAVER_ID_FORM,
  NAVER_PASSWORD_FORM,
  NAVER_LOGIN_BUTTON,
  NAVER_USER_ID,
  NAVER_PASSWORD,
  FIRST_SAVE_BUTTON_ON_TRENDING_NOW,
  SAVED_CLASSES_TITLE,
};
