package net.class101.automateduitest.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.common.PropertyLoader;
import org.openqa.selenium.By;

public class SelectPlanPage {

    public class Elements {

        private static final By SUBSCRIPTION_PLAN_TITLE = withText("구독 상품");
        private static final By NEXT_BUTTON = byXpath("//button[contains(.,'다음')]");
        private static final By SPAN_CONTAINS_FREE_TRIAL = byXpath("//span[contains(.,'무료 체험')]");

        public static SelenideElement subscribePlanTitle() {
            return $(SUBSCRIPTION_PLAN_TITLE);
        }

        public static SelenideElement nextButton() {
            return $(NEXT_BUTTON);
        }

        public static SelenideElement spanContainsFreeTrial() {
            return $(SPAN_CONTAINS_FREE_TRIAL);
        }
    }

    public class Actions {
        private static final String STAGING_SELECT_PLAN_PAGE_URL = PropertyLoader.getProperties().urls.get("selectPlanPage").staging;

        public static void openPage() {
            open(STAGING_SELECT_PLAN_PAGE_URL);
        }
    }
}
