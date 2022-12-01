package net.class101.automateduitest.pages.plus;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.common.PropertyLoader;
import net.class101.automateduitest.common.Utils;
import org.openqa.selenium.By;

public class ProductDetailPage {

    public class Elements {

        private static final By CLASS101_PLUS_SUBSCRIBE_BUTTON = withText("시작하기");
        private static final By CLASS_INTRODUCTION_TAB = byXpath("//span[contains(.,'클래스 소개')]");
        private static final By CREATOR_INTRODUCTION_TAB = byXpath("//span[contains(.,'크리에이터')]");
        private static final By PLAY_BUTTON = byXpath("//button[contains(.,'재생하기')]");
        private static final By BUY_KIT_BUTTON = byXpath("//span[text()='준비물 구매']");


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

        public static SelenideElement buyKitButton() {
            return $(BUY_KIT_BUTTON);
        }
    }

    public class Actions {
        private static final String STAGING_PDP_HAS_KIT_URL = PropertyLoader.getProperties().urls.get("kitLecturePage").staging;

        public static void openKitPage(){
            open(STAGING_PDP_HAS_KIT_URL);
        }
    }
}
