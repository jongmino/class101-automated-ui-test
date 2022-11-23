package net.class101.automateduitest.scenarios.creator;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.common.Utils;
import net.class101.automateduitest.pages.creatorCenter.CreatorAddProductPage;
import net.class101.automateduitest.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckAddEBook implements TestScenario {

    private static CheckAddEBook instance = null;

    public static CheckAddEBook getInstance() {
        if (instance == null) {
            instance = new CheckAddEBook();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        try{
            Thread.sleep(2000);
            CreatorProductPage.Elements.createProductButton().shouldNotBe(Condition.disabled).click();
            Thread.sleep(2000);
            CreatorAddProductPage.Elements.createEBookButton().shouldBe(Condition.visible).click();
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public void validate() {
        System.out.println(Utils.getUrl());
        assertTrue(Utils.urlContains("DigitalBook"));
    }
}
