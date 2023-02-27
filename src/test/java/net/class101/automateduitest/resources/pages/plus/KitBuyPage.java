package net.class101.automateduitest.resources.pages.plus;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class KitBuyPage {

    private static final By SOLD_OUT_BUTTON = byXpath("//span[text()='품절']");

    private static final By COUPON_BUTTON = byXpath("//span[text()='최대 30,000원 쿠폰 받기']");

    private static final By COUPON_DOWNLOAD_BUTTON = byXpath("//span[text()='쿠폰 전체 다운받기']");

    private static final By COUPON_AllDOWNLOAD_BUTTON = byXpath("//span[text()='쿠폰 전체 다운완료']");


    public static SelenideElement soldOutButton() {
        return $(SOLD_OUT_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement couponButton() {
        return $(COUPON_BUTTON).shouldBe(Condition.visible);
    }


    public static SelenideElement couponDownloadButton() { return $(COUPON_DOWNLOAD_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement couponAllDownloadButton() { return $(COUPON_AllDOWNLOAD_BUTTON).shouldBe(Condition.visible);
    }
}
