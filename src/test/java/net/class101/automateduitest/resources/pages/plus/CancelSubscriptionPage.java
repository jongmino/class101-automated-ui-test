package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class CancelSubscriptionPage {

    public class Elements {

        private static final By CANCEL_BUTTON = withText("혜택 포기하기");

        public static SelenideElement cancelButton() {
            return $(CANCEL_BUTTON);
        }
    }
}
