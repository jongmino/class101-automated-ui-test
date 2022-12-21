package net.class101.automateduitest.resources.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class CreatorAddProductPage {

    private static final By CREATE_CLASS_BUTTON = byXpath("(//span[text()='만들기'])[1]");
    private static final By CREATE_DIGITAL_FILE_BUTTON = byXpath("(//span[text()='만들기'])[2]");
    private static final By CREATE_E_BOOK_BUTTON = byXpath("(//span[text()='만들기'])[3]");

    public static SelenideElement createClassButton() {
        return $(CREATE_CLASS_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement createDigitalFileButton() {
        return $(CREATE_DIGITAL_FILE_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement createEBookButton() {
        return $(CREATE_E_BOOK_BUTTON).shouldBe(Condition.visible);
    }
}
