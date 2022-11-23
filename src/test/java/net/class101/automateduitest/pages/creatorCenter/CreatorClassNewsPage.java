package net.class101.automateduitest.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class CreatorClassNewsPage {
    public class Elements{

        private static final By CLASS_SELECTOR = byXpath("//select");
        private static final By CREATE_NOTICE_BUTTON = byXpath("//div[text()='공지하기']");

        public static SelenideElement classSelector() {
            return $(CLASS_SELECTOR);
        }

        public static SelenideElement createNoticeButton() {
            return $(CREATE_NOTICE_BUTTON);
        }
    }

    public class Actions{

    }

}
