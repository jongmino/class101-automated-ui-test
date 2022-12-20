package net.class101.automateduitest.resources.testcases.website;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 클래스 - 찜하기 - 추가 / 제거 - PLP에서 찜하기 추가/제거 확인 - 추가
 * 클래스 - 찜하기 - 찜한 클래스 섹션 - 찜한 클래스 유무 = T - 찜한 클래스 목록 확인
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 로그인한다
 */
public class SaveClass implements TestCase {

    @Override
    public TestCase proceed() {
        try {
            //실시간 인기 클래스 첫번째 아이템 찜하기
            Thread.sleep(2000);
            Home.Elements.trendingNowSectionTitle().shouldBe(Condition.visible).scrollIntoView(true);
            Home.Elements.firstSaveButtonOnTrendingNow().shouldBe(Condition.enabled).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public void validate() {
        //찜하기 섹션 생성 확인
        Home.Elements.savedClassesSectionTitle().shouldBe(Condition.visible);
    }
}
