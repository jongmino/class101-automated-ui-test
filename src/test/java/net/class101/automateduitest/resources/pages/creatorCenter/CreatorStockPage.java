package net.class101.automateduitest.resources.pages.creatorCenter;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class CreatorStockPage {

    private static final String STOCK_TABLE = "table";

    public static SelenideElement stockTable() {
        return $(STOCK_TABLE).shouldBe(Condition.visible);
    }
}
