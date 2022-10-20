const { Builder, By, until } = require('selenium-webdriver');

export class Common {
  driver: any;

  constructor(private webDriver: string) {
    this.driver = new Builder().forBrowser(this.webDriver).build();
  }

  async getElement(xPath: string) {
    await this.driver.wait(until.elementLocated(By.xpath(xPath)));
    return await this.driver.findElement(By.xpath(xPath));
  }

  async get(url: string) {
    return this.driver.get(url);
  }

  async quit() {
    return this.driver.quit();
  }
}
