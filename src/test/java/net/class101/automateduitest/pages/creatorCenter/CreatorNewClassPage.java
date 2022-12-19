package net.class101.automateduitest.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class CreatorNewClassPage {

    private static final By ADD_CLASS_TITLE = byXpath("//*[text()='정규 클래스']");
    private static final By COVER_IMAGE_SECTION = byXpath("//p[text()='커버 이미지']");
    private static final By COVER_IMAGE_INPUT = byXpath("//input[@type='file' and contains(@name,'coverImage')]");
    private static final By COVER_IMAGE_SAVE_BUTTON = byXpath("//div[div[p[text()='커버 이미지']]]//span[text()='저장하기']");
    private static final By CLASS_TITLE_SECTION = byXpath("//p[text()='클래스 제목']");
    private static final By CLASS_TITLE_INPUT = byXpath("//div[div[p[text()='클래스 제목']]]//input[@name='title']");
    private static final By CLASS_TITLE_SAVE_BUTTON = byXpath("//div[div[p[text()='클래스 제목']]]//span[text()='저장하기']");
    private static final By CATEGORY_SECTION = byXpath("//p[text()='카테고리']");
    private static final By FIRST_CATEGORY_SELECTOR = byXpath("(//form[contains(.,'분야를 선택해주세요')]//select)[1]");
    private static final By SECOND_CATEGORY_SELECTOR = byXpath("(//form[contains(.,'분야를 선택해주세요')]//select)[2]");
    private static final By THIRD_CATEGORY_SELECTOR = byXpath("(//form[contains(.,'분야를 선택해주세요')]//select)[3]");
    private static final By CATEGORY_SAVE_BUTTON = byXpath("//div[div[p[text()='카테고리']]]//span[text()='저장하기']");
    private static final By CLASS_DESCRIPTION_SECTION = byXpath("//p[text()='클래스 소개']");
    private static final By CLASS_DESCRIPTION_INPUT = byXpath("//div[div[p[text()='클래스 소개']]]//div[@contenteditable and contains(@class,'toastui-editor-contents')]");
    private static final By CLASS_DESCRIPTION_SAVE_BUTTON = byXpath("//div[div[p[text()='클래스 소개']]]//span[text()='저장하기']");
    private static final By CREATOR_DESCRIPTION_SECTION = byXpath("//p[text()='크리에이터 소개']");
    private static final By CREATOR_DESCRIPTION_INPUT = byXpath("//div[div[p[text()='크리에이터 소개']]]//div[@contenteditable and contains(@class,'toastui-editor-contents')]");
    private static final By CREATOR_DESCRIPTION_SAVE_BUTTON = byXpath("//div[div[p[text()='크리에이터 소개']]]//span[text()='저장하기']");
    private static final By CLASS_AND_KIT_TAB = byXpath("//span[text()='클래스 및 키트']");
    private static final By WHAT_TO_LEARN_SECTION = byXpath("//p[text()='이런 걸 배울 거에요']");
    private static final By ADD_SKILL_BUTTON = byXpath("//span[text()='작품 추가하기']");
    private static final By ADD_SKILL_TITLE_INPUT = byXpath("//input[@name='skills[0].title']");
    private static final By ADD_SKILL_DESCRIPTION_INPUT = byXpath("//textarea[@name='skills[0].content']");
    private static final By ADD_SKILL_SAVE_BUTTON = byXpath("//div[div[p[text()='이런 걸 배울 거에요']]]//span[text()='저장하기']");
    private static final By REQUEST_REVIEW_BUTTON = byXpath("//button[contains(@style,'rgb(255, 255, 255)')]//span[text()='검토 요청']");
    private static final By MODAL_REQUEST_REVIEW_BUTTON = byXpath("//div[@id='modalBottomSheet']//span[text()='검토 요청']");
    private static final By IN_REVIEW_STATUS = byXpath("//div[*[text()='상품 상태']]//p[text()='검토 중']");
    private static final By IMG_UNDER_CLASS_INFO = byXpath("//div[div[span[text()='클래스 기본 정보']]]//form//img");

    public class Elements {

        public static SelenideElement addClassTitle() {
            return $(ADD_CLASS_TITLE);
        }

        public static SelenideElement coverImageSection() {
            return $(COVER_IMAGE_SECTION);
        }

        public static SelenideElement coverImageInput() {
            return $(COVER_IMAGE_INPUT);
        }

        public static SelenideElement coverImageSaveButton() {
            return $(COVER_IMAGE_SAVE_BUTTON);
        }

        public static SelenideElement classTitleSection() {
            return $(CLASS_TITLE_SECTION);
        }

        public static SelenideElement classTitleInput() {
            return $(CLASS_TITLE_INPUT);
        }

        public static SelenideElement classTitleSaveButton() {
            return $(CLASS_TITLE_SAVE_BUTTON);
        }

        public static SelenideElement categorySection() {
            return $(CATEGORY_SECTION);
        }

        public static SelenideElement firstCategorySelector() {
            return $(FIRST_CATEGORY_SELECTOR);
        }

        public static SelenideElement secondCategorySelector() {
            return $(SECOND_CATEGORY_SELECTOR);
        }

        public static SelenideElement thirdCategorySelector() {
            return $(THIRD_CATEGORY_SELECTOR);
        }

        public static SelenideElement categorySaveButton() {
            return $(CATEGORY_SAVE_BUTTON);
        }

        public static SelenideElement classDescriptionSection() {
            return $(CLASS_DESCRIPTION_SECTION);
        }

        public static SelenideElement classDescriptionInput() {
            return $(CLASS_DESCRIPTION_INPUT);
        }

        public static SelenideElement classDescriptionSaveButton() {
            return $(CLASS_DESCRIPTION_SAVE_BUTTON);
        }

        public static SelenideElement creatorDescriptionSection() {
            return $(CREATOR_DESCRIPTION_SECTION);
        }

        public static SelenideElement creatorDescriptionInput() {
            return $(CREATOR_DESCRIPTION_INPUT);
        }

        public static SelenideElement creatorDescriptionSaveButton() {
            return $(CREATOR_DESCRIPTION_SAVE_BUTTON);
        }

        public static SelenideElement classAndKitTab() {
            return $(CLASS_AND_KIT_TAB);
        }

        public static SelenideElement whatToLearnSection() {
            return $(WHAT_TO_LEARN_SECTION);
        }

        public static SelenideElement addSkillButton() {
            return $(ADD_SKILL_BUTTON);
        }

        public static SelenideElement addSkillTitleInput() {
            return $(ADD_SKILL_TITLE_INPUT);
        }

        public static SelenideElement addSkillDescriptionInput() {
            return $(ADD_SKILL_DESCRIPTION_INPUT);
        }

        public static SelenideElement addSkillSaveButton() {
            return $(ADD_SKILL_SAVE_BUTTON);
        }

        public static SelenideElement requestReviewButton() {
            return $(REQUEST_REVIEW_BUTTON);
        }

        public static SelenideElement modalRequestReviewButton() {
            return $(MODAL_REQUEST_REVIEW_BUTTON);
        }

        public static SelenideElement inReviewStatus() {
            return $(IN_REVIEW_STATUS);
        }
    }

    public class Actions {

        public static void waitForFileUploaded() {
            $$(IMG_UNDER_CLASS_INFO).shouldBe(CollectionCondition.size(2));
        }

        public static void waitForSubmitCoverImage() {
            $$(COVER_IMAGE_SAVE_BUTTON).shouldBe(CollectionCondition.size(0));
        }

        public static void waitForSubmitClassTitle() {
            $$(CLASS_TITLE_SAVE_BUTTON).shouldBe(CollectionCondition.size(0));
        }

        public static void waitForSubmitCategory() {
            $$(CATEGORY_SAVE_BUTTON).shouldBe(CollectionCondition.size(0));
        }

        public static void waitForSubmitClassDescription() {
            $$(CLASS_DESCRIPTION_SAVE_BUTTON).shouldBe(CollectionCondition.size(0));
        }

        public static void waitForSubmitCreatorDescription() {
            $$(CREATOR_DESCRIPTION_SAVE_BUTTON).shouldBe(CollectionCondition.size(0));
        }
    }
}
