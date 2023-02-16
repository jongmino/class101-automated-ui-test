package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.resources.common.PropertyLoader;
import org.openqa.selenium.By;

import java.util.Random;
import java.util.UUID;

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
    private static final By MY_PAGE_PROFILE_BUTTON = byXpath("(//img[@alt='profile-picture'])[1]");
    private static final By MY_PAGE_NICKNAME_INPUT = byXpath("//input[@name='nickName']");
    public static final By MY_PAGE_INFO_SAVE = byXpath("//span[text()='저장하기']");
    public static final By MY_PAGE_LEFT_NICKNAME = byXpath("//*[@id=\"__next\"]/main/div/div[6]/div/div[3]/div/div/div[1]/div/div/div/a/div/div[1]/div/div[3]/div/div/div[1]/p");
    private static final By MY_PAGE_CENTER_PROFILE_IMG = byXpath("//*[@id=\"__next\"]/main/div/div[6]/div/div[5]/div/div/div[3]/div[1]/div[2]/form/div[1]/label");
    private static final By MY_PAGE_CENTER_PROFILE_IMG_INPUT = byXpath("//input[@type='file' and contains(@name,'photoUrl')]");




    public static SelenideElement myPageProfileButton() {return $(MY_PAGE_PROFILE_BUTTON).shouldBe(Condition.visible);}

    public static SelenideElement myPageNicknameInput() {return $(MY_PAGE_NICKNAME_INPUT).shouldBe(Condition.visible);}

    public static SelenideElement myPageInfoSave() {return $(MY_PAGE_INFO_SAVE).shouldBe(Condition.visible);}

    public static SelenideElement myPageLeftNickname() {return $(MY_PAGE_LEFT_NICKNAME).shouldBe(Condition.visible);}

    public static SelenideElement myPageCenterProfileImg() {return $(MY_PAGE_CENTER_PROFILE_IMG).shouldBe(Condition.visible);}

    public static SelenideElement myPageCenterProfileImgInput() {return $(MY_PAGE_CENTER_PROFILE_IMG_INPUT);}

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

        // 닉네임 변경
        private static String RecentLoadNickname = "getRecentLoadNickname";
        public static String setNickname() {
            RecentLoadNickname = UUID.randomUUID().toString().replace("-", "").substring(0, 20);
            return RecentLoadNickname;
        }
        public static String getRecentLoadNickname() {
            return RecentLoadNickname;
        }

        // 프로필 이미지 변경
        public static final String[] TEST_IMAGE = { "src/test/images/1.jpeg", "src/test/images/2.jpeg", "src/test/images/3.jpeg", "src/test/images/4.jpeg" };
        public static String setTestImages() {
            Random random = new Random();
            int randomNum = random.nextInt(3);
            return TEST_IMAGE[randomNum];
        }

        public static String getTestImages() {
            return TEST_IMAGE[0];
        }

        public static String RecentLoadImage = "getRecentLoadImage";
        public static String setRecentLoadImage() {
            RecentLoadImage = setTestImages();
            return RecentLoadImage;
        }
        public static String getRecentLoadImage() {
            return RecentLoadImage;
        }

    }
}
