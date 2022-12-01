package net.class101.automateduitest.scenarios.commerce;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.common.Utils;
import net.class101.automateduitest.pages.plus.ProductDetailPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckKitPurchase implements TestScenario {

    private static CheckKitPurchase instance;

    public static CheckKitPurchase getInstance() {
        if(instance == null){
            instance = new CheckKitPurchase();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {
        ProductDetailPage.Actions.openKitPage();
        ProductDetailPage.Elements.buyKitButton().shouldBe(Condition.visible).click();
        Selenide.switchTo().window(1);
        return this;
    }

    @Override
    public void validate() {
        assertTrue(Utils.urlContains("kits"));
        Selenide.closeWindow();
        Selenide.switchTo().window(0);
    }
}
