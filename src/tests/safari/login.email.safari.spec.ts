import Constant from '../constant';
import Common from '../../utils';

const { Browser } = require('selenium-webdriver');

describe('safari', () => {
  let safariBrowser: any;

  beforeAll(() => {
    safariBrowser = new Common(Browser.SAFARI);
    safariBrowser.get('https://staging.class101.net/');
  });

  afterAll(() => {
    safariBrowser.quit();
  });
  test('login with email', async () => {
    const loginButton = await safariBrowser.getElement(Constant.USER_NAVIGATION_LOGIN_BUTTON);
    loginButton.click();

    const loginWithOtherMethodButton = await safariBrowser
      .getElement(Constant.SIGN_IN_WITH_OTHER_METHODS_BUTTON);
    loginWithOtherMethodButton.click();

    const emailField = await safariBrowser.getElement(Constant.CLASS101_ID_FORM);
    emailField.sendKeys(Constant.CLASS101_USER_ID);

    const passwordField = await safariBrowser.getElement(Constant.CLASS101_PASSWORD_FORM);
    passwordField.sendKeys(Constant.CLASS101_PASSWORD);

    const loginSubmitButton = await safariBrowser.getElement(Constant.LOGIN_PAGE_LOGIN_BUTTON);
    loginSubmitButton.click();

    const profileThumbnail = await safariBrowser
      .getElement(Constant.USER_NAVIGATION_PROFILE_THUMBNAIL);
    expect(Boolean(profileThumbnail)).toBe(true);
  }, 60000);
});
