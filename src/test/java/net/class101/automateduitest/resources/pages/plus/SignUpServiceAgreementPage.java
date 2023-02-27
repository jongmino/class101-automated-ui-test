package net.class101.automateduitest.resources.pages.plus;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SignUpServiceAgreementPage {

    // 약관동의 페이지 체크박스 - class,xmlns 로만 구성되어있어 현재 풀xpath값으로 만 설정하여 엘리먼트값 호출
    private static final By CHECKBOX_ALL_SELECT_BUTTON = byXpath(("/html/body/div[1]/main/div/div[6]/div[2]/div[2]/div/div[1]/div/div[3]/div[1]/span"));

    private static final By CHECKBOX_REQUIRE_1_SELECT_BUTTON = byXpath(("/html/body/div[1]/main/div/div[6]/div[2]/div[2]/div/div[1]/div/div[3]/div[4]/div[1]/div[1]/div[1]/span"));

    private  static final  By CHECKBOX_REQUIRE_2_SELECT_BUTTON = byXpath(("/html/body/div[1]/main/div/div[6]/div[2]/div[2]/div/div[1]/div/div[3]/div[4]/div[3]/div[1]/div[1]/span"));

    private static final By CHECKBOX_REQUIRE_3_SELECT_BUTTON = byXpath(("/html/body/div[1]/main/div/div[6]/div[2]/div[2]/div/div[1]/div/div[3]/div[4]/div[5]/div[1]/div[1]/span"));

    private static final By CHECKBOX__OPTIONAL_1_SELECT_BUTTON = byXpath(("/html/body/div[1]/main/div/div[6]/div[2]/div[2]/div/div[1]/div/div[3]/div[4]/div[7]/div[1]/div[1]/span"));

    private static final By NEXT_BUTTON = byXpath("//button[contains(.,'다음')]");
    public static SelenideElement checkboxAllSelectButton() {
        return $(CHECKBOX_ALL_SELECT_BUTTON).shouldBe(Condition.visible);
    }
    public static SelenideElement checkboxRequire1SelectButton() {
        return $(CHECKBOX_REQUIRE_1_SELECT_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement checkboxRequire2SelectButton() {
        return $(CHECKBOX_REQUIRE_2_SELECT_BUTTON).shouldBe(Condition.visible);
    }

    public static SelenideElement checkboxRequire3SelectButton() {
        return $(CHECKBOX_REQUIRE_3_SELECT_BUTTON).shouldBe(Condition.visible);
    }
    public static SelenideElement checkboxOptional1SelectButton() {
        return $(CHECKBOX__OPTIONAL_1_SELECT_BUTTON).shouldBe(Condition.visible);
    }
    public static SelenideElement nextButton() {
        return $(NEXT_BUTTON).shouldBe(Condition.visible);
    }
}
