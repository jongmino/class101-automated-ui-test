const { Builder, By, until } = require('selenium-webdriver');

// eslint-disable-next-line import/prefer-default-export
export class Common {
  driver: any;

  constructor(private webDriver: string) {
    this.driver = new Builder().forBrowser(this.webDriver).build();
  }

  async setWindowPosition(x:number, y:number) {
    this.driver.manage().window().setRect({ x, y });
  }

  async getElement(xPath: string) {
    await this.driver.wait(until.elementLocated(By.xpath(xPath)));
    const element = await this.driver.findElement(By.xpath(xPath));
    return element;
  }

  get(url: string) {
    this.driver.get(url);
  }

  quit() {
    return this.driver.quit();
  }

  clickElement(xPath: string) {
    this.getElement(xPath).then((element) => {
      element.click();
    });
  }

  fillInputElement(xPath:string, value:string) {
    return this.getElement(xPath).then((element) => element.sendKeys(value));
  }

  async waitUntilVisible(xPath:string) {
    await this.driver.wait(() => this.driver.findElements(By.xpath(xPath))
      .then((elements:any) => elements.length !== 0));
  }

  async waitUntilNotVisible(xPath:string) {
    await this.driver.wait(() => this.driver.findElements(By.xpath(xPath))
      .then((elements: any) => elements.length === 0));
  }
}
