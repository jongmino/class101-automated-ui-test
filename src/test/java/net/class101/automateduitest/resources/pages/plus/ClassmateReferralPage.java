package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class ClassmateReferralPage {
    private static final By COPY_REFERRAL_LINK_BUTTON = byXpath("//span[text()='초대 링크 복사']");

    public static SelenideElement copyReferralLinkButton() {
        return $(COPY_REFERRAL_LINK_BUTTON);
    }
}
