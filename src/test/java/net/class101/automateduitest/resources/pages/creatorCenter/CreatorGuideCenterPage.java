package net.class101.automateduitest.resources.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class CreatorGuideCenterPage {

    private static final By CREATOR_GUIDE_CENTER_TITLE = byXpath("//h1[text()='CLASS101 크리에이터 가이드 센터']");

    public static SelenideElement creatorGuideCenterTitle() {
        return $(CREATOR_GUIDE_CENTER_TITLE).shouldBe(Condition.visible);
    }
}
