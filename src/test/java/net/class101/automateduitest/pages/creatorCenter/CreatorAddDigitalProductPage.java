package net.class101.automateduitest.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class CreatorAddDigitalProductPage {
    public class Elements {
        private static final By PAGE_TITLE = byXpath("//*[text()='상품 오픈 준비 중']");

        public static SelenideElement pageTitle() {
            return $(PAGE_TITLE);
        }
    }
}
