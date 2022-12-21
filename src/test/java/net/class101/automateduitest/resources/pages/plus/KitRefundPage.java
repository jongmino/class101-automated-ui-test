package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class KitRefundPage {

    private static final By KIT_REFUND_PAGE_TITLE = byXpath("//h3[text()='환불 요청']");

    public static SelenideElement kitRefundPageTitle() {
        return $(KIT_REFUND_PAGE_TITLE).shouldBe(Condition.visible);
    }
}
