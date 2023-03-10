package net.class101.automateduitest.resources.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class CreatorPlusSettlementPage {

    private static final By SETTLEMENT_DETAILS_BUTTON = byXpath("//h1[text()='원']");
    private static final By SETTLEMENT_DETAILS_MODAL_TITLE = byXpath("//h4[text()='정산 세부내역']");

    public static SelenideElement settlementDetailsButton() {
        return $(SETTLEMENT_DETAILS_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement settlementDetailsModalTitle() {
        return $(SETTLEMENT_DETAILS_MODAL_TITLE).shouldBe(Condition.visible);
    }
}
