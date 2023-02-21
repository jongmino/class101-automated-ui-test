package net.class101.automateduitest.resources.pages.plus;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class KitBuyPage {

    private static final By SOLD_OUT_BUTTON = byXpath("//span[text()='품절']");


    public static SelenideElement soldOutButton() { return $(SOLD_OUT_BUTTON).shouldBe(Condition.visible); }
}
