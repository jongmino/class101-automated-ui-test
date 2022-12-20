package net.class101.automateduitest.resources.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class CreatorOrderAndShippingPage {

    public class Elements {

        private static final By ORDER_AND_SHIPPING_TITLE = byXpath("//h3[text()='배송·반품 관리']");
        private static final By PAYMENT_COMPLETED_TAB = byXpath("//div[div[div[p[text()='결제 완료']]]]//button");
        private static final By PAYMENT_COMPLETED_TITLE = byXpath("//h4[text()='결제 완료']");

        public static SelenideElement paymentCompletedTab() {
            return $(PAYMENT_COMPLETED_TAB);
        }

        public static SelenideElement paymentCompletedTitle() {
            return $(PAYMENT_COMPLETED_TITLE);
        }

        public static SelenideElement orderAndShippingTitle() {
            return $(ORDER_AND_SHIPPING_TITLE);
        }
    }
}
