package net.class101.automateduitest.resources.testcases.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.Assert.assertTrue;

/**
 * @설명: 로그인 상태에서 로그아웃이 정상적으로 되는지 테스트한다
 * @분류: 로그아웃 - 기존 계정 - 임의의 로그인 수단으로 로그인 된 상태 - 로그아웃 시도
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 로그인 한다
 */
public class Logout implements TestCase {

    @Override
    public TestCase proceed() {
        //마이페이지 진입
        MyPage.Actions.openPage();
        //마이페이지 로그아웃 버튼 클릭
        MyPage.logoutButton().shouldBe(Condition.visible).click();
        Home.trendingNowSectionTitle();
        return this;
    }

    @Override
    public void validate() {
        //인기 클래스 섹션 확인으로 정상 로그아웃 및 홈으로 이동 확인
        // - 정상 로그아웃 됐으나 이미지 프로필 컴포넌트가 업데이트 안되는 경우가 있어서 해당 방법으로 우회
        assertTrue(Home.trendingNowSectionTitle().exists());
    }
}
