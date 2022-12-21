package net.class101.automateduitest.resources.testcases.website;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * @설명: 찜한 클래스의 찜하기를 모두 취소했을 시 '찜한 클래스' 섹션이 정상적으로 없어지는지 테스트한다
 * @분류: 클래스 - 찜하기 - 추가 / 제거 - PLP에서 찜하기 추가/제거 확인 - 제거
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 로그인한다
 */
public class UnSaveClass implements TestCase {

    @Override
    public TestCase proceed() {
        try {
            Thread.sleep(2000);
            //실시간 인기 클래스 첫번째 아이템 찜하기 취소
            Home.firstSaveButtonOnTrendingNow().shouldBe(Condition.enabled).click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public void validate() {
        //찜하기 섹션 사라짐 확인
        Home.allSavedClassesSectionTitles()
                .shouldHave(CollectionCondition.size(0)); // wait For Saved Classes Disappear
        
        
    }
}
