package net.class101.automateduitest.resources.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;

public class CreatorClassCommentPage {

    public class Elements {

        private static final By COMMENT_PAGE_TITLE = byXpath("//*[text()='클래스 댓글 관리']");
        private static final By ANSWERED_TAB = byXpath("//div[text()='답변 완료']");
        private static final By NOT_ANSWERED_TAB = byXpath("//div[text()='답변 대기중']");
        private static final By MARK_AS_ANSWERED_BUTTON = byXpath("//button[text()='답변 완료로 표기']");

        public static SelenideElement answeredTab() {
            return $(ANSWERED_TAB);
        }

        public static SelenideElement notAnsweredTab() {
            return $(NOT_ANSWERED_TAB);
        }

        public static ElementsCollection markAsAnsweredButtons() {
            return $$(MARK_AS_ANSWERED_BUTTON);
        }

        public static SelenideElement commentPageTitle() {
            return $(COMMENT_PAGE_TITLE);
        }
    }
}
