package net.class101.automateduitest.scenarios.creator;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.common.Utils;
import net.class101.automateduitest.pages.creatorCenter.CreatorAddDigitalProductPage;
import net.class101.automateduitest.pages.creatorCenter.CreatorAddProductPage;
import net.class101.automateduitest.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 * 크리에이터 센터 - 상품 - 스토어 상품 - 전자책 '만들기' 버튼 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈을 연다
 * 2) 크리에이터 신규 계정으로 로그인한다
 */
public class CheckAddDigitalFile implements TestScenario {

    @Override
    public TestScenario proceed() {
        CreatorProductPage.Elements.createProductButton().shouldNotBe(Condition.disabled).click();
        CreatorAddProductPage.Elements.createDigitalFileButton().shouldBe(Condition.visible).click();
        CreatorAddDigitalProductPage.Elements.pageTitle().shouldBe(Condition.visible);

        return this;
    }

    @Override
    public void validate() {
        assertTrue(Utils.urlContains("DigitalFile"));
    }
}
