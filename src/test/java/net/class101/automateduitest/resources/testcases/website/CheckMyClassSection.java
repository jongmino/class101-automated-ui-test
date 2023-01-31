package net.class101.automateduitest.resources.testcases.website;

import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명: 클래스를 수강한 이력이 있을 시 홈페이지에 '내 클래스' 섹션이 정상 노출 되는지 테스트한다
 * @분류: 구독 메인 - 클래스 섹션 - 내 클래스 섹션 - 클래스 수강여부 = T - 섹션 노출 확인
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 클래스 수강이력이 있는 구독 계정으로 로그인한다.
 */
public class CheckMyClassSection implements TestCase {

    @Override
    public TestCase proceed() {
        Home.Actions.openPage();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(Home.myClassSectionTitle().exists());
    }
}
