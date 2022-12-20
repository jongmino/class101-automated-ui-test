package net.class101.automateduitest.resources.testcases.website;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 클래스 - 찜하기 - 추가 / 제거 - PLP에서 찜하기 추가/제거 확인 - 제거
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 로그인한다
 */
public class UnSaveClass implements TestCase {

    @Override
    public TestCase proceed() {
        try {
            Thread.sleep(2000);
            //실시간 인기 클래스 첫번째 아이템 찜하기 취소
            Home.Elements.firstSaveButtonOnTrendingNow().shouldBe(Condition.enabled).click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public void validate() {
        //찜하기 섹션 사라짐 확인
        Home.Actions.waitForSavedClassesDisappear();
    }
}
