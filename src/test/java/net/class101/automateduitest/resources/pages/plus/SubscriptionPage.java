package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.resources.common.PropertyLoader;
import org.openqa.selenium.By;

public class SubscriptionPage {

    private static final By REFUND_BUTTON = byXpath("//span[text()='이곳']");
    private static final By CANCEL_SUBSCRIPTION_BUTTON = byXpath("//*[text()='해지하기']");
    private static final By SUBSCRIBE_BUTTON = byXpath("//span[text()='구독 시작하기']");

    public static SelenideElement refundButton() {
        return $(REFUND_BUTTON);
    }

    public static SelenideElement cancelSubscriptionButton() {
        return $(CANCEL_SUBSCRIPTION_BUTTON);
    }

    public static SelenideElement subscribeButton() {
        return $(SUBSCRIBE_BUTTON);
    }

    public class Actions {
        public static void openPage() {
            final String subscriptionPage = PropertyLoader.getProperties().urls.get("subscriptionPage").staging;
            open(subscriptionPage);
        }
    }
}
