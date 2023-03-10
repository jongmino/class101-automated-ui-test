package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class SettingPage {

    private static final By SETTING_SERVICE_REGION_BUTTON = withText("지역 설정");
    private static final By SERVICE_REGION_US_BUTTON = byXpath("//p[text()='United States / English']");
    private static final By SERVICE_REGION_JP_BUTTON = byXpath("//p[text()='日本 / 日本語']");

    // 지역변경 버튼
    public static SelenideElement serviceRegionSettingButton() {
        return $(SETTING_SERVICE_REGION_BUTTON).shouldBe(Condition.visible);
    }

    // United States / English 버튼
    public static SelenideElement serviceRegionUSButton() {
        return $(SERVICE_REGION_US_BUTTON).shouldBe(Condition.visible);
    }

    // 日本 / 日本語 버튼
    public static SelenideElement serviceRegionJPButton() {
        return $(SERVICE_REGION_JP_BUTTON).shouldBe(Condition.visible);
    }
}
