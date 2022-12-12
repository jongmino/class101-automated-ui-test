package net.class101.automateduitest.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class PaymentPage {

    public class Elements {
        private static final By PAYMENT_PRICE = byXpath("//p[text()='199,000원']");

        public static SelenideElement paymentPrice() {
            return $(PAYMENT_PRICE);
        }
    }

    public class Actions {

    }
}