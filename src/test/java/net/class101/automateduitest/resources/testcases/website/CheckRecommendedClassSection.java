package net.class101.automateduitest.resources.testcases.website;

import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.Assert.assertTrue;

/**
 * @설명: 로그인 유저의 홈화면에 취향 추천 클래스 섹션이 정상 노출 되는지 테스트한다
 * @분류: 구독 메인 - 클래스 섹션 - 취향 추천 클래스 - 섹션 노출 확인
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 로그인한다
 */
public class CheckRecommendedClassSection implements TestCase {

    @Override
    public TestCase proceed() {
        Home.Actions.openPage();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(Home.recommendedClassSectionTitle().exists());
    }
}
