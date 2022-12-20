package net.class101.automateduitest.resources.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class CreatorFileRequestPage {

    public class Elements {

        private static final By FILE_REQUEST_HISTORY_TITLE = byXpath("//h4[contains(.,'나의 자료 요청 내역')]");

        public static SelenideElement fileRequestTitle() {
            return $(FILE_REQUEST_HISTORY_TITLE);
        }
    }
}
