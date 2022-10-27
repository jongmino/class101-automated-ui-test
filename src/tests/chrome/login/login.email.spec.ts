import Constant from '../../constant';
import Common from '../../../utils';

const { Browser } = require('selenium-webdriver');

describe('chrome', () => {
  let browser: any;
  beforeAll(() => {
    browser = new Common(Browser.CHROME);
    browser.get(Constant.CLASS101_SUBSCRIPTION_URL_STAGING);
    browser.setWindowPosition(0, 0);
  });

  afterAll(() => {
    browser.quit();
  });

  test('login with email', async () => {
    await browser.clickElement(Constant.USER_NAVIGATION_LOGIN_BUTTON);

    await browser.clickElement(Constant.SIGN_IN_WITH_OTHER_METHODS_BUTTON);

    await browser.fillInputElement(Constant.CLASS101_ID_FORM, Constant.CLASS101_USER_ID);

    await browser.fillInputElement(Constant.CLASS101_PASSWORD_FORM, Constant.CLASS101_PASSWORD);

    await browser.clickElement(Constant.LOGIN_PAGE_LOGIN_BUTTON);

    await browser.waitUntilVisible(Constant.USER_NAVIGATION_PROFILE_THUMBNAIL);
  }, 60000);

  test('logout', async () => {
    await browser.clickElement(Constant.USER_NAVIGATION_PROFILE_THUMBNAIL);

    await browser.clickElement(Constant.MY_PAGE_LOGOUT_BUTTON);

    await browser.waitUntilVisible(Constant.USER_NAVIGATION_LOGIN_BUTTON);
  }, 60000);
});
