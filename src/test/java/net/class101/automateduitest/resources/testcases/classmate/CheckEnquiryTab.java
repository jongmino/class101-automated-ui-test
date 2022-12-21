package net.class101.automateduitest.resources.testcases.classmate;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * @설명: 마이페이지에서 1:1문의 메뉴를 클릭했을 때 채널톡 모달이 정상적으로 뜨는지 테스트한다
 * @분류: 마이페이지 - 메뉴영역 - 각 메뉴 페이지 이동 확인 - 각 메뉴 별 페이지 랜딩 확인 - 1:1 문의 메뉴
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 로그인 한다
 */
public class CheckEnquiryTab implements TestCase {

    @Override
    public TestCase proceed() {
        MyPage.Actions.openPage();
        MyPage.enquiryTab().click();
        return this;
    }

    @Override
    public void validate() {
        MyPage.channelTalkModal().shouldBe(Condition.visible);
    }
}
