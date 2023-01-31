package net.class101.automateduitest.resources.testcases.creator;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorAddDigitalProductPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorAddProductPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * @설명: 크리에이터 센터에서 디지털파일 만들기 페이지로 정상 진입이 가능한지 테스트한다
 * @분류: 크리에이터 센터 - 상품 - 스토어 상품 - 디지털파일 '만들기' 버튼 클릭
 * @테스트_선행조건: 1) 크리에이터 홈을 연다 2) 크리에이터 신규 계정으로 로그인한다
 */
public class CheckAddDigitalFile implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorProductPage.createProductButton().shouldNotBe(Condition.disabled).click();
        CreatorAddProductPage.createDigitalFileButton().click();
        CreatorAddDigitalProductPage.pageTitle();

        return this;
    }

    @Override
    public void validate() {
        assertTrue(Utils.urlContains("DigitalFile"));
    }
}
