package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.resources.common.PropertyLoader;
import org.openqa.selenium.By;

public class ProductDetailPage {

    private static final By CLASS101_PLUS_SUBSCRIBE_BUTTON = byXpath("//span[text()='바로 시작하기']");
    private static final By CLASS_INTRODUCTION_TAB = byXpath("//span[contains(.,'클래스 소개')]");
    private static final By CREATOR_INTRODUCTION_TAB = byXpath("//span[contains(.,'크리에이터')]");
    private static final By PLAY_BUTTON = byXpath("//button[contains(.,'재생하기')]");
    private static final By BUY_KIT_BUTTON = byXpath("//span[text()='준비물 구매']");

    public static SelenideElement startSubscriptionButton() {
        return $(CLASS101_PLUS_SUBSCRIBE_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement playLectureButton() {
        return $(PLAY_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement classInfoTab() {
        return $(CLASS_INTRODUCTION_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement creatorInfoTab() {
        return $(CREATOR_INTRODUCTION_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement buyKitButton() {return $(BUY_KIT_BUTTON);}

    public class Actions {
        public static void openPage() {
            final String productDetailPage = PropertyLoader.getProperties().urls.get("productDetailPage");
            open(productDetailPage);
        }

        public static void openKitPage() {
            final String kitPDP = PropertyLoader.getProperties().urls.get("kitPDP");
            open(kitPDP);
        }

        public static void openNoKitPage() {
            final String noKitPage = PropertyLoader.getProperties().urls.get("noKitPage");
            open(noKitPage);
        }
    }
}