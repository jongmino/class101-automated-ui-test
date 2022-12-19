package net.class101.automateduitest.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class OrderDetailPage {

    public class Elements {
        private static final By ORDER_DETAIL_PAGE_TITLE = byXpath("//h3[contains(.,'주문 상세')]");
        private static final By PAYMENT_INFO_SECTION = byXpath("//div[h5 and contains(.,'총 결제 금액')]");
        private static final By SHIPPING_INFO_SECTION = byXpath("//div[h4[text()='배송 정보']]");
        private static final By ORDERED_ITEM_INFO_SECTION = byXpath("//div[h4[text()='구매 물품']]");
        private static final By REFUND_BUTTON = byXpath("//button//span[text()='환불하기']");

        public static SelenideElement orderDetailPageTitle() {
            return $(ORDER_DETAIL_PAGE_TITLE);
        }

        public static SelenideElement paymentInfoSection() {
            return $(PAYMENT_INFO_SECTION);
        }

        public static SelenideElement shippingInfoSection() {
            return $(SHIPPING_INFO_SECTION);
        }

        public static SelenideElement orderedItemInfoSection() {
            return $(ORDERED_ITEM_INFO_SECTION);
        }

        public static SelenideElement refundButton() {
            return $(REFUND_BUTTON);
        }
    }
}
