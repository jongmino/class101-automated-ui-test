package net.class101.automateduitest.resources.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class CreatorKitSettlementPage {

    private static final By SETTLEMENT_TABLE = byXpath("//div[contains(@class,'table')]");

    public static SelenideElement settlementTable() {
        return $(SETTLEMENT_TABLE).shouldBe(Condition.visible);
    }
}
