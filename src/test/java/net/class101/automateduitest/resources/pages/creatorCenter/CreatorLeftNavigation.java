package net.class101.automateduitest.resources.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class CreatorLeftNavigation {

    private static final By NOTICE_TAB = byXpath("//span[text()='공지사항']");
    private static final By CLASS_TAB = byXpath("//span[text()='클래스']");
    private static final By CLASS_COMMENT_TAB = byXpath("//div[text()='클래스 댓글']");
    private static final By CLASS_NEWS_TAB = byXpath("//div[text()='클래스 소식']");
    private static final By REFERRAL_TAB = byXpath("//span[text()='클래스101+ 초대']");
    private static final By FILE_REQUEST_HISTORY_TAB = byXpath("//span[text()='파일 요청 내역']");
    private static final By ORDER_AND_SHIPPING_TAB = byXpath("//span[text()='주문 및 배송']");
    private static final By ORDER_AND_SHIPPING_SHOP_TAB = byXpath("//div[text()='[Created by] 샌디테스트1']");
    private static final By STOCK_TAB = byXpath("//span[text()='재고']");
    private static final By STOCK_ALL_TAB = byXpath("//div[text()='전체 재고']");
    private static final By CLASS_SETTLEMENT_TAB = byXpath("//span[text()='클래스 정산']");
    private static final By INDIVIDUAL_CLASS_SETTLEMENT_TAB = byXpath("//div[text()='샌디테스트1']");
    private static final By PLUS_CLASS_SETTLEMENT_TAB = byXpath("//div[text()='클래스101+ 수익']");
    private static final By KIT_SETTLEMENT_TAB = byXpath("//span[text()='키트 정산']");
    private static final By KIT_SETTLEMENT_SUB_TAB = byXpath("//div[text()='[Created by] 샌디테스트1']");
    private static final By CREATOR_GUIDE_TAB = byXpath("//span[text()='크리에이터 가이드 센터']");

    public static SelenideElement classTab() {
        return $(CLASS_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement classCommentTab() {
        return $(CLASS_COMMENT_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement classNewsTab() {
        return $(CLASS_NEWS_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement referralTab() {
        return $(REFERRAL_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement fileRequestTab() {
        return $(FILE_REQUEST_HISTORY_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement orderAndShippingTab() {
        return $(ORDER_AND_SHIPPING_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement orderAndShippingShopTab() {
        return $(ORDER_AND_SHIPPING_SHOP_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement stockTab() {
        return $(STOCK_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement stockAllTab() {
        return $(STOCK_ALL_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement classSettlementTab() {
        return $(CLASS_SETTLEMENT_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement individualClassSettlementTab() {
        return $(INDIVIDUAL_CLASS_SETTLEMENT_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement plusClassSettlementTab() {
        return $(PLUS_CLASS_SETTLEMENT_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement kitSettlementTab() {
        return $(KIT_SETTLEMENT_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement kitSettlementSubTab() {
        return $(KIT_SETTLEMENT_SUB_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement creatorGuideTab() {
        return $(CREATOR_GUIDE_TAB).shouldBe(Condition.visible);
    }

    public static SelenideElement noticeTab() {
        return $(NOTICE_TAB).shouldBe(Condition.visible);
    }
}
