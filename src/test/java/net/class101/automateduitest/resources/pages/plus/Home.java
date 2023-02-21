package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.resources.common.PropertyLoader;
import net.class101.automateduitest.resources.common.Utils;
import org.openqa.selenium.By;

public class Home {

    private static final By USER_NAVIGATION_PROFILE_IMG = byXpath("(//img[@alt='profile'])[last()]");
    private static final By USER_NAVIGATION_LOGIN_BUTTON = byXpath("(//p[text()='로그인'])[last()]");
    private static final By TRENDING_CLASS_SECTION = withText("실시간 인기 클래스");
    private static final By FIRST_SAVE_BUTTON_ON_TRENDING_NOW = byXpath("(//section[contains(.,'실시간 인기 클래스')]//span[*[local-name()='svg']])[4]");
    private static final By SAVED_CLASSES_SECTION_TITLE = byXpath("//h2[contains(.,'찜한 클래스')]");
    private static final By RECOMMENDED_CLASS_SECTION = withText("추천 클래스");
    private static final By RECOMMENDED_CATEGORY_SECTION = byXpath("//*[text()='관심 클래스를 발견하지 못하셨나요?']");
    private static final By ENGLISH_CATEGORY_BUTTON = byXpath("//button[contains(.,'영어')]");
    private static final By FIRST_CURATION_ITEM = byXpath("//img[@alt='desktop-hero-banner']");
    private static final By MY_CLASS_SECTION = byXpath("//h2[contains(.,'내 클래스')]");
    private static final By SEARCH_BAR = byXpath("(//button[@type='button'])[9]");
    private static final By SEARCH_PANEL_TITLE = withText("지금 인기있는");
    private static final By SEARCH_BAR_INPUT_AFTER_CLICK = byTagName("input");
    private static final By CLOSE_MESSAGE_BUTTON = byXpath("//span[text()='더 이상 보지 않기']");
    private static final By FOOTER_TERMS_OF_USE = byXpath("(//span[text()='이용약관'])[2]");
    private static final By HOME_SUBSCRIPTION_BUTTON = byXpath("//span[text()='지금 혜택 받기']");

    public static SelenideElement loginButton() {
        return $(USER_NAVIGATION_LOGIN_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement userProfileImg() {
        return $(USER_NAVIGATION_PROFILE_IMG).shouldBe(Condition.visible);
    }

    public static SelenideElement trendingNowSectionTitle() {
        return $(TRENDING_CLASS_SECTION).shouldBe(Condition.visible);
    }

    public static SelenideElement firstSaveButtonOnTrendingNow() {
        return $(FIRST_SAVE_BUTTON_ON_TRENDING_NOW).shouldBe(Condition.visible);
    }

    public static SelenideElement savedClassesSectionTitle() {
        return $(SAVED_CLASSES_SECTION_TITLE).shouldBe(Condition.visible);
    }

    public static SelenideElement recommendedClassSectionTitle() {
        return $(RECOMMENDED_CLASS_SECTION).shouldBe(Condition.visible);
    }

    public static SelenideElement recommendedCategorySectionTitle() {
        return $(RECOMMENDED_CATEGORY_SECTION).shouldBe(Condition.visible);
    }

    public static SelenideElement englishCategoryButton() {
        return $(ENGLISH_CATEGORY_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement firstCurationItem() {
        return $(FIRST_CURATION_ITEM).shouldBe(Condition.visible);
    }

    public static SelenideElement myClassSectionTitle() {
        return $(MY_CLASS_SECTION).shouldBe(Condition.visible);
    }

    public static SelenideElement searchBar() {
        return $(SEARCH_BAR).shouldBe(Condition.visible);
    }

    public static SelenideElement searchBarInput() {
        if ($$(SEARCH_BAR_INPUT_AFTER_CLICK).size() == 0) {
            searchBar().click();
        }
        return $(SEARCH_BAR_INPUT_AFTER_CLICK).shouldBe(Condition.visible);
    }

    public static SelenideElement searchPanelTitle() {
        return $(SEARCH_PANEL_TITLE).shouldBe(Condition.visible);
    }

    public static ElementsCollection allSavedClassesSectionTitles() {
        return $$(SAVED_CLASSES_SECTION_TITLE);
    }

    public static SelenideElement footerTermsOfUse() {
        return $(FOOTER_TERMS_OF_USE).shouldBe(Condition.visible);
    }

    public static SelenideElement homeSubscriptionButton() {
        return $(HOME_SUBSCRIPTION_BUTTON).shouldBe(Condition.visible);
    }

    public class Actions {
        public static Boolean hasAdvertisement = null;

        public static void openPage() {
            final String plusHome = PropertyLoader.getProperties().urls.get("plusHome");
            open(plusHome);

            if (hasAdvertisement == null) {
                Utils.sleep(10000);
                hasAdvertisement = $$(CLOSE_MESSAGE_BUTTON).size() > 0;
            }
            if (hasAdvertisement) {
                $(CLOSE_MESSAGE_BUTTON).shouldBe(Condition.visible).click();
            }
        }
    }
}
