package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.resources.common.PropertyLoader;
import org.openqa.selenium.By;

public class MyPage {
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
        return $(MY_PAGE_LOGOUT_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement cashTab() {
        return $(MY_PAGE_CASH_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement subscriptionStatusFalse() {
        return $(MY_PAGE_SUBSCRIPTION_STATUS_NON).shouldBe(Condition.visible);
    }

    public static SelenideElement subscriptionStatusTrue() {
        return $(MY_PAGE_SUBSCRIPTION_STATUS_SUBSCRIBED).shouldBe(Condition.visible);
    }

    public static SelenideElement orderTab() {
        return $(MY_PAGE_ORDER_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement referralTab() {
        return $(MY_PAGE_REFERRAL_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement creatorCenterTab() {
        return $(MY_PAGE_CREATOR_CENTER_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement faqTab() {
        return $(MY_PAGE_FAQ_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement enquiryTab() {
        return $(MY_PAGE_ENQUIRY_TAB).shouldBe(Condition.visible);
    }

    // 설정 탭
    public static SelenideElement settingTab() {
        return $(MY_PAGE_SETTING_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement channelTalkModal() {
        return $(CHANNEL_TALK_MODAL).shouldBe(Condition.visible);
    }

    public class Actions {
        public static void openPage() {
            final String plusMyPage = PropertyLoader.getProperties().urls.get("plusMyPage");
            open(plusMyPage);
        }
    }
}
