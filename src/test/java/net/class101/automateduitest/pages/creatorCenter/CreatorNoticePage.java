package net.class101.automateduitest.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class CreatorNoticePage {
    public class Elements{
        private static final By NOTICE_SECTION = byXpath("//div[contains(h4,'공지사항')]");

        public static SelenideElement noticeSection() {
            return $(NOTICE_SECTION);
        }
    }
    public class Actions{

    }
}
