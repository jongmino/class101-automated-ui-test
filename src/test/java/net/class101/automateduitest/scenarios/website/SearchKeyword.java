package net.class101.automateduitest.scenarios.website;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.pages.plus.ProductListPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class SearchKeyword implements TestScenario {

    @Override
    public TestScenario proceed() {
        try {

            //검색창 클릭
            Home.Elements.searchBar().click();
            //검색 패널 확인
            Home.Elements.searchPanelTitle().shouldBe(Condition.visible);
            //검색 키워드 입력
            Home.Elements.searchBarInput().sendKeys("공예");
            //검색
            Home.Elements.searchBarInput().pressEnter();
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public void validate() {
        //검색 결과 확인
        ProductListPage.Elements.craftsCategoryTab().shouldBe(Condition.visible);
    }
}
