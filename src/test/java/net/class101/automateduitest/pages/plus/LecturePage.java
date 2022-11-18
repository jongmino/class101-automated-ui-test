package net.class101.automateduitest.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.common.PropertyLoader;
import org.openqa.selenium.By;

public class LecturePage {

    public class Elements {

        private static final By VIDEO_PLAY_SPEED_BUTTON = byXpath("(//div[div[contains(@class,'video')]]//span)[16]");
        private static final By VIDEO_SETTING_BUTTON = byXpath("(//div[div[contains(@class,'video')]]//span)[17]");
        private static final By VIDEO_SETTING_QUALITY_BUTTON = byXpath("//div[div[p[text() = '화질']]]");
        private static final By VIDEO_SETTING_AUTO_PLAY_BUTTON = byXpath("//div[div[p[text() = '자동 재생']]]");
        private static final By VIDEO_SETTING_FIRST_RADIO_OPTION_NOT_CHECKED = byXpath("//label[input[@type='radio' and not(@checked)]]");
        private static final By VIDEO_PLAYING = byXpath("//div[contains(@class,'playing')]");

        public static SelenideElement playSpeedButton() {
            return $(VIDEO_PLAY_SPEED_BUTTON);
        }

        public static SelenideElement settingButton() {
            return $(VIDEO_SETTING_BUTTON);
        }

        public static SelenideElement videoQualitySettingButton() {
            return $(VIDEO_SETTING_QUALITY_BUTTON);
        }

        public static SelenideElement autoPlaySettingButton() {
            return $(VIDEO_SETTING_AUTO_PLAY_BUTTON);
        }

        public static SelenideElement firstUnCheckedRadioButton() {
            return $(VIDEO_SETTING_FIRST_RADIO_OPTION_NOT_CHECKED);
        }

        public static SelenideElement videoElementPlaying() {
            return $(VIDEO_PLAYING);
        }

    }

    public class Actions {

        private static final String STAGING_LECTURE_PAGE_URL = PropertyLoader.getProperties().urls.get("lecturePage").staging;
        private static final By VIDEO_SETTING_QUALITY_CURRENT_VALUE = byXpath("//div[div[p[text() = '화질']]]//button//span[contains(.,'p')]");
        private static final By VIDEO_SETTING_AUTO_PLAY_CURRENT_VALUE = byXpath("(//div[div[p[text() = '자동 재생']]]//button//span)[2]");
        private static final By UNCHECKED_AUTO_PLAY_OPTION_TEXT = By.xpath("//div[label[input[@type='radio' and not(@checked)]]]//p");

        public static void openPage() {
            open(STAGING_LECTURE_PAGE_URL);
        }

        public static String getVideoQualityValue() {
            return $(VIDEO_SETTING_QUALITY_CURRENT_VALUE).getText();
        }

        public static String getAutoPlayValue() {
            return $(VIDEO_SETTING_AUTO_PLAY_CURRENT_VALUE).getText();
        }

        public static String getUnCheckedAutoPlayOptionValue() {
            return $(UNCHECKED_AUTO_PLAY_OPTION_TEXT).getText();
        }

        public static String getPlaySpeedSVGPathValue() {
            return LecturePage.Elements.playSpeedButton().find("svg").find("path").getAttribute("d");
        }
    }

}