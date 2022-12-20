package net.class101.automateduitest.resources.actions.creator;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.common.Utils;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorAddProductPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorNewClassPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 크리에이터 센터 - 상품 - 정규 클래스 - 정규 클래스 '만들기' 버튼 클릭
 *
 * Prerequisite:
 * 1) 크리에이터 홈을 연다
 * 2) 크리에이터 신규 계정으로 로그인한다
 */
public class CheckAddClass implements TestAction {

    @Override
    public TestAction execute() {
        CreatorProductPage.Elements.createProductButton().shouldNotBe(Condition.disabled).click();
        CreatorAddProductPage.Elements.createClassButton().shouldBe(Condition.visible).click();
        CreatorNewClassPage.Elements.classAndKitTab().shouldBe(Condition.visible);

        return this;
    }

    @Override
    public void validate() {
        assertTrue(Utils.urlContains("klass"));
    }
}