package net.class101.automateduitest.resources.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class CreatorReferralPage {

    public class Elements {

        private static final By REFERRAL_LINK_COPY_BUTTON = byXpath("//button//span[text()='초대 페이지 링크 복사하기']");

        public static SelenideElement referralLinkCopyButton() {
            return $(REFERRAL_LINK_COPY_BUTTON);
        }
    }
}
