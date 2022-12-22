package net.class101.automateduitest.resources.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.resources.common.PropertyLoader;
import org.openqa.selenium.By;

public class CreatorProductPage {

    private static final By CREATE_PRODUCT_BUTTON = byXpath("//button[@style='color: rgb(255, 255, 255); --system-on-color:#ffffff;']//span[text()='상품 만들기']");
    private static final By PRODUCT_LIST = byXpath("//div[@aria-label='grid']/div");
    private static final By FIRST_PRODUCT_SELECT_BOX = byXpath("(//div[@aria-label='grid']//label)[1]");
    private static final By DELETE_BUTTON = byXpath("//button[contains(.,'삭제')]");
    private static final By MODAL_DELETE_BUTTON = byXpath("//div[@id='modalBottomSheet']//button[contains(.,'삭제')]");
    private static final By CREATOR_CENTER_LOGO = byXpath("//a[@href='/center/products']");
    private static final By PRIVATE_STATUS = byXpath("//p[text()='비공개']");

    public static SelenideElement createProductButton() {
        return $(CREATE_PRODUCT_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement productList() {
        return $(PRODUCT_LIST).shouldBe(Condition.visible);
    }

    public static SelenideElement firstProductSelectBox() {
        return $(FIRST_PRODUCT_SELECT_BOX).shouldBe(Condition.visible);
    }

    public static SelenideElement deleteButton() {
        return $(DELETE_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement modalDeleteButton() {
        return $(MODAL_DELETE_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement creatorCenterLogo() {
        return $(CREATOR_CENTER_LOGO).shouldBe(Condition.visible);
    }

    public static SelenideElement privateStatus() {
        return $(PRIVATE_STATUS).shouldBe(Condition.visible);
    }

    public class Actions {
        public static void openPage() {
            final String STAGING_CREATOR_PRODUCT_PAGE =
                PropertyLoader.getProperties().urls.get("creatorProduct").staging;
            open(STAGING_CREATOR_PRODUCT_PAGE);
        }
    }
}
