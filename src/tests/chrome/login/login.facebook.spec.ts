import Constant from '../../constant';
import Common from '../../../utils';

const { Browser } = require('selenium-webdriver');

describe('chrome', () => {
  let browser: any;
  beforeAll(() => {
    browser = new Common(Browser.CHROME);
    browser.get(Constant.CLASS101_SUBSCRIPTION_URL_STAGING);
    browser.setWindowPosition(100, 100);
  });

  afterAll(() => {
    browser.quit();
  });

  test('login with facebook', async () => {
    await browser.clickElement(Constant.USER_NAVIGATION_LOGIN_BUTTON);

    await browser.clickElement(Constant.SIGN_IN_WITH_OTHER_METHODS_BUTTON);

    await browser.clickElement(Constant.LOGIN_PAGE_FACEBOOK_BUTTON);

    await browser.fillInputElement(Constant.FACEBOOK_ID_FORM, Constant.FACEBOOK_USER_ID);

    await browser.fillInputElement(Constant.FACEBOOK_PASSWORD_FORM, Constant.FACEBOOK_PASSWORD);

    await browser.clickElement(Constant.FACEBOOK_LOGIN_BUTTON);

    await browser.waitUntilVisible(Constant.USER_NAVIGATION_PROFILE_THUMBNAIL);
  }, 60000);
});
