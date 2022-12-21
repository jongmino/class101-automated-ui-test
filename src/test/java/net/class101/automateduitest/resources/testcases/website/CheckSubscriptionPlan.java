package net.class101.automateduitest.resources.testcases.website;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.ProductDetailPage;
import net.class101.automateduitest.resources.pages.plus.SelectPlanPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.Assert.assertTrue;

//TODO: 분리
/**
 * @설명:
 * @분류: 구독 메인 - 클래스 섹션 - 큐레이션 컬렉션 - 하단 CTA 버튼 [클래스 101+ 시작하기] 클릭 - 정기결제 구독 플랜 페이지로 이동한다
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 미구독 계정으로 로그인한다
 */
public class CheckSubscriptionPlan implements TestCase {

    @Override
    public TestCase proceed() {

        ProductDetailPage.startSubscriptionButton().shouldBe(Condition.enabled).click();
        return this;
    }

    @Override
    public void validate() {
        //플랜 선택 페이지 이동 확인
        assertTrue(SelectPlanPage.subscribePlanTitle().exists());
    }
}
