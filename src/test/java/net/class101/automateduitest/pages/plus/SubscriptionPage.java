package net.class101.automateduitest.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.common.PropertyLoader;
import org.openqa.selenium.By;

public class SubscriptionPage {

    public class Elements {
        private static final By REFUND_BUTTON = byXpath("//span[text()='이곳']");
        private static final By CANCEL_SUBSCRIPTION_BUTTON = byXpath("//*[text()='해지하기']");

        public static SelenideElement refundButton() {
            return $(REFUND_BUTTON);
        }

        public static SelenideElement cancelSubscriptionButton() {
            return $(CANCEL_SUBSCRIPTION_BUTTON);
        }
    }

    public class Actions {
        private static final String STAGING_SUBSCRIPTION_PAGE = PropertyLoader.getProperties().urls.get("subscriptionPage").staging;

        public static void openPage(){
            open(STAGING_SUBSCRIPTION_PAGE);
        }
    }

}
