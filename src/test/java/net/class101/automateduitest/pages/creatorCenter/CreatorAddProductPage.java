package net.class101.automateduitest.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class CreatorAddProductPage {

    public class Elements {
        private static final By CREATE_CLASS_BUTTON = byXpath("(//span[text()='만들기'])[1]");
        private static final By CREATE_DIGITAL_FILE_BUTTON = byXpath("(//span[text()='만들기'])[2]");
        private static final By CREATE_E_BOOK_BUTTON = byXpath("(//span[text()='만들기'])[3]");


        public static SelenideElement createClassButton() {
            return $(CREATE_CLASS_BUTTON);
        }

        public static SelenideElement createDigitalFileButton() {
            return $(CREATE_DIGITAL_FILE_BUTTON);
        }

        public static SelenideElement createEBookButton() {
            return $(CREATE_E_BOOK_BUTTON);
        }

    }

    public class Actions {
    }
}
