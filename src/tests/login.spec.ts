import { 개별판매로그인버튼, 다른방법으로로그인버튼 } from './constant';
import Common from '../utils';

const { Browser } = require('selenium-webdriver');

describe('chrome', () => {
  test('loginPage', async () => {
    const commonUtil = await new Common(Browser.CHROME);
    try {
      await commonUtil.get('https://staging.class101.net/');
      await commonUtil
        .getElement(개별판매로그인버튼)
        .then((element: any) => element.click());

      await commonUtil
        .getElement(다른방법으로로그인버튼)
        .then((element: any) => element.click());
    } finally {
      await commonUtil.quit();
    }
  }, 60000);
});

describe('safari', () => {
  test('loginPage', async () => {
    const commonUtil = await new Common(Browser.SAFARI);
    try {
      await commonUtil.get('https://staging.class101.net/');
      await commonUtil
        .getElement(개별판매로그인버튼)
        .then((element: any) => element.click());

      await commonUtil
        .getElement(다른방법으로로그인버튼)
        .then((element: any) => element.click());
    } finally {
      await commonUtil.quit();
    }
  }, 60000);
});
