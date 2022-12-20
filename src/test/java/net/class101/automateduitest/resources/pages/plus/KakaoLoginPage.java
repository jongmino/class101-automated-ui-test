package net.class101.automateduitest.resources.pages.plus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class KakaoLoginPage {

    public class Elements {
        private static final By KAKAO_LOGO = byXpath("//span[text()='Kakao']");

        public static SelenideElement kakaoLogo() {
            return $(KAKAO_LOGO);
        }
    }
}
