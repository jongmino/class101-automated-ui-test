package net.class101.automateduitest.Pages.Plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public final class LecturePage {
    private static final By VIDEO_PLAY_SPEED_BUTTON = byXpath("(//div[div[contains(@class,'video')]]//span)[14]");
    private static final By VIDEO_SETTING_BUTTON = byXpath("(//div[div[contains(@class,'video')]]//span)[15]");
    private static final By VIDEO_SETTING_QUALITY_BUTTON = byXpath("//div[div[p[text() = '화질']]]");
    private static final By VIDEO_SETTING_QUALITY_CURRENT_VALUE = byXpath("//div[div[p[text() = '화질']]]//button//span[contains(.,'p')]");
    private static final By VIDEO_SETTING_AUTO_PLAY_BUTTON = byXpath("//div[div[p[text() = '자동 재생']]]");
    private static final By VIDEO_SETTING_AUTO_PLAY_CURRENT_VALUE = byXpath("(//div[div[p[text() = '자동 재생']]]//button//span)[2]");
    private static final By VIDEO_SETTING_FIRST_RADIO_OPTION_NOT_CHECKED = byXpath("//label[input[@type='radio' and not(@checked)]]");
    private static final By UNCHECKED_AUTO_PLAY_OPTION_TEXT = By.xpath("//div[label[input[@type='radio' and not(@checked)]]]//p");
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

    public static String currentVideoQualityText() {
        return $(VIDEO_SETTING_QUALITY_CURRENT_VALUE).getText();
    }

    public static SelenideElement autoPlaySettingButton() {
        return $(VIDEO_SETTING_AUTO_PLAY_BUTTON);
    }

    public static String currentAutoPlayText() {
        return $(VIDEO_SETTING_AUTO_PLAY_CURRENT_VALUE).getText();
    }

    public static SelenideElement firstUnCheckedRadioButton() {
        return $(VIDEO_SETTING_FIRST_RADIO_OPTION_NOT_CHECKED);
    }

    public static String unCheckedAutoPlayOptionText() {
        return $(UNCHECKED_AUTO_PLAY_OPTION_TEXT).getText();
    }

    public static SelenideElement videoElementPlaying() {
        return $(VIDEO_PLAYING);
    }

    public static String getPlaySpeedSVGPathValue() {
        return playSpeedButton().find("svg").find("path").getAttribute("d");
    }
}
