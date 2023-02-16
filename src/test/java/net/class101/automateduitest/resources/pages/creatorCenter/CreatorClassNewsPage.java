package net.class101.automateduitest.resources.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class CreatorClassNewsPage {

    public static final String CLASS_ID = "5f5f386d34cd4f000672dd6e";
    private static final By CLASS_SELECTOR = byXpath("//select");
    private static final By CLASS_ID_INPUT = byXpath("//input[@placeholder='클래스 아이디를 입력해주세요.']");
    private static final By CREATE_NOTICE_BUTTON = byXpath("//div[text()='공지하기']");

    public static SelenideElement classSelector() {
        return $(CLASS_SELECTOR).shouldBe(Condition.visible);
    }

    public static SelenideElement classIdInput() {
        return $(CLASS_ID_INPUT).shouldBe(Condition.visible);
    }

    public static SelenideElement createNoticeButton() {
        return $(CREATE_NOTICE_BUTTON).shouldBe(Condition.visible);
    }

    public class DirectUrl {
        public static void openPage() {
            final String CREATOR_CENTER_PRODUCT_DIRECT_URL = CreatorNewClassPage.getCurrentUrl();
            open(CREATOR_CENTER_PRODUCT_DIRECT_URL);
        }
    }

}
