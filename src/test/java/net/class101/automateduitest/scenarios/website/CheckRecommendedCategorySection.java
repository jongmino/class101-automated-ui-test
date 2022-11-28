package net.class101.automateduitest.scenarios.website;

import static net.class101.automateduitest.common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckRecommendedCategorySection implements TestScenario {

    private static CheckRecommendedCategorySection instance = null;

    public static CheckRecommendedCategorySection getInstance() {
        if(instance == null) {
            instance = new CheckRecommendedCategorySection();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        try {
            //추천 카테고리 섹션 확인
            Home.Elements.recommendedCategorySectionTitle().shouldBe(Condition.visible);
            //영어 카테고리 클릭
            Home.Elements.englishCategoryButton().shouldBe(Condition.enabled).click();
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        return this;
    }

    @Override
    public void validate() {
        //카테고리 페이지로 이동 확인
        assertTrue(urlContains("categories"));
    }
}
