package net.class101.automateduitest.resources.testcases.commerce;

import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.resources.pages.plus.KitBuyPage;
import net.class101.automateduitest.resources.pages.plus.ProductDetailPage;
import net.class101.automateduitest.resources.testcases.TestCase;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckSoldOutButton implements TestCase {

    @Override
    public TestCase proceed() {
        ProductDetailPage.Actions.openSoldOutClassPage();
        ProductDetailPage.buyKitButton().click();
        Selenide.switchTo().window(1);

        return this;
    }


    @Override
    public void validate() {
        assertTrue(KitBuyPage.soldOutButton().exists());
        Selenide.closeWindow();
        Selenide.switchTo().window(0);
    }


}
