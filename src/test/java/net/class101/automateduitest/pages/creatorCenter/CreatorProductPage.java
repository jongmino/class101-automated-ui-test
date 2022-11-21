package net.class101.automateduitest.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.common.PropertyLoader;
import org.openqa.selenium.By;

public class CreatorProductPage {
    public class Elements{
        private static final By CREATE_PRODUCT_BUTTON = byXpath("//a[@href='/center/products/add']");
        private static final By PRODUCT_LIST = byXpath("//div[@aria-label='grid']/div");

        public static SelenideElement createProductButton() {
            return $(CREATE_PRODUCT_BUTTON);
        }

        public static SelenideElement productList() {
            return $(PRODUCT_LIST);
        }
    }

    public class Actions{
        private static final String STAGING_CREATOR_PRODUCT_PAGE = PropertyLoader.getProperties().urls.get("creatorProduct").staging;
        public static void openPage() {
            open(STAGING_CREATOR_PRODUCT_PAGE);
        }
    }
}
