package net.class101.automateduitest.resources.testcases.classmate;

import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * @설명: 구독 계정으로 로그인 했을 때 마이페이지에 구독 탭에서 계정 상태에 따른 구독 상태가 보여지는지 테스트한다
 * @분류: 마이페이지 - 구독 - 구독 상태 확인 - 계정 상태에 맞는 구독 상태가 표기된다 - 구독
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 구독 계정으로 로그인 한다
 */
public class CheckSubscriptionStatusTrue implements TestCase {

    @Override
    public TestCase proceed() {
        //유저 네비게이션 프로필 이미지 클릭
        MyPage.Actions.openPage();
        return this;
    }

    @Override
    public void validate() {
        //구독 탭 확인
        assertTrue(MyPage.subscriptionStatusTrue().exists());
    }
}
