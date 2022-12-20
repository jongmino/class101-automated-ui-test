package net.class101.automateduitest.resources.testcases.classmate;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.testcases.TestCase;

/**
 * 마이페이지 - 메뉴영역 - 각 메뉴 페이지 이동 확인 - 각 메뉴 별 페이지 랜딩 확인 - 자주 묻는 질문 메뉴
 *
 * Prerequisite:
 * 1) 홈페이지를 연다
 * 2) 로그인 한다
 */
public class CheckFAQTab implements TestCase {

    @Override
    public TestCase proceed() {
        MyPage.Actions.openPage();
        MyPage.faqTab().shouldBe(Condition.visible).click();
        Selenide.switchTo().window(1);
        return this;
    }

    @Override
    public void validate() {
        //자주 묻는 질문 탭 확인
        assertTrue(Utils.urlContains("class101faq"));
        Selenide.closeWindow();
        Selenide.switchTo().window(0);
    }
}
