package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.*;
import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.creatorCenter.*;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.pages.admin.adminClasses;
import net.class101.automateduitest.resources.testcases.TestCase;

import java.io.File;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * @설명: 정규 클래스 생성 및 오픈한다.
 * @분류: 크리에이터 센터 - 상품 만들기.
 * @테스트_선행조건:
 *  1) 크리에이터 계정에서 껍데기 정규 클래스를 1개 생성해둔다. (상품 만들기 > 정규 클래스 만들기만 하고 내용을 채우지 않아도 됨.)
 */
public class ClassCreateAutomationTestCases implements TestCase {


    @Override
    public TestCase proceed() {

            //클래스 생성 후 상세 페이지 진입
            CreatorProductPage.createProductButton().shouldNotBe(Condition.disabled).click();
            CreatorAddProductPage.createClassButton().click();
            CreatorNewClassPage.Action.setCurrentUrl(); // 현재 URL을 저장한다

            //기본정보 탭 > 커버 이미지 추가
            CreatorNewClassPage.coverImageSection().click();
            CreatorNewClassPage.coverImageInput().uploadFile(new File(MyPage.Actions.setTestImages()));
            {
                if (MyPage.Actions.setRecentLoadImage().equals(MyPage.Actions.getTestImages())) {
                    CreatorNewClassPage.coverImageInput().uploadFile(new File(MyPage.Actions.setTestImages()));
                }
            }
            CreatorNewClassPage.allImageUnderClassInfo().shouldBe(CollectionCondition.size(2)); // wait for file uploaded
            Utils.sleep(2000);
            CreatorNewClassPage.coverImageSaveButton().shouldBe(Condition.enabled).click();
            CreatorNewClassPage.allCoverImageSaveButton().shouldBe(CollectionCondition.size(0)); // 커버 이미지가 완전히 submit 될 때까지 기다린다

            //기본정보 탭 > 클래스 제목 추가
            CreatorNewClassPage.classTitleSection().click();
            CreatorNewClassPage.classTitleInput().sendKeys(CreatorNewClassPage.Action.setClassTitleName());
            Utils.sleep(1000);
            CreatorNewClassPage.classTitleSaveButton().shouldBe(Condition.enabled).click();
            CreatorNewClassPage.allClassTitleSaveButton().shouldBe(CollectionCondition.size(0)); // 클래스 제목이 완전히 submit 될 때까지 기다린다

            //기본정보 탭 > 카테고리 추가 (첫 번째 카테고리만 랜덤으로 선택하게 만들었고 나머지는 1번째 카테고리를 선택하게 만들었다 //나중에 이후 카테고리도 랜덤으로 선택하게 만들어야 함)
            CreatorNewClassPage.classTitleSection().scrollIntoView(true);
            CreatorNewClassPage.categorySection().click();
            CreatorNewClassPage.firstCategorySelector().selectOption(CreatorNewClassPage.Action.setTestFirstCategory());
            {
                if (CreatorNewClassPage.Action.setRecentLoadCategory().equals(CreatorNewClassPage.Action.getTestFirstCategory())) {
                    CreatorNewClassPage.firstCategorySelector().selectOption(CreatorNewClassPage.Action.setTestFirstCategory());
                }
            }
            Utils.sleep(1000);
            CreatorNewClassPage.secondCategorySelector().selectOption(1);
            Utils.sleep(1000);
            CreatorNewClassPage.thirdCategorySelector().selectOption(1);
            Utils.sleep(1000);
            CreatorNewClassPage.categorySaveButton().click();
            CreatorNewClassPage.allCategorySaveButton()
                    .shouldBe(CollectionCondition.size(0)); // wait for submit category

            //기본정보 탭 > 클래스 소개 추가
            CreatorNewClassPage.classDescriptionSection().click();
            CreatorNewClassPage.classDescriptionInput().sendKeys(CreatorNewClassPage.Action.setRandomName());
            CreatorNewClassPage.classDescriptionSaveButton().click();
            CreatorNewClassPage.allClassDescriptionSaveButtons()
                    .shouldBe(CollectionCondition.size(0)); // wait for submit class description

            //기본정보 탭 > 크리에이터 소개 추가
            CreatorNewClassPage.creatorDescriptionSection().click();
            CreatorNewClassPage.creatorDescriptionInput().sendKeys(CreatorNewClassPage.Action.setRandomName());
            CreatorNewClassPage.creatorDescriptionSaveButton().click();
            CreatorNewClassPage.allCreatorDescriptionSaveButtons()
                    .shouldBe(CollectionCondition.size(0)); // wait for submit creator description
            Utils.sleep(2000);

            //클래스 및 키트 탭 이동
            CreatorNewClassPage.addClassTitle().scrollIntoView(true);
            CreatorNewClassPage.classAndKitTab().click();

            //클래스 및 키트 탭 > 이런 걸 배울 거에요 추가
            CreatorNewClassPage.whatToLearnSection().click();
            CreatorNewClassPage.addSkillButton().click();
            CreatorNewClassPage.addSkillTitleInput().sendKeys(CreatorNewClassPage.Action.setRandomName());
            CreatorNewClassPage.addSkillDescriptionInput().sendKeys(CreatorNewClassPage.Action.setRandomName());
            CreatorNewClassPage.addSkillSaveButton().click();

            //검토 요청
            Utils.sleep(3000);
            CreatorNewClassPage.requestReviewButton().shouldBe(Condition.enabled).click();
            CreatorNewClassPage.modalRequestReviewButton().shouldBe(Condition.enabled).click();

            //클래스 리스트로 돌아가기
            CreatorProductPage.Actions.openPage();


            //크리레이팅 서비스 플랜 설정
            CreatorNewClassPage.classTitleSearchInput().sendKeys(CreatorNewClassPage.Action.getRecentClassTitleName());
            CreatorNewClassPage.Action.getRecentClassTitleName().equals(CreatorNewClassPage.classTitleSearchMatched().getText());
            CreatorNewClassPage.classSeemoreButton().click();
            CreatorNewClassPage.creatingServicePlan().click();
            Utils.sleep(1000);
            CreatorNewClassPage.creatingServicePlanInput().click();
            CreatorNewClassPage.creatingServicePlanBasic().click();
            Utils.sleep(3000);
            CreatorNewClassPage.creatingServicePlanSaveButton().click();

            CreatorNewClassPage.creatingServicePlan().click();
            CreatorNewClassPage.creatingServicePlanInput().getValue().equals("62a9a4cb0cfbc976a5fc6212");

            // 어드민 페이지로 전환

            SF.get(LogoutCreatorCenter.class).proceed();
            CreatorProductPage.Actions.openPage();
            SF.get(LoginAsAdminUser.class).proceed().validate(); //로그아웃 한 후에 간헐적으로 페이지 로딩을 못함.
            Utils.sleep(3000);
            CreatorClassNewsPage.DirectUrl.openPage();

            //영상 언어
            CreatorNewClassPage.adminVideoLanguageKR().click();
            CreatorNewClassPage.adminVideoLanguageChangeButton().click();

            //구독 공개 예정 관리
            CreatorNewClassPage.adminSubscriptionScheduledOpen().click();
            //CreatorNewClassPage.adminSubscriptionScheduledOpenCalender().click();
            CreatorNewClassPage.adminSubscriptionScheduledOpenCalender().sendKeys("2024.12");
            CreatorNewClassPage.adminSubscriptionScheduledOpenSaveButton().click();

            //클래스 스토어 생성
            CreatorNewClassPage.adminClassStoreScroll().scrollIntoView(true);
            CreatorNewClassPage.adminClassStore().click();
            getWebDriver().switchTo().alert().accept();

            //관리자용 작업실
            CreatorNewClassPage.adminWorkspace().scrollIntoView(true);
            CreatorNewClassPage.adminWorkspace().click(); // 관리자용 작업실 오픈
            CreatorNewClassPage.adminWorkspace().click(); // 관리자용 작업실을 오픈했는데 자동으로 닫혀서 임시방편으로 재클릭하여 오픈되도록 함.
            CreatorNewClassPage.adminWorkspacePageOpenTitle().scrollIntoView(true);
            CreatorNewClassPage.adminWorkspacePagePublic().click(); // 페이지 공개 여부 > 전체 공개
            CreatorNewClassPage.adminWorkspaceClassLaunchInput().clear(); // 클래스 런칭일 clear
            CreatorNewClassPage.adminWorkspaceClassLaunchInput().sendKeys("2024-12-01"); // 클래스 런칭일 입력
            CreatorNewClassPage.adminWorkspaceSaveButton().click(); // 클래수 수정 탭 저장하기
            getWebDriver().switchTo().alert().accept(); // MD 정보 확인 팝업
            getWebDriver().switchTo().alert().accept(); // 얼리버드 쿠폰? 확인 팝업
            CreatorNewClassPage.adminWorkspace().click(); // 관리자용 작업실 오픈
            CreatorNewClassPage.adminWorkspaceTitle().scrollIntoView(true);
            Utils.sleep(1000);
            CreatorNewClassPage.adminWorkspacePackageEditTitle().click(); // 패키지 수정 탭 클릭
            CreatorNewClassPage.adminWorkspacePackageAddButton().click(); // 패키지 추가 버튼 클릭
            CreatorNewClassPage.adminWorkspacePackageNameInput().clear(); // 패키지명 clear
            CreatorNewClassPage.adminWorkspacePackageNameInput().sendKeys(CreatorNewClassPage.Action.setRandomName()); // 패키지명 입력
            CreatorNewClassPage.adminWorkspacePackageSaveButton().click(); // 패키지 수정 탭 저장
            CreatorNewClassPage.adminWorkspace().click(); // 관리자용 작업실 오픈
            CreatorNewClassPage.adminWorkspaceTitle().scrollIntoView(true);
            CreatorNewClassPage.adminWorkspacePackageEditTitle().click(); // 패키지 수정 탭 클릭
            CreatorNewClassPage.adminWorkspacePackageDefaultInput().selectOption(CreatorNewClassPage.Action.getRecentRandomName());
            CreatorNewClassPage.adminWorkspacePackageSaveButton().click(); // 패키지 수정 탭 저장

            //어드민 페이지
            adminClasses.AdminClassesUrl.openPage(); // 어드민 > 클래스 목록으로 진입
            SF.get(LoginAsAdminUser.class).proceed().validate(); // 어드민 로그인
            CreatorNewClassPage.adminClassesTitle().click(); // 제목 필터 클릭
            CreatorNewClassPage.adminClassesTitleInput().sendKeys(CreatorNewClassPage.Action.getRecentClassTitleName()); // 클래스 제목 입력
            CreatorNewClassPage.adminClassesTitleAddFilter().click(); // 필터 추카 버튼 클릭
            CreatorNewClassPage.adminClassesEditButton().click(); // 클래스 수정 버튼 클릭
            CreatorNewClassPage.adminClassesEditLaunchButton().click(); // 클래스 런칭 버튼 클릭
            CreatorNewClassPage.adminClassesEeitPopupLaunchButton().click(); // 클래스 런칭 팝업 내 런칭 버튼 클릭

            return this;

    }


    @Override
    public void validate() {
        assertTrue(Utils.urlContains("edit"));
        getWebDriver().close();

    }
}
