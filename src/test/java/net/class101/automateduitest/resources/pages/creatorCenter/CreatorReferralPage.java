package net.class101.automateduitest.resources.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class CreatorReferralPage {

    private static final By CREATOR_REFERRAL_PAGE_TITLE = byXpath("//*[text()='다양한 채널에 클래스 알리기']");

    public static SelenideElement creatorReferralPageTitle() {
        return $(CREATOR_REFERRAL_PAGE_TITLE).shouldBe(Condition.visible);
    }
}
