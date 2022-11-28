package net.class101.automateduitest.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class CreatorLeftNavigation {
    public class Elements {
        private static final By CLASS_TAB = byXpath("//span[text()='클래스']");
        private static final By CLASS_COMMENT_TAB = byXpath("//div[text()='클래스 댓글']");
        private static final By CLASS_NEWS_TAB = byXpath("//div[text()='클래스 소식']");
        private static final By REFERRAL_TAB = byXpath("//span[text()='클래스101+ 초대']");

        public static SelenideElement classTab() {
            return $(CLASS_TAB);
        }

        public static SelenideElement classCommentTab(){
            return $(CLASS_COMMENT_TAB);
        }

        public static SelenideElement classNewsTab() {
            return $(CLASS_NEWS_TAB);
        }

        public static SelenideElement referralTab() {
            return $(REFERRAL_TAB);
        }
    }

    public class Actions {
    }
}
