package net.class101.automateduitest.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import org.openqa.selenium.By;

public class CreatorProductPage {
    private static final By CREATE_PRODUCT_BUTTON = byXpath("//a[@href='/center/products/add']");
}
