package net.class101.automateduitest.resources.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.Random;
import java.util.UUID;

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
    private static final By IMG_UNDER_CLASS_INFO = byXpath("//div[div[*[text()='클래스 기본 정보']]]//form//img");
    private static final By CLASS_TITLE_SERACH_INPUT = byXpath("//input[@placeholder='상품명 검색']");
    private static final By CLASS_TITLE_SERACH_MATCHED = byXpath("//*[@id=\"__next\"]/main/div/div/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div/div/div[3]/div/p");
    private static final By CLASS_SEEMORE_BUTTON = byXpath("//*[@id=\"__next\"]/main/div/div/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div/div[1]/div[9]/div/div/button[2]");
    private static final By CREATING_SERVICE_PLAN = byXpath("//*[@id=\"popover\"]/div/div/div/div[2]/div/div[1]/div");
    private static final By CREATING_SERVICE_PLAN_INPUT = byXpath("//select[@name='selectedPlanId']");
    private static final By CREATING_SERVICE_PLAN_BASIC = byXpath("(//form[contains(.,'선택 없음')]//option[@value='62a9a4cb0cfbc976a5fc6212'])");
    private static final By CREATING_SERVICE_PLAN_SAVE_BUTTON = byXpath("//span[text()='저장']");
    private static final By CLASS_PRODUCT_URL = byXpath("//*[@id=\"__next\"]/main/div/div/div[2]/div[2]/div[1]/div/div[1]/div[2]/a");
    private static final By ADMIN_VIDEO_LANGUAGE_KR = byXpath("//form[contains(.,'영상의 언어를 선택해주세요')]//option[@value='ko']");
    private static final By ADMIN_VIDEO_LANGUAGE_CHANGE_BUTTON = byXpath("//span[text()='변경하기']");
    private static final By ADMIN_SUBSCRIPTION_SCHEDULED_OPEN = byXpath("//form[contains(.,'미설정')]//option[@value='Upcoming']");
    private static final By ADMIN_SUBSCRIPTION_SCHEDULED_OPEN_CALRENDER = byXpath("//input[@name='willLaunchAt']");
    private static final By ADMIN_SUBSCRIPTION_SCHEDULED_OPEN_CALRENDER_MONTH = byXpath("//*[@id=\"__next\"]/main/div/div/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div[2]/div/div[5]/form[3]/div/div/div/div/div[2]/div[3]/div[1]/button[2]");
    private static final By ADMIN_SUBSCRIPTION_SCHEDULED_OPEN_CALRENDER_DAY = byXpath("//p[text()='1']");
    private static final By ADMIN_SUBSCRIPTION_SCHEDULED_OPEN_SAVE_BUTTON = byXpath("//form[contains(.,'구독 공개 예정 관리')]//span[text()='저장하기']");
    private static final By ADMIN_CLASS_STORE_SCROLL = byXpath("//span[text()='클래스 종료 알림 보내기']");
    private static final By ADMIN_CLASS_STORE = byXpath("//span[text()='클래스 스토어 생성하기'][1]");
    private static final By ADMIN_WORKSPACE = byXpath("//div[*[text()='관리자용 작업실']]//p[text()='관리자님을 위한 공간입니다. 클래스를 가공해주세요.']");
    private static final By ADMIN_WORKSPACE_TITLE = byXpath("//h2[text()='관리자용 작업실']");
    private static final By ADMIN_WORKSPACE_PAGE_OPEN_TITLE = byXpath("//label[text()='페이지 공개 여부']");
    private static final By ADMIN_WORKSPACE_PAGE_PUBLIC = byXpath("//form[contains(.,'비공개')]//option[@value='shown']");
    private static final By ADMIN_WORKSPACE_SAVE_BUTTON = byXpath("//button[contains(@data-element-name,'product-admin-form-save-button')]//span[text()='저장하기']");
    private static final By ADMIN_WORKSPACE_CLASS_LAUNCH_INPUT = byXpath("//div[*[text()='클래스 런칭일']]//input[@autocomplete='off' and contains(@placeholder,'YYYY-MM-DD HH:mm:ssTZ')]");
    private static final By ADMIN_WORKSPACE_PACKAGE_EDIT_TITLE = byXpath("//div[*[text()='패키지 수정']]");
    private static final By ADMIN_WORKSPACE_PACKAGE_ADD_BUTTON = byXpath("//div[*[text()='추가하기']]");
    private static final By ADMIN_WORKSPACE_PACKAGE_NAME_INPUT = byXpath("//input[@type='text' and contains(@value,'이름 없음')]");
    private static final By ADMIN_WORKSPACE_PACKAGE_SAVE_BUTTON = byXpath("//button[contains(@color,'blue')]//span[text()='저장']");
    private static final By ADMIN_WORKSPACE_PACKAGE_DEFAULT_INPUT = byXpath("//form[contains(.,'기본 패키지 설정')]//select[@inputsize='medium']");
    private static final By ADMIN_CLASSES_TITLE = byXpath("//button[contains(@type,'button')]//span[text()='제목']");
    private static final By ADMIN_CLASSES_TITLE_INPUT = byXpath("//div[*[text()='제목이']]//input[@type='text']");
    private static final By ADMIN_CLASSES_TITLE_ADD_FILTER = byXpath("//button[contains(@type,'button')]//span[text()='필터 추가']");
    private static final By ADMIN_CLASSES_EDIT_BUTTON = byXpath("//*[@id=\"__next\"]/div[2]/div/main/div/div/div[5]/div/div[1]/div[1]/div/div[2]/div/div/div[1]/div/div[5]/div/button");
    private static final By ADMIN_CLASSES_EDIT_LAUNCH_BUTTON = byXpath("//button[contains(@style,'rgb(255, 255, 255)')]//span[text()='런칭하기']");
    private static final By ADMIN_CLASSES_EDIT_POPUP_LAUNCH_BUTTON = byXpath("//*[@id=\"modalBottomSheet\"]/div/div/div[2]/div/div[6]/button[2]");



    public static SelenideElement classProductUrl() {
        return $(CLASS_PRODUCT_URL).shouldBe(Condition.visible);
    }


    public static SelenideElement classTitleSearchInput() {
        return $(CLASS_TITLE_SERACH_INPUT).shouldBe(Condition.visible);
    }

    public static SelenideElement classTitleSearchMatched() {
        return $(CLASS_TITLE_SERACH_MATCHED).shouldBe(Condition.visible);
    }

    public static SelenideElement classSeemoreButton() {
        return $(CLASS_SEEMORE_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement creatingServicePlan() {
        return $(CREATING_SERVICE_PLAN).shouldBe(Condition.visible);
    }

    public static SelenideElement creatingServicePlanInput() {
        return $(CREATING_SERVICE_PLAN_INPUT).shouldBe(Condition.visible);
    }

    public static SelenideElement creatingServicePlanBasic() {
        return $(CREATING_SERVICE_PLAN_BASIC).shouldBe(Condition.visible);
    }

    public static SelenideElement creatingServicePlanSaveButton() {
        return $(CREATING_SERVICE_PLAN_SAVE_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement adminVideoLanguageKR() {
        return $(ADMIN_VIDEO_LANGUAGE_KR).shouldBe(Condition.visible);
    }

    public static SelenideElement adminVideoLanguageChangeButton() {
        return $(ADMIN_VIDEO_LANGUAGE_CHANGE_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement adminSubscriptionScheduledOpen() {
        return $(ADMIN_SUBSCRIPTION_SCHEDULED_OPEN).shouldBe(Condition.visible);
    }

    public static SelenideElement adminSubscriptionScheduledOpenCalender() {
        return $(ADMIN_SUBSCRIPTION_SCHEDULED_OPEN_CALRENDER).shouldBe(Condition.visible);
    }

    public static SelenideElement adminSubscriptionScheduledOpenCalenderMonth() {
        return $(ADMIN_SUBSCRIPTION_SCHEDULED_OPEN_CALRENDER_MONTH).shouldBe(Condition.visible);
    }

    public static SelenideElement adminSubscriptionScheduledOpenCalenderDay() {
        return $(ADMIN_SUBSCRIPTION_SCHEDULED_OPEN_CALRENDER_DAY).shouldBe(Condition.visible);
    }

    public static SelenideElement adminSubscriptionScheduledOpenSaveButton() {
        return $(ADMIN_SUBSCRIPTION_SCHEDULED_OPEN_SAVE_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement adminClassStoreScroll() {
        return $(ADMIN_CLASS_STORE_SCROLL).shouldBe(Condition.visible);
    }

    public static SelenideElement adminClassStore() {
        return $(ADMIN_CLASS_STORE).shouldBe(Condition.visible);
    }

    public static SelenideElement adminWorkspace() {
        return $(ADMIN_WORKSPACE).shouldBe(Condition.visible);
    }

    public static SelenideElement adminWorkspaceTitle() {
        return $(ADMIN_WORKSPACE_TITLE).shouldBe(Condition.visible);
    }

    public static SelenideElement adminWorkspacePageOpenTitle() {
        return $(ADMIN_WORKSPACE_PAGE_OPEN_TITLE).shouldBe(Condition.visible);
    }

    public static SelenideElement adminWorkspacePagePublic() {
        return $(ADMIN_WORKSPACE_PAGE_PUBLIC).shouldBe(Condition.visible);
    }

    public static SelenideElement adminWorkspaceSaveButton() {
        return $(ADMIN_WORKSPACE_SAVE_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement adminWorkspaceClassLaunchInput() {
        return $(ADMIN_WORKSPACE_CLASS_LAUNCH_INPUT).shouldBe(Condition.visible);
    }

    public static SelenideElement adminWorkspacePackageEditTitle() {
        return $(ADMIN_WORKSPACE_PACKAGE_EDIT_TITLE).shouldBe(Condition.visible);
    }

    public static SelenideElement adminWorkspacePackageAddButton() {
        return $(ADMIN_WORKSPACE_PACKAGE_ADD_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement adminWorkspacePackageNameInput() {
        return $(ADMIN_WORKSPACE_PACKAGE_NAME_INPUT).shouldBe(Condition.visible);
    }

    public static SelenideElement adminWorkspacePackageSaveButton() {
        return $(ADMIN_WORKSPACE_PACKAGE_SAVE_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement adminWorkspacePackageDefaultInput() {
        return $(ADMIN_WORKSPACE_PACKAGE_DEFAULT_INPUT).shouldBe(Condition.visible);
    }

    public static SelenideElement adminClassesTitle() {
        return $(ADMIN_CLASSES_TITLE).shouldBe(Condition.visible);
    }

    public static SelenideElement adminClassesTitleInput() {
        return $(ADMIN_CLASSES_TITLE_INPUT).shouldBe(Condition.visible);
    }

    public static SelenideElement adminClassesTitleAddFilter() {
        return $(ADMIN_CLASSES_TITLE_ADD_FILTER).shouldBe(Condition.visible);
    }

    public static SelenideElement adminClassesEditButton() {
        return $(ADMIN_CLASSES_EDIT_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement adminClassesEditLaunchButton() {
        return $(ADMIN_CLASSES_EDIT_LAUNCH_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement adminClassesEeitPopupLaunchButton() {
        return $(ADMIN_CLASSES_EDIT_POPUP_LAUNCH_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement addClassTitle() {
        return $(ADD_CLASS_TITLE).shouldBe(Condition.visible);
    }

    public static SelenideElement coverImageSection() {
        return $(COVER_IMAGE_SECTION).shouldBe(Condition.visible);
    }

    public static SelenideElement coverImageInput() {
        return $(COVER_IMAGE_INPUT);
    }

    public static SelenideElement coverImageSaveButton() {
        return $(COVER_IMAGE_SAVE_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement classTitleSection() {
        return $(CLASS_TITLE_SECTION).shouldBe(Condition.visible);
    }

    public static SelenideElement classTitleInput() {
        return $(CLASS_TITLE_INPUT).shouldBe(Condition.visible);
    }

    public static SelenideElement classTitleSaveButton() {
        return $(CLASS_TITLE_SAVE_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement categorySection() {
        return $(CATEGORY_SECTION).shouldBe(Condition.visible);
    }

    public static SelenideElement firstCategorySelector() {
        return $(FIRST_CATEGORY_SELECTOR).shouldBe(Condition.visible);
    }

    public static SelenideElement secondCategorySelector() {
        return $(SECOND_CATEGORY_SELECTOR).shouldBe(Condition.visible);
    }

    public static SelenideElement thirdCategorySelector() {
        return $(THIRD_CATEGORY_SELECTOR).shouldBe(Condition.visible);
    }

    public static SelenideElement categorySaveButton() {
        return $(CATEGORY_SAVE_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement classDescriptionSection() {
        return $(CLASS_DESCRIPTION_SECTION).shouldBe(Condition.visible);
    }

    public static SelenideElement classDescriptionInput() {
        return $(CLASS_DESCRIPTION_INPUT).shouldBe(Condition.visible);
    }

    public static SelenideElement classDescriptionSaveButton() {
        return $(CLASS_DESCRIPTION_SAVE_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement creatorDescriptionSection() {
        return $(CREATOR_DESCRIPTION_SECTION).shouldBe(Condition.visible);
    }

    public static SelenideElement creatorDescriptionInput() {
        return $(CREATOR_DESCRIPTION_INPUT).shouldBe(Condition.visible);
    }

    public static SelenideElement creatorDescriptionSaveButton() {
        return $(CREATOR_DESCRIPTION_SAVE_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement classAndKitTab() {
        return $(CLASS_AND_KIT_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement whatToLearnSection() {
        return $(WHAT_TO_LEARN_SECTION).shouldBe(Condition.visible);
    }

    public static SelenideElement addSkillButton() {
        return $(ADD_SKILL_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement addSkillTitleInput() {
        return $(ADD_SKILL_TITLE_INPUT).shouldBe(Condition.visible);
    }

    public static SelenideElement addSkillDescriptionInput() {
        return $(ADD_SKILL_DESCRIPTION_INPUT).shouldBe(Condition.visible);
    }

    public static SelenideElement addSkillSaveButton() {
        return $(ADD_SKILL_SAVE_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement requestReviewButton() {
        return $(REQUEST_REVIEW_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement modalRequestReviewButton() {
        return $(MODAL_REQUEST_REVIEW_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement inReviewStatus() {
        return $(IN_REVIEW_STATUS).shouldBe(Condition.visible);
    }

    public static ElementsCollection allImageUnderClassInfo() {
        return $$(IMG_UNDER_CLASS_INFO);
    }

    public static ElementsCollection allCoverImageSaveButton() {
        return $$(COVER_IMAGE_SAVE_BUTTON);
    }

    public static ElementsCollection allClassTitleSaveButton() {
        return $$(CLASS_TITLE_SAVE_BUTTON);
    }

    public static ElementsCollection allCategorySaveButton() {
        return $$(CATEGORY_SAVE_BUTTON);
    }

    public static ElementsCollection allClassDescriptionSaveButtons() {
        return $$(CLASS_DESCRIPTION_SAVE_BUTTON);
    }

    public static ElementsCollection allCreatorDescriptionSaveButtons() {
        return $$(CREATOR_DESCRIPTION_SAVE_BUTTON);
    }

    public class Actions {
        private static String RecentRandomName = "getRecentRandomName";
        public static String setRandomName() {
            RecentRandomName = UUID.randomUUID().toString().replace("-", "").substring(0, 20);
            return RecentRandomName;
        }
        public static String getRecentRandomName() {
            return RecentRandomName;
        }


        private static String CurrentUrl = "getCurrentUrl";
        public static String setCurrentUrl() {
            CurrentUrl = classProductUrl().getAttribute("href").toString().replaceFirst("center/products","creator/projects").replace("preview", "edit");
            return CurrentUrl;
        }
        public static String getCurrentUrl() {
            return CurrentUrl;
        }


        private static String RecentClassTitleName = "getRecentClassTitleName";
        public static String setClassTitleName() {
            RecentClassTitleName = UUID.randomUUID().toString().replace("-", "").substring(0, 20);
            return RecentClassTitleName;
        }
        public static String getRecentClassTitleName() {
            return RecentClassTitleName;
        }



        private static final String[] TEST_FIRST_CATEGORY = { "크리에이티브", "수익 창출", "직무", "외국어", "키즈", "준비물 · 키트" };
        public static String setTestFirstCategory() {
            Random random = new Random();
            int randomNum = random.nextInt(5);
            return TEST_FIRST_CATEGORY[randomNum];
        }

        public static String getTestFirstCategory() {
            return TEST_FIRST_CATEGORY[0];
        }

        private static String RecentLoadCategory = "getRecentLoadCategory";
        public static String setRecentLoadCategory() {
            RecentLoadCategory = setTestFirstCategory();
            return RecentLoadCategory;
        }
        public static String getRecentLoadCategory() {
            return RecentLoadCategory;
        }
    }

    public class openDirectUrl {
        public static void openPage() {
            final String CREATOR_CENTER_PRODUCT_DIRECT_URL = CreatorNewClassPage.Actions.getCurrentUrl();
            open(CREATOR_CENTER_PRODUCT_DIRECT_URL);
        }
    }


}
