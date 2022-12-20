package net.class101.automateduitest.resources.testcases.creator;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorAddProductPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorNewClassPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 크리에이터 센터 - 상품 - 정규 클래스 - 정규 클래스 '만들기' 버튼 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈을 연다
 * 2) 크리에이터 신규 계정으로 로그인한다
 */
public class CheckAddClass implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorProductPage.createProductButton().shouldNotBe(Condition.disabled).click();
        CreatorAddProductPage.createClassButton().shouldBe(Condition.visible).click();
        CreatorNewClassPage.classAndKitTab().shouldBe(Condition.visible);
        return this;
    }

    @Override
    public void validate() {
        assertTrue(Utils.urlContains("klass"));
    }
}
