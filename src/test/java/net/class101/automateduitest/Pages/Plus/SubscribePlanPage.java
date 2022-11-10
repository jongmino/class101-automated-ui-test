package net.class101.automateduitest.Pages.Plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public final class SubscribePlanPage {
    private static final By SUBSCRIPTION_PLAN_TITLE = withText("구독 상품");

    public static SelenideElement subscribePlanTitle() {
        return $(SUBSCRIPTION_PLAN_TITLE);
    }
}
