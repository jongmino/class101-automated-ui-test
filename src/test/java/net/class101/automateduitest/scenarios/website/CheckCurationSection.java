package net.class101.automateduitest.scenarios.website;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.pages.plus.ProductDetailPage;
import net.class101.automateduitest.scenarios.TestScenario;

/**
 * 구독 메인 - 클래스 섹션 - 큐레이션 컬렉션 - 상세 페이지 진입
 * 구독 메인 - 클래스 섹션 - 큐레이션 컬렉션 - 섹션 노출 확인
 * 클래스 - PDP - 페이지 진입 - 클래스 상세 페이지 진입
 * 클래스 - PDP - 페이지 진입 - 클래스 정보 확인
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 로그인한다
 */
public class CheckCurationSection implements TestScenario {

    @Override
    public TestScenario proceed() {
        Home.Elements.firstCurationItem().click();
        return this;
    }

    @Override
    public void validate() {
        ProductDetailPage.Elements.classInfoTab().shouldBe(Condition.visible);
        ProductDetailPage.Elements.creatorInfoTab().shouldBe(Condition.visible);
    }
}
