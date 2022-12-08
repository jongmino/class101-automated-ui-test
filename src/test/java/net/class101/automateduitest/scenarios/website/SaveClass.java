package net.class101.automateduitest.scenarios.website;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.TestScenario;

public class SaveClass implements TestScenario {

    @Override
    public TestScenario proceed() {
        try {
            //실시간 인기 클래스 첫번째 아이템 찜하기
            Thread.sleep(2000);
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
