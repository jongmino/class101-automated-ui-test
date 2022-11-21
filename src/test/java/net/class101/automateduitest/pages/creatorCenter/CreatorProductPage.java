package net.class101.automateduitest.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.common.PropertyLoader;
import org.openqa.selenium.By;

public class CreatorProductPage {
    public class Elements{
        private static final By CREATE_PRODUCT_BUTTON = byXpath("//a[@href='/center/products/add']");
        private static final By PRODUCT_LIST = byXpath("//div[@aria-label='grid']/div");
        private static final By FIRST_PRODUCT_SELECT_BOX = byXpath("(//div[@aria-label='grid']//label)[1]");
        private static final By DELETE_BUTTON = byXpath("//button[contains(.,'삭제')]");
        private static final By MODAL_DELETE_BUTTON = byXpath("//div[@id='modalBottomSheet']//button[contains(.,'삭제')]");
        private static final By CREATOR_CENTER_LOGO = byXpath("//a[@href='/center/products']");

        public static SelenideElement createProductButton() {
            return $(CREATE_PRODUCT_BUTTON);
        }

        public static SelenideElement productList() {
            return $(PRODUCT_LIST);
        }

        public static SelenideElement firstProductSelectBox() {
            return $(FIRST_PRODUCT_SELECT_BOX);
        }

        public static SelenideElement deleteButton() {
            return $(DELETE_BUTTON);
        }

        public static SelenideElement modalDeleteButton() {
            return $(MODAL_DELETE_BUTTON);
        }

        public static SelenideElement creatorCenterLogo() {
            return $(CREATOR_CENTER_LOGO);
        }
    }

    public class Actions{
        private static final String STAGING_CREATOR_PRODUCT_PAGE = PropertyLoader.getProperties().urls.get("creatorProduct").staging;
        public static void openPage() {
            open(STAGING_CREATOR_PRODUCT_PAGE);
        }

        public static void deleteFirstProduct() {
            try{
                CreatorProductPage.Elements.creatorCenterLogo().click();
                Thread.sleep(1000);
                CreatorProductPage.Elements.firstProductSelectBox().shouldBe(Condition.visible).click();
                Thread.sleep(1000);
                CreatorProductPage.Elements.deleteButton().shouldBe(Condition.visible).click();
                CreatorProductPage.Elements.modalDeleteButton().shouldBe(Condition.visible).click();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
