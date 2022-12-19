package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import java.io.File;
import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.pages.creatorCenter.CreatorNewClassPage;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 * 크리에이터 센터 - 상품 - 정규 클래스 - 클래스 생성 페이지 작성 필수 항목 작성 및 검토요청
 *
 * Prerequisite:
 * 1) 크리에이터 홈으로 진입한다
 * 2) 크리에이터 신규 계정으로 로그인한다
 */
public class CheckRequestClassReview implements TestScenario {

    @Override
    public TestScenario proceed() {
        SF.get(CheckAddClass.class).proceed();

        //커버 이미지(필수) 추가
        CreatorNewClassPage.Elements.coverImageSection().shouldBe(Condition.visible).click();
        CreatorNewClassPage.Elements.coverImageInput().uploadFile(new File("src/test/images/cover.png"));
        CreatorNewClassPage.Actions.waitForFileUploaded();
        CreatorNewClassPage.Elements.coverImageSaveButton().shouldBe(Condition.enabled).click();
        CreatorNewClassPage.Actions.waitForSubmitCoverImage();

        //클래스 제목(필수) 입력
        CreatorNewClassPage.Elements.classTitleSection().click();
        CreatorNewClassPage.Elements.classTitleInput().shouldBe(Condition.visible).sendKeys("제다이의 광선검 101");
        CreatorNewClassPage.Elements.classTitleSaveButton().shouldBe(Condition.enabled).click();
        CreatorNewClassPage.Actions.waitForSubmitClassTitle();

        //카테고리(필수) 선택
        CreatorNewClassPage.Elements.categorySection().click();
        CreatorNewClassPage.Elements.firstCategorySelector().selectOption(1);
        CreatorNewClassPage.Elements.secondCategorySelector().selectOption(1);
        CreatorNewClassPage.Elements.thirdCategorySelector().selectOption(1);
        CreatorNewClassPage.Elements.categorySaveButton().click();
        CreatorNewClassPage.Actions.waitForSubmitCategory();

        //클래스 소개(필수) 입력
        CreatorNewClassPage.Elements.classDescriptionSection().click();
        CreatorNewClassPage.Elements.classDescriptionInput().sendKeys("제다이의 광선검 기초부터 전문가까지! 지금 바로 수강하세요!");
        CreatorNewClassPage.Elements.classDescriptionSaveButton().click();
        CreatorNewClassPage.Actions.waitForSubmitClassDescription();

        //크리에이터 소개(필수) 입력
        CreatorNewClassPage.Elements.creatorDescriptionSection().click();
        CreatorNewClassPage.Elements.creatorDescriptionInput().sendKeys("제다이");
        CreatorNewClassPage.Elements.creatorDescriptionSaveButton().click();
        CreatorNewClassPage.Actions.waitForSubmitCreatorDescription();

        //클래스 및 키트 탭 이동
        CreatorNewClassPage.Elements.addClassTitle().scrollIntoView(true);
        CreatorNewClassPage.Elements.classAndKitTab().click();

        //이런 걸 배울 거에요(필수) 추가
        CreatorNewClassPage.Elements.whatToLearnSection().click();
        CreatorNewClassPage.Elements.addSkillButton().click();
        CreatorNewClassPage.Elements.addSkillTitleInput().sendKeys("광선검의 원리");
        CreatorNewClassPage.Elements.addSkillDescriptionInput().sendKeys("광선검은...");
        CreatorNewClassPage.Elements.addSkillSaveButton().click();

        //검토요청
        CreatorNewClassPage.Elements.requestReviewButton().shouldBe(Condition.enabled).click();
        CreatorNewClassPage.Elements.modalRequestReviewButton().shouldBe(Condition.enabled).click();

        return this;
    }

    @Override
    public void validate() {
        CreatorNewClassPage.Elements.inReviewStatus().shouldBe(Condition.visible);
    }
}
