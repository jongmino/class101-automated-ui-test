package net.class101.automateduitest.Pages.Plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public final class ProductDetailPage {
    private static final By CLASS101_PLUS_SUBSCRIBE_BUTTON = withText("시작하기");
    private static final By CLASS_INTRODUCTION_TAB = byXpath("//span[contains(.,'클래스 소개')]");
    private static final By CREATOR_INTRODUCTION_TAB = byXpath("//span[contains(.,'크리에이터')]");
    private static final By PLAY_BUTTON = byXpath("//button[contains(.,'재생하기')]");

    public static SelenideElement startSubscriptionButton() {
        return $(CLASS101_PLUS_SUBSCRIBE_BUTTON);
    }

    public static SelenideElement playLectureButton() {
        return $(PLAY_BUTTON);
    }

    public static SelenideElement classInfoTab() {
        return $(CLASS_INTRODUCTION_TAB);
    }

    public static SelenideElement creatorInfoTab() {
        return $(CREATOR_INTRODUCTION_TAB);
    }
}
