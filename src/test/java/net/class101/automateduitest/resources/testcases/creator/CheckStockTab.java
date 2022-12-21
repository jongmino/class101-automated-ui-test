package net.class101.automateduitest.resources.testcases.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorStockPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.Assert.assertTrue;

/**
 * @설명: 크리에이터 센터 '재고'메뉴 아래 '전체 재고'메뉴 클릭시 전체 재고 목록이 정상적으로 노출된다.
 * @분류: 크리에이터 센터 - 재고 - 진입 - SNB > 재고 > 전체 재고 클릭
 * @테스트_선행조건:
 *  1) 크리에이터 홈으로 진입한다
 *  2) 클래스를 보유한 계정으로 로그인한다
 */
public class CheckStockTab implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorLeftNavigation.stockTab().shouldBe(Condition.enabled).click();
        CreatorLeftNavigation.stockAllTab().click();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(CreatorStockPage.stockTable().exists());
    }
}
