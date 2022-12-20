package net.class101.automateduitest.resources.actions.website;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.ProductListPage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 구독 메인 - 헤더 - 검색 - 검색창 클릭
 * 클래스 - PLP - 검색결과 - 검색된 클래스 목록 확인
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 로그인한다
 */
public class SearchKeyword implements TestAction {

    @Override
    public TestAction execute() {
        //검색창 클릭
        Home.Elements.searchBar().click();
        //검색 패널 확인
        Home.Elements.searchPanelTitle().shouldBe(Condition.visible);
        //검색 키워드 입력
        Home.Elements.searchBarInput().sendKeys("공예");
        //검색
        Home.Elements.searchBarInput().pressEnter();

        return this;
    }

    @Override
    public void validate() {
        //검색 결과 확인
        ProductListPage.Elements.craftsCategoryTab().shouldBe(Condition.visible);
    }
}
