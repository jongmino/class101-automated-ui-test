package net.class101.automateduitest.scenarios.creator;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.common.Utils;
import net.class101.automateduitest.pages.creatorCenter.CreatorAddProductPage;
import net.class101.automateduitest.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckAddDigitalFile implements TestScenario {

    private static CheckAddDigitalFile instance = null;

    public static CheckAddDigitalFile getInstance() {
        if (instance == null) {
            instance = new CheckAddDigitalFile();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        try{
            Thread.sleep(2000);
            CreatorProductPage.Elements.createProductButton().shouldNotBe(Condition.disabled).click();
            Thread.sleep(2000);
            CreatorAddProductPage.Elements.createDigitalFileButton().shouldBe(Condition.visible).click();
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public void validate() {
        System.out.println(Utils.getUrl());
        assertTrue(Utils.urlContains("DigitalFile"));
    }
}
