package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.resources.common.PropertyLoader;
import org.openqa.selenium.By;

public class LecturePage {
    private static final By VIDEO_PLAY_SPEED_BUTTON = byXpath("//div[div[contains(@class,'video')]]//div[div[div[p[text()='a']]]]/div[3]//button[1]");
    private static final By VIDEO_SETTING_BUTTON = byXpath("//div[div[contains(@class,'video')]]//div[div[div[p[text()='a']]]]/div[3]/div[4]");
    private static final By VIDEO_SETTING_QUALITY_BUTTON = byXpath("//button[contains(.,'화질')]");
    private static final By VIDEO_SETTING_AUTO_PLAY_BUTTON = byXpath("//button[contains(.,'자동 재생')]");
    private static final By VIDEO_SETTING_FIRST_RADIO_OPTION_NOT_CHECKED = byXpath("//label[input[@type='radio' and not(@checked)]]");
    private static final By VIDEO_PLAYING = byXpath("//div[contains(@class,'playing')]");
    private static final By VIDEO_PLAYER = byXpath("//div[@aria-label='Video Player']");
    private static final By COMMENT_SECTION = byXpath("//h4[text()='댓글']");
    private static final By CURRICULUM_SECTION = byXpath("//li//span[text()='커리큘럼']");
    private static final By MATERIAL_SECTION = byXpath("//li//span[text()='수업자료']");
    private static final By NOTICE_SECTION = byXpath("//li//span[text()='소식']");

    public static SelenideElement playSpeedButton() {
        return $(VIDEO_PLAY_SPEED_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement settingButton() {
        return $(VIDEO_SETTING_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement videoQualitySettingButton() {
        return $(VIDEO_SETTING_QUALITY_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement autoPlaySettingButton() {
        return $(VIDEO_SETTING_AUTO_PLAY_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement firstUnCheckedRadioButton() {
        return $(VIDEO_SETTING_FIRST_RADIO_OPTION_NOT_CHECKED).shouldBe(Condition.visible);
    }

    public static SelenideElement videoElementPlaying() {
        return $(VIDEO_PLAYING).shouldBe(Condition.visible);
    }

    public static SelenideElement videoPlayer() {
        return $(VIDEO_PLAYER).shouldBe(Condition.visible);
    }

    public static SelenideElement commentSection() {
        return $(COMMENT_SECTION).shouldBe(Condition.visible);
    }

    public static SelenideElement curriculumSection() {
        return $(CURRICULUM_SECTION).shouldBe(Condition.visible);
    }

    public static SelenideElement materialSection() {
        return $(MATERIAL_SECTION).shouldBe(Condition.visible);
    }

    public static SelenideElement noticeSection() {
        return $(NOTICE_SECTION).shouldBe(Condition.visible);
    }

    public class Actions {

        private static final By VIDEO_SETTING_QUALITY_CURRENT_VALUE = byXpath("//button[contains(.,'화질')]//span[contains(text(),'p')]");
        private static final By VIDEO_SETTING_AUTO_PLAY_CURRENT_VALUE = byXpath("//button[contains(.,'자동 재생')]//span[contains(text(),'짐')]");
        private static final By UNCHECKED_AUTO_PLAY_OPTION_TEXT = By.xpath("//div[label[input[@type='radio' and not(@checked)]]]//p");

        public static void openPage() {
            final String LECTURE_PAGE_URL = PropertyLoader.getProperties().urls.get("lecturePage");
            open(LECTURE_PAGE_URL);
        }

        public static String getVideoQualityValue() {
            return $(VIDEO_SETTING_QUALITY_CURRENT_VALUE).shouldBe(Condition.visible).getText();
        }

        public static String getAutoPlayValue() {
            return $(VIDEO_SETTING_AUTO_PLAY_CURRENT_VALUE).shouldBe(Condition.visible).getText();
        }

        public static String getUnCheckedAutoPlayOptionValue() {
            return $(UNCHECKED_AUTO_PLAY_OPTION_TEXT).shouldBe(Condition.visible).getText();
        }

        public static String getPlaySpeedSVGPathValue() {
            return LecturePage.playSpeedButton().find("svg").find("path").getAttribute("d");
        }
    }
}
