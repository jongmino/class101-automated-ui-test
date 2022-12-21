package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class ProductListPage {

    public static final String SUBCATEGORY_ID_ENGLISH_COMMUNICATION = "6220895c9dede0214b0783e4";
    private static final By SEARCH_RESULT_CRAFTS_CATEGORY = byXpath("//button[span[text()='공예']]");
    private static final By SUBCATEGORY_ENGLISH_COMMUNICATION = byXpath("//span[text()='영어회화']");
    private static final By ENGLISH_CATEGORY_PAGE_TITLE = byXpath("(//h1[text()='영어'])[2]");
    private static final By PRODUCT_LIST_PAGE_ITEM = byXpath("//li");

    public static SelenideElement englishCommunicationSubCategoryButton() {
        return $(SUBCATEGORY_ENGLISH_COMMUNICATION).shouldBe(Condition.visible);
    }

    public static SelenideElement craftsCategoryTab() {
        return $(SEARCH_RESULT_CRAFTS_CATEGORY).shouldBe(Condition.visible);
    }

    public static SelenideElement englishCategoryPageTitle() {
        return $(ENGLISH_CATEGORY_PAGE_TITLE).shouldBe(Condition.visible);
    }

    public static ElementsCollection productItemList() {
        return $$(PRODUCT_LIST_PAGE_ITEM);
    }
}
