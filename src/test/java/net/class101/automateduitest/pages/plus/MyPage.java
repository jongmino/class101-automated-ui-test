package net.class101.automateduitest.pages.plus;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.common.PropertyLoader;
import org.openqa.selenium.By;

public class MyPage {

    public class Elements {

        private static final By MY_PAGE_LOGOUT_BUTTON = withText("로그아웃");
        private static final By MY_PAGE_CASH_TAB = byXpath("//a[contains(@href,'cash')]");
        private static final By MY_PAGE_SUBSCRIPTION_STATUS_NON = byXpath("//a[contains(@href,'subscription') and contains(.,'구독하기')]");
        private static final By MY_PAGE_SUBSCRIPTION_STATUS_SUBSCRIBED = byXpath("//a[contains(@href,'subscription') and contains(.,'구독 중')]");
        private static final By MY_PAGE_ORDER_TAB = byXpath("//h6[text()='주문 및 배송']");
        private static final By MY_PAGE_REFERRAL_TAB = byXpath("//a[contains(@href,'classmate-referral')]");
        private static final By MY_PAGE_CREATOR_CENTER_TAB = byXpath("(//h6[text()='크리에이터 센터'])[2]");
        private static final By MY_PAGE_FAQ_TAB = byXpath("//a[contains(@href,'intercom.help/class101faq')]");
        private static final By MY_PAGE_ENQUIRY_TAB = byXpath("//button[contains(.,'1:1 문의')]");
        private static final By MY_PAGE_SETTING_TAB = byXpath("//a[contains(@href,'setting')]");
        private static final By CHANNEL_TALK_MODAL = byClassName("ch-desk-messenger");


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

    }

    public class Actions {

        private static final String STAGING_PLUS_MY_PAGE_URL = PropertyLoader.getProperties().urls.get("plusMyPage").staging;

        public static void openPage() {
            open(STAGING_PLUS_MY_PAGE_URL);
        }
    }
}
