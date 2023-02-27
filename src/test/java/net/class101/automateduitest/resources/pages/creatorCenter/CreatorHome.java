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
    private static final By SERVICE_REGION_SETTING_BUTTON_JP = byXpath("//p[text()='地域設定']");
    private static final By SERVICE_REGION_SETTING_BUTTON_EN = byXpath("//p[text()='Region Settings']");
    private static final By SERVICE_REGION_SETTING_BUTTON_KR = byXpath("//p[text()='지역 설정']");
    private static final By SERVICE_REGION_JP = byXpath("(//div[@id='modalBottomSheet']//picture)[3]");
    private static final By SERVICE_REGION_EN = byXpath("(//div[@id='modalBottomSheet']//picture)[2]");
    private static final By SERVICE_REGION_KR = byXpath("(//div[@id='modalBottomSheet']//picture)[1]");
    private static final By SERVICE_REGION_SAVE_BUTTON_JP = byXpath("//span[text()='適用']");
    private static final By SERVICE_REGION_SAVE_BUTTON_EN = byXpath("//span[text()='Apply']");
    private static final By SERVICE_REGION_SAVE_BUTTON_KR = byXpath("//span[text()='적용']");

    public static SelenideElement profileImg() {
        return $(NAVIGATION_PROFILE_IMG).shouldBe(Condition.visible);
    }
    public static SelenideElement logoutButton() {
        return $(LOGOUT_BUTTON).shouldBe(Condition.visible);
    }
    public static SelenideElement serviceRegionSettingButtonJp() {
        return $(SERVICE_REGION_SETTING_BUTTON_JP).shouldBe(Condition.visible);
    }
    public static SelenideElement serviceRegionSettingButtonEn() {
        return $(SERVICE_REGION_SETTING_BUTTON_EN).shouldBe(Condition.visible);
    }
    public static SelenideElement serviceRegionSettingButtonKr() {
        return $(SERVICE_REGION_SETTING_BUTTON_KR).shouldBe(Condition.visible);
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


    public class Actions {
        public static void openPage() {
            final String CREATOR_CENTER_URL = PropertyLoader.getProperties().urls.get("creatorHome");
            open(CREATOR_CENTER_URL);
        }
    }
}
