package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * @설명: 크리에이터 센터 상품을 정상적으로 제거가 가능한지 테스트한다
 *
 * @테스트_선행조건:
 *  1) 크리에이터 홈으로 진입한다
 *  2) 상품이 생성되는 테스트 케이스를 실행한다
 */
public class DeleteFirstProduct implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorProductPage.creatorCenterLogo().click();
        CreatorProductPage.privateStatus();
        CreatorProductPage.firstProductSelectBox().click();
        CreatorProductPage.deleteButton().click();
        CreatorProductPage.modalDeleteButton().click();
        CreatorProductPage.modalDeleteButton().should(Condition.disappear);
        CreatorProductPage.deletedToast();
        return this;
    }

    @Override
    public void validate() {
    }
}
