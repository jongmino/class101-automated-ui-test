const { Builder, By, until } = require('selenium-webdriver');

// eslint-disable-next-line import/prefer-default-export
export class Common {
  driver: any;

  constructor(private webDriver: string) {
    this.driver = new Builder().forBrowser(this.webDriver).build();
  }

  async getElement(xPath: string) {
    await this.driver.wait(until.elementLocated(By.xpath(xPath)));
    return this.driver.findElement(By.xpath(xPath));
  }

  get(url: string) {
    return this.driver.get(url);
  }

  quit() {
    return this.driver.quit();
  }
}
