package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.resources.common.PropertyLoader;
import org.openqa.selenium.By;

public class OrderPage {

    private static final By ORDER_VIEW_DETAIL_BUTTON = byXpath("//span[text()='자세히 보기']");
    private static final By ORDER_HISTORY_TITLE = byXpath("//h3[text()='주문 및 배송']");
    private static final By SHIPPING_INFO_BUTTON = byXpath("//span[text()='배송 안내']");
    private static final By REFUNDABLE_ORDER_DETAIL_BUTTON = byXpath("//div[div[div[div[p[text()='결제 성공']]]]]//span[text()='자세히 보기']");

    public static SelenideElement orderViewDetailButton() {
        return $(ORDER_VIEW_DETAIL_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement orderHistoryTitle() {
        return $(ORDER_HISTORY_TITLE).shouldBe(Condition.visible);
    }

    public static SelenideElement shippingInfoButton() {
        return $(SHIPPING_INFO_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement refundableOrderDetailButton() {
        return $(REFUNDABLE_ORDER_DETAIL_BUTTON).shouldBe(Condition.visible);
    }

    public class Actions {
        public static void openPage(){
            final String plusOrderPage = PropertyLoader.getProperties().urls.get("plusOrderPage");
            open(plusOrderPage);
        }
    }
}
