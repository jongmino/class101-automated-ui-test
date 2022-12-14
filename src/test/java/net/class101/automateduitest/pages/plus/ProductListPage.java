package net.class101.automateduitest.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class ProductListPage {

    public class Elements {

        public static final String SUBCATEGORY_ID_ENGLISH_COMMUNICATION = "6220895c9dede0214b0783e4";
        private static final By SEARCH_RESULT_CRAFTS_CATEGORY = byXpath("//button[span[text()='공예']]");
        private static final By SUBCATEGORY_ENGLISH_COMMUNICATION = byXpath("//a[@href='/plus/ko/categories/6220895c9dede0214b0783e4']");

        public static SelenideElement englishCommunicationSubCategoryButton() {
            return $(SUBCATEGORY_ENGLISH_COMMUNICATION);
        }

        public static SelenideElement craftsCategoryTab() {
            return $(SEARCH_RESULT_CRAFTS_CATEGORY);
        }
    }

    public class Actions {}
}
