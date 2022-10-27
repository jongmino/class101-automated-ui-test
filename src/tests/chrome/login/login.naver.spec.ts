import Constant from '../../constant';
import Common from '../../../utils';

const { Browser } = require('selenium-webdriver');

describe('chrome', () => {
  let browser: any;
  beforeAll(() => {
    browser = new Common(Browser.CHROME);
    browser.get(Constant.CLASS101_SUBSCRIPTION_URL_STAGING);
  });

  afterAll(() => {
    browser.quit();
  });

  test('login with naver', async () => {
    await browser.clickElement(Constant.USER_NAVIGATION_LOGIN_BUTTON);

    await browser.clickElement(Constant.SIGN_IN_WITH_OTHER_METHODS_BUTTON);

    await browser.clickElement(Constant.LOGIN_PAGE_NAVER_BUTTON);

    await browser.fillInputElement(Constant.NAVER_ID_FORM, Constant.NAVER_USER_ID);

    await browser.fillInputElement(Constant.NAVER_PASSWORD_FORM, Constant.NAVER_PASSWORD);

    await browser.getElement(Constant.NAVER_LOGIN_BUTTON);
  }, 60000);
});
