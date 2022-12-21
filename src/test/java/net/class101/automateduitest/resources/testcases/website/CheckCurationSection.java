package net.class101.automateduitest.resources.testcases.website;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.ProductDetailPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * @설명: 큐레이션 섹션의 클래스를 클릭했을 경우 클래스 상세페이지로 정상 진입 되는지 테스트한다
 * @분류:
 *  1) 구독 메인 - 클래스 섹션 - 큐레이션 컬렉션 - 상세 페이지 진입
 *  2) 구독 메인 - 클래스 섹션 - 큐레이션 컬렉션 - 섹션 노출 확인
 *  3) 클래스 - PDP - 페이지 진입 - 클래스 상세 페이지 진입
 *  4) 클래스 - PDP - 페이지 진입 - 클래스 정보 확인
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 로그인한다
 */
public class CheckCurationSection implements TestCase {

    @Override
    public TestCase proceed() {
        Home.firstCurationItem().click();
        return this;
    }

    @Override
    public void validate() {
        ProductDetailPage.classInfoTab().shouldBe(Condition.visible);
        ProductDetailPage.creatorInfoTab().shouldBe(Condition.visible);
    }
}