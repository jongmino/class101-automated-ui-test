import Constant from '../constant';
import Common from '../../utils';

const { Browser } = require('selenium-webdriver');

describe('chrome', () => {
  let chromeBrowser: any;
  beforeAll(() => {
    chromeBrowser = new Common(Browser.CHROME);
    chromeBrowser.get('https://staging.class101.net/');
  });

  afterAll(() => {
    chromeBrowser.quit();
  });

  test('login with facebook', async () => {
    const userNavigationLoginButton = await chromeBrowser
      .getElement(Constant.USER_NAVIGATION_LOGIN_BUTTON);
    userNavigationLoginButton.click();

    const loginWithOtherMethodButton = await chromeBrowser
      .getElement(Constant.SIGN_IN_WITH_OTHER_METHODS_BUTTON);
    loginWithOtherMethodButton.click();

    const loginWithFaceBookButton = await chromeBrowser
      .getElement(Constant.LOGIN_PAGE_FACEBOOK_BUTTON);
    loginWithFaceBookButton.click();

    const emailField = await chromeBrowser.getElement(Constant.FACEBOOK_ID_FORM);
    emailField.sendKeys(Constant.FACEBOOK_USER_ID);

    const passwordField = await chromeBrowser.getElement(Constant.FACEBOOK_PASSWORD_FORM);
    passwordField.sendKeys(Constant.FACEBOOK_PASSWORD);

    const loginSubmitButton = await chromeBrowser.getElement(Constant.LOGIN_PAGE_LOGIN_BUTTON);
    loginSubmitButton.click();

    const profileThumbnail = await chromeBrowser
      .getElement(Constant.USER_NAVIGATION_PROFILE_THUMBNAIL);
    expect(Boolean(profileThumbnail)).toBe(true);
  }, 60000);

  test('logout', async () => {
    const profileThumbnail = await chromeBrowser
      .getElement(Constant.USER_NAVIGATION_PROFILE_THUMBNAIL);
    profileThumbnail.click();

    const logoutButton = await chromeBrowser.getElement(Constant.USER_NAVIGATION_LOGOUT_BUTTON);
    logoutButton.click();

    const userNavigationLoginButton = await chromeBrowser
      .getElement(Constant.USER_NAVIGATION_LOGIN_BUTTON);
    expect(Boolean(userNavigationLoginButton)).toBe(true);
  }, 60000);
});
