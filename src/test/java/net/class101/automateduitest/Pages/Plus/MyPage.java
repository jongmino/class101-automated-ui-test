package net.class101.automateduitest.Pages.Plus;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public final class MyPage {
    private static final String STAGING_PLUS_MY_PAGE_URL = "https://staging.class101.net/plus/ko/mypage";
    private static final By MY_PAGE_LOGOUT_BUTTON = withText("로그아웃");
    private static final By MY_PAGE_CASH_TAB = byXpath("//a[contains(@href,'cash')]");
    private static final By MY_PAGE_SUBSCRIPTION_STATUS_NON = byXpath("//a[contains(@href,'subscription') and contains(.,'구독하기')]");
    private static final By MY_PAGE_SUBSCRIPTION_STATUS_SUBSCRIBED = byXpath("//a[contains(@href,'subscription') and contains(.,'구독 중')]");
    private static final By MY_PAGE_ORDER_TAB = byXpath("//a[contains(@href,'orders')]");
    private static final By MY_PAGE_REFERRAL_TAB = byXpath("//a[contains(@href,'classmate-referral')]");
    private static final By MY_PAGE_CREATOR_CENTER_TAB = byXpath("//button[contains(.,'크리에이터 센터')]");
    private static final By MY_PAGE_FAQ_TAB = byXpath("//a[contains(@href,'intercom.help/class101faq')]");
    private static final By MY_PAGE_ENQUIRY_TAB = byXpath("//button[contains(.,'1:1 문의')]");
    private static final By MY_PAGE_SETTING_TAB = byXpath("//a[contains(@href,'setting')]");
    private static final By CHANNEL_TALK_MODAL = byClassName("ch-desk-messenger");
    private static final By SETTING_SERVICE_REGION_BUTTON = withText("지역 설정");
    private static final By SERVICE_REGION_US_BUTTON = byXpath("//p[contains(.,'United States / English')]");
    private static final By SERVICE_REGION_JP_BUTTON = byXpath("//p[contains(.,'日本 / 日本語')]");

    public static void openPage() {
        open(STAGING_PLUS_MY_PAGE_URL);
    }

    public static SelenideElement logoutButton() {
        return $(MY_PAGE_LOGOUT_BUTTON);
    }

    public static SelenideElement cashTab() {
        return $(MY_PAGE_CASH_TAB);
    }

    public static SelenideElement subscriptionStatusFalse() {
        return $(MY_PAGE_SUBSCRIPTION_STATUS_NON);
    }

    public static SelenideElement subscriptionStatusTrue() {
        return $(MY_PAGE_SUBSCRIPTION_STATUS_SUBSCRIBED);
    }

    public static SelenideElement orderTab() {
        return $(MY_PAGE_ORDER_TAB);
    }

    public static SelenideElement referralTab() {
        return $(MY_PAGE_REFERRAL_TAB);
    }

    public static SelenideElement creatorCenterTab() {
        return $(MY_PAGE_CREATOR_CENTER_TAB);
    }

    public static SelenideElement faqTab() {
        return $(MY_PAGE_FAQ_TAB);
    }

    public static SelenideElement enquiryTab() {
        return $(MY_PAGE_ENQUIRY_TAB);
    }

    public static SelenideElement settingTab() {
        return $(MY_PAGE_SETTING_TAB);
    }

    public static SelenideElement channelTalkModal() {
        return $(CHANNEL_TALK_MODAL);
    }

    public static SelenideElement serviceRegionSettingButton() {
        return $(SETTING_SERVICE_REGION_BUTTON);
    }

    public static SelenideElement serviceRegionUSButton() {
        return $(SERVICE_REGION_US_BUTTON);
    }

    public static SelenideElement serviceRegionJPButton() {
        return $(SERVICE_REGION_JP_BUTTON);
    }
}
