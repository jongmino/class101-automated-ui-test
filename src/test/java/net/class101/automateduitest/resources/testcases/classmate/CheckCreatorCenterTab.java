package net.class101.automateduitest.resources.testcases.classmate;

import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLoginPage;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명: 마이페이지에서 크리에이터 센터 탭을 클릭했을 때 페이지가 정상적으로 이동되는지 테스트한다
 * @분류: 마이페이지 - 메뉴영역 - 각 메뉴 페이지 이동 확인 - 각 메뉴 별 페이지 랜딩 확인 - 크리에이터 센터 메뉴
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 로그인 한다
 */
public class CheckCreatorCenterTab implements TestCase {

    @Override
    public TestCase proceed() {
        MyPage.Actions.openPage();
        MyPage.creatorCenterTab().click();
        CreatorLoginPage.emailInputElement();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(CreatorLoginPage.emailInputElement().exists());
    }
}
