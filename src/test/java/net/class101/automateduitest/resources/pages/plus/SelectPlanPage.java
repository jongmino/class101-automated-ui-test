package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.resources.common.PropertyLoader;
import org.openqa.selenium.By;

public class SelectPlanPage {

    private static final By SUBSCRIPTION_PLAN_TITLE = withText("연간 구독");
    private static final By NEXT_BUTTON = byXpath("//button[contains(.,'다음')]");
    private static final By SPAN_CONTAINS_FREE_TRIAL = byXpath("//span[contains(.,'무료 체험')]");

    public static SelenideElement subscribePlanTitle() {
        return $(SUBSCRIPTION_PLAN_TITLE).shouldBe(Condition.visible);
    }

    public static SelenideElement nextButton() {
        return $(NEXT_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement spanContainsFreeTrial() {
        return $(SPAN_CONTAINS_FREE_TRIAL).shouldBe(Condition.visible);
    }

    public class Actions {
        public static void openPage() {
            final String selectPlanPage = PropertyLoader.getProperties().urls.get("selectPlanPage");
            open(selectPlanPage);
        }
    }
}
