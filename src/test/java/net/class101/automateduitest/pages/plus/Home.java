package net.class101.automateduitest.pages.plus;

import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.common.PropertyLoader;
import org.openqa.selenium.By;

public class Home {

    private static final By USER_NAVIGATION_PROFILE_IMG = byXpath("(//img[@alt='profile'])[3]");
    private static final By USER_NAVIGATION_LOGIN_BUTTON = byXpath("(//p[text()='로그인'])[3]");
    private static final By TRENDING_CLASS_SECTION = withText("실시간 인기 클래스");
    private static final By FIRST_SAVE_BUTTON_ON_TRENDING_NOW = byXpath("(//section[contains(.,'실시간 인기 클래스')]//span[*[local-name()='svg']])[4]");
    private static final By SAVED_CLASSES_SECTION_TITLE = byXpath("//h4[contains(.,'찜한 클래스')]");
    private static final By RECOMMENDED_CLASS_SECTION = withText("추천 클래스");
    private static final By RECOMMENDED_CATEGORY_SECTION = byXpath("//span[text()='관심 클래스를 발견하지 못하셨나요?']");
    private static final By ENGLISH_CATEGORY_BUTTON = byXpath("//button[contains(.,'영어')]");
    private static final By FIRST_CURATION_ITEM = byXpath("//img[@alt='desktop-hero-banner']");
    private static final By MY_CLASS_SECTION = byXpath("//h4[contains(.,'내 클래스')]");
    private static final By SEARCH_BAR = byXpath("(//button[@type='button'])[9]");
    private static final By SEARCH_PANEL_TITLE = withText("지금 인기있는");
    private static final By SEARCH_BAR_INPUT_AFTER_CLICK = byTagName("input");
    private static final By CLOSE_MESSAGE_BUTTON = byXpath("//button[@aria-label='Close Message']");

    public class Elements {

        public static SelenideElement loginButton() {
            return $(USER_NAVIGATION_LOGIN_BUTTON);
        }

        public static SelenideElement userProfileImg() {
            return $(USER_NAVIGATION_PROFILE_IMG);
        }

        public static SelenideElement trendingNowSectionTitle() {
            return $(TRENDING_CLASS_SECTION);
        }

        public static SelenideElement firstSaveButtonOnTrendingNow() {
            return $(FIRST_SAVE_BUTTON_ON_TRENDING_NOW);
        }

        public static SelenideElement savedClassesSectionTitle() {
            return $(SAVED_CLASSES_SECTION_TITLE);
        }

        public static SelenideElement recommendedClassSectionTitle() {
            return $(RECOMMENDED_CLASS_SECTION);
        }

        public static SelenideElement recommendedCategorySectionTitle() {
            return $(RECOMMENDED_CATEGORY_SECTION);
        }

        public static SelenideElement englishCategoryButton() {
            return $(ENGLISH_CATEGORY_BUTTON);
        }

        public static SelenideElement firstCurationItem() {
            return $(FIRST_CURATION_ITEM);
        }

        public static SelenideElement myClassSectionTitle() {
            return $(MY_CLASS_SECTION);
        }

        public static SelenideElement searchBar() {
            return $(SEARCH_BAR);
        }

        public static SelenideElement searchBarInput() {
            if ($$(SEARCH_BAR_INPUT_AFTER_CLICK).size() == 0) {
                searchBar().click();
            }

            return $(SEARCH_BAR_INPUT_AFTER_CLICK);
        }

        public static SelenideElement searchPanelTitle() {
            return $(SEARCH_PANEL_TITLE);
        }
    }

    public class Actions {

        private static final String STAGING_PLUS_HOME_URL = PropertyLoader.getProperties().urls.get("plusHome").staging;

        public static void openPage() {
            open(STAGING_PLUS_HOME_URL);
            //홈페이지에서 광고가 뜰 경우 끄기
            if($$(CLOSE_MESSAGE_BUTTON).size() > 0){
                $(CLOSE_MESSAGE_BUTTON).click();
            }
        }

        public static void waitForSavedClassesDisappear() {
            $$(SAVED_CLASSES_SECTION_TITLE).shouldHave(CollectionCondition.size(0));
        }

        public static void waitForSavedClassesAppear() {
            $$(SAVED_CLASSES_SECTION_TITLE).shouldHave(CollectionCondition.sizeGreaterThan(0));
        }
    }
}
