import { addAbortSignal } from 'stream';
import Constant from '../../constant';
import Common from '../../../utils';

const { Browser } = require('selenium-webdriver');

describe('chrome', () => {
  let browser: any;
  beforeAll(() => {
    browser = new Common(Browser.CHROME);
    browser.get(Constant.CLASS101_SUBSCRIPTION_URL_STAGING);
    browser.setWindowPosition(300, 300);
  });

  afterAll(async () => {
    await browser.quit();
  });

  test('save class', async () => {
    await browser.clickElement(Constant.FIRST_SAVE_BUTTON_ON_TRENDING_NOW);

    await browser.clickElement(Constant.SIGN_IN_WITH_OTHER_METHODS_BUTTON);

    await browser.fillInputElement(Constant.CLASS101_ID_FORM, Constant.CLASS101_USER_ID);

    await browser.fillInputElement(Constant.CLASS101_PASSWORD_FORM, Constant.CLASS101_PASSWORD);

    await browser.clickElement(Constant.LOGIN_PAGE_LOGIN_BUTTON);

    await browser.getElement(Constant.USER_NAVIGATION_PROFILE_THUMBNAIL);

    await browser.waitUntilVisible(Constant.SAVED_CLASSES_TITLE);
  }, 60000);

  test('unsave class', async () => {
    await browser.clickElement(Constant.FIRST_SAVE_BUTTON_ON_TRENDING_NOW);

    await browser.waitUntilNotVisible(Constant.SAVED_CLASSES_TITLE);
  }, 60000);
});
