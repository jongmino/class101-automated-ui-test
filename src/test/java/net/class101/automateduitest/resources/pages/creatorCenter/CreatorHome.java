package net.class101.automateduitest.resources.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.resources.common.PropertyLoader;
import org.openqa.selenium.By;

public class CreatorHome {

    private static final String NAVIGATION_PROFILE_IMG = "img[alt='profile']";
    private static final By LOGOUT_BUTTON = byXpath("//p[text()='로그아웃']");
    private static final By SERVICE_REGION_SETTING_BUTTON_JP = byXpath("//div[@id='popover']//p[text()='地域設定']");
    private static final By SERVICE_REGION_SETTING_BUTTON_EN = byXpath("//div[@id='popover']//p[text()='Region Settings']");
    private static final By SERVICE_REGION_SETTING_BUTTON_KR = byXpath("//div[@id='popover']//p[text()='지역 설정']");
    private static final By SERVICE_REGION_JP = byXpath("(//div[@class='css-t34sz'])[3]");
    private static final By SERVICE_REGION_EN = byXpath("(//div[@class='css-t34sz'])[2]");
    private static final By SERVICE_REGION_KR = byXpath("(//div[@class='css-t34sz'])[1]");
    private static final By SERVICE_REGION_SAVE_BUTTON_JP = byXpath("//div[contains(.,'地域設定')]//span[text()='適用']");
    private static final By SERVICE_REGION_SAVE_BUTTON_EN = byXpath("//div[contains(.,'Region Settings')]//span[text()='Apply']");
    private static final By SERVICE_REGION_SAVE_BUTTON_KR = byXpath("//div[contains(.,'지역 설정')]//span[text()='적용']");
    private static final By SERVICE_REGION_GUIDE_CENTER_JP = byXpath("//span[text()='クリエイターガイドセンター']");
    private static final By SERVICE_REGION_GUIDE_CENTER_EN = byXpath("//span[text()='FAQ']");
    private static final By SERVICE_REGION_GUIDE_CENTER_KR = byXpath("//span[text()='크리에이터 가이드 센터']");
    private static final By SERVICE_REGION_TOAST_ALERT_JP = byXpath("//div[@id='toast']//p[text()='地域が変更されました。']");
    private static final By SERVICE_REGION_TOAST_ALERT_EN = byXpath("//div[@id='toast']//p[text()='The region has changed.']");
    private static final By SERVICE_REGION_TOAST_ALERT_KR = byXpath("//div[@id='toast']//p[text()='지역이 변경되었어요.']");

    public static SelenideElement profileImg() {
        return $(NAVIGATION_PROFILE_IMG).shouldBe(Condition.visible);
    }

    public static SelenideElement logoutButton() {
        return $(LOGOUT_BUTTON).shouldBe(Condition.visible);
    }
    public static SelenideElement serviceRegionSettingButtonKr() {
        return $(SERVICE_REGION_SETTING_BUTTON_KR).shouldBe(Condition.visible);
    }
    public static SelenideElement serviceRegionSettingButtonJp() {
        return $(SERVICE_REGION_SETTING_BUTTON_JP).shouldBe(Condition.visible);
    }
    public static SelenideElement serviceRegionSettingButtonEn() {
        return $(SERVICE_REGION_SETTING_BUTTON_EN).shouldBe(Condition.visible);
    }
    public static SelenideElement serviceRegionJp() {
        return $(SERVICE_REGION_JP).shouldBe(Condition.visible);
    }
    public static SelenideElement serviceRegionEn() {
        return $(SERVICE_REGION_EN).shouldBe(Condition.visible);
    }
    public static SelenideElement serviceRegionKr() {
        return $(SERVICE_REGION_KR).shouldBe(Condition.visible);
    }
    public static SelenideElement serviceRegionSaveButtonJp() {
        return $(SERVICE_REGION_SAVE_BUTTON_JP).shouldBe(Condition.visible);
    }
    public static SelenideElement serviceRegionSaveButtonEn() {
        return $(SERVICE_REGION_SAVE_BUTTON_EN).shouldBe(Condition.visible);
    }
    public static SelenideElement serviceRegionSaveButtonKr() {
        return $(SERVICE_REGION_SAVE_BUTTON_KR).shouldBe(Condition.visible);
    }

    public static SelenideElement serviceRegionGuideCenterJp() {
        return $(SERVICE_REGION_GUIDE_CENTER_JP).shouldBe(Condition.visible);
    }
    public static SelenideElement serviceRegionGuideCenterEn() {
        return $(SERVICE_REGION_GUIDE_CENTER_EN).shouldBe(Condition.visible);
    }
    public static SelenideElement serviceRegionGuideCenterKr() {
        return $(SERVICE_REGION_GUIDE_CENTER_KR).shouldBe(Condition.visible);
    }
    public static SelenideElement serviceRegionToastAlertJp() {
        return $(SERVICE_REGION_TOAST_ALERT_JP).shouldBe(Condition.visible);
    }
    public static SelenideElement serviceRegionToastAlertEn() {
        return $(SERVICE_REGION_TOAST_ALERT_EN).shouldBe(Condition.visible);
    }
    public static SelenideElement serviceRegionToastAlertKr() {
        return $(SERVICE_REGION_TOAST_ALERT_KR).shouldBe(Condition.visible);
    }


    public class Actions {
        public static void openPage() {
            final String CREATOR_CENTER_URL = PropertyLoader.getProperties().urls.get("creatorHome");
            open(CREATOR_CENTER_URL);
        }
    }
}
