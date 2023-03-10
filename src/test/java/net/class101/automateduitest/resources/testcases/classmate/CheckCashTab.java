package net.class101.automateduitest.resources.testcases.classmate;

import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * @설명: 홈에서 우상단 프로필 사진을 클릭했을 때 캐시탭이 정상 노출되는지 확인한다
 * @분류: 마이페이지 프로필 영역 - 프로필 영역 확인 - 내 정보 관리 페이지로 이동되고 보유 중인 캐시가 노출된다
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 로그인한다
 */
public class CheckCashTab implements TestCase {

    @Override
    public TestCase proceed() {
        //유저 네비게이션 프로필 이미지 클릭
        Home.Actions.openPage();
        Home.userProfileImg().click();
        return this;
    }

    @Override
    public void validate() {
        //캐시탭 확인
        assertTrue(MyPage.cashTab().exists());
    }
}
