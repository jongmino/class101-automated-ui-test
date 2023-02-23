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
    private static final By SERVICE_REGION_SETTING_BUTTON = byXpath("(//div[@id='popover']//div[@class='css-zsoya5'])[2]");
    private static final By SERVICE_REGION_JP = byXpath("(//div[@class='css-t34sz'])[3]");
    private static final By SERVICE_REGION_EN = byXpath("(//div[@class='css-t34sz'])[2]");
    private static final By SERVICE_REGION_KR = byXpath("(//div[@class='css-t34sz'])[1]");
    private static final By SERVICE_REGION_SAVE_BUTTON = byXpath("//div[@class='css-1uo2vg6']//button[@class='css-sf0tcz']");

    public static SelenideElement profileImg() {
        return $(NAVIGATION_PROFILE_IMG).shouldBe(Condition.visible);
    }
    public static SelenideElement logoutButton() {
        return $(LOGOUT_BUTTON).shouldBe(Condition.visible);
    }
    public static SelenideElement serviceRegionSettingButton() {
        return $(SERVICE_REGION_SETTING_BUTTON).shouldBe(Condition.visible);
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
    public static SelenideElement serviceRegionSaveButton() {
        return $(SERVICE_REGION_SAVE_BUTTON).shouldBe(Condition.visible);
    }


    public class Actions {
        public static void openPage() {
            final String CREATOR_CENTER_URL = PropertyLoader.getProperties().urls.get("creatorHome");
            open(CREATOR_CENTER_URL);
        }
    }
}
