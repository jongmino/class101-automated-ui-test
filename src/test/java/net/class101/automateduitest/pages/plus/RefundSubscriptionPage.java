package net.class101.automateduitest.pages.plus;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class RefundSubscriptionPage {

    public class Elements {
        private static final By REFUND_PAGE_TITLE = withText("환불 정보를 확인해주세요");

        public static SelenideElement refundPageTitle() {
            return $(REFUND_PAGE_TITLE);
        }
    }

    public class Actions {

    }
}
