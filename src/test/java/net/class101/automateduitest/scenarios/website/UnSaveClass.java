package net.class101.automateduitest.scenarios.website;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.TestScenario;

public class UnSaveClass implements TestScenario {

    private static UnSaveClass instance = null;

    public static UnSaveClass getInstance() {
        if(instance == null) {
            instance = new UnSaveClass();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        try {
            Thread.sleep(2000);
            //실시간 인기 클래스 첫번째 아이템 찜하기 취소
            Home.Elements.firstSaveButtonOnTrendingNow().shouldBe(Condition.enabled).click();

        }catch (InterruptedException e){
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
