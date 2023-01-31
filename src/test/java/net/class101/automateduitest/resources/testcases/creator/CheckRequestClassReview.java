package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import java.io.File;
import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorNewClassPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명: 크리에이터 센터 '클래스 생성 페이지'에서 필수 항목 작성 후 '검토요청'버튼 클릭시 상태가 검토중으로 변경 되는지 테스트한다
 * @분류: 크리에이터 센터 - 상품 - 정규 클래스 - 클래스 생성 페이지 작성 필수 항목 작성 및 검토요청
 * @테스트_선행조건:
 *  1) 크리에이터 홈으로 진입한다
 *  2) 크리에이터 신규 계정으로 로그인한다
 */
public class CheckRequestClassReview implements TestCase {

    @Override
    public TestCase proceed() {
        SF.get(CheckAddClass.class).proceed();

        //커버 이미지(필수) 추가
        CreatorNewClassPage.coverImageSection().click();
        CreatorNewClassPage.coverImageInput().uploadFile(new File("src/test/images/cover.png"));
        CreatorNewClassPage.allImageUnderClassInfo()
                .shouldBe(CollectionCondition.size(2)); // wait for file uploaded
        CreatorNewClassPage.coverImageSaveButton().shouldBe(Condition.enabled).click();
        CreatorNewClassPage.allCoverImageSaveButton()
                .shouldBe(CollectionCondition.size(0)); // 커버 이미지가 완전히 submit 될 때까지 기다린다

        //클래스 제목(필수) 입력
        CreatorNewClassPage.classTitleSection().click();
        CreatorNewClassPage.classTitleInput().sendKeys("제다이의 광선검 101");
        CreatorNewClassPage.classTitleSaveButton().shouldBe(Condition.enabled).click();
        CreatorNewClassPage.allClassTitleSaveButton()
                .shouldBe(CollectionCondition.size(0)); // wait for submit class title

        //카테고리(필수) 선택
        CreatorNewClassPage.categorySection().click();
        CreatorNewClassPage.firstCategorySelector().selectOption(1);
        CreatorNewClassPage.secondCategorySelector().selectOption(1);
        CreatorNewClassPage.thirdCategorySelector().selectOption(1);
        CreatorNewClassPage.categorySaveButton().click();
        CreatorNewClassPage.allCategorySaveButton()
                .shouldBe(CollectionCondition.size(0)); // wait for submit category

        //클래스 소개(필수) 입력
        CreatorNewClassPage.classDescriptionSection().click();
        CreatorNewClassPage.classDescriptionInput().sendKeys("제다이의 광선검 기초부터 전문가까지! 지금 바로 수강하세요!");
        CreatorNewClassPage.classDescriptionSaveButton().click();
        CreatorNewClassPage.allClassDescriptionSaveButtons()
                .shouldBe(CollectionCondition.size(0)); // wait for submit class description

        //크리에이터 소개(필수) 입력
        CreatorNewClassPage.creatorDescriptionSection().click();
        CreatorNewClassPage.creatorDescriptionInput().sendKeys("제다이");
        CreatorNewClassPage.creatorDescriptionSaveButton().click();
        CreatorNewClassPage.allCreatorDescriptionSaveButtons()
                .shouldBe(CollectionCondition.size(0)); // wait for submit creator description

        //클래스 및 키트 탭 이동
        CreatorNewClassPage.addClassTitle().scrollIntoView(true);
        CreatorNewClassPage.classAndKitTab().click();

        //이런 걸 배울 거에요(필수) 추가
        CreatorNewClassPage.whatToLearnSection().click();
        CreatorNewClassPage.addSkillButton().click();
        CreatorNewClassPage.addSkillTitleInput().sendKeys("광선검의 원리");
        CreatorNewClassPage.addSkillDescriptionInput().sendKeys("광선검은...");
        CreatorNewClassPage.addSkillSaveButton().click();

        //검토요청
        CreatorNewClassPage.requestReviewButton().shouldBe(Condition.enabled).click();
        CreatorNewClassPage.modalRequestReviewButton().shouldBe(Condition.enabled).click();

        return this;
    }

    @Override
    public void validate() {
        assertTrue(CreatorNewClassPage.inReviewStatus().exists());
    }
}
