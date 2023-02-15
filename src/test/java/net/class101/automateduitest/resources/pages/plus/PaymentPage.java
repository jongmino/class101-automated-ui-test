package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class PaymentPage {

    private static final By PAYMENT_PRICE = byXpath("//p[contains(.,',000원')]");

    private static final By SUBSRIPTION_START = byXpath("//span[text()='구독 시작하기']");

    public static SelenideElement subscriptionStart(){
        return $(SUBSRIPTION_START).shouldBe(Condition.visible);
    }

    public static SelenideElement paymentPrice() {
        return $(PAYMENT_PRICE).shouldBe(Condition.visible);
    }
}
