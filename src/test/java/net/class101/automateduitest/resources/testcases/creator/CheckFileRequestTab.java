package net.class101.automateduitest.resources.testcases.creator;

import net.class101.automateduitest.resources.pages.creatorCenter.CreatorFileRequestPage;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.Assert.assertTrue;

/**
 * @설명: 크리에이터 센터에서 '파일 요청 내역' 메뉴 클릭시 해당 페이지로 정상적으로 이동되는지 테스트한다
 * @분류: 크리에이터 센터 - 파일 요청 내역 - 진입 - SNB > 파일 요청 내역 클릭
 * @테스트_선행조건:
 *  1) 크리에이터 홈으로 진입한다
 *  2) 로그인한다
 */
public class CheckFileRequestTab implements TestCase {

    @Override
    public TestCase proceed() {
        CreatorLeftNavigation.fileRequestTab().click();
        return this;
    }

    @Override
    public void validate() {
        assertTrue(CreatorFileRequestPage.fileRequestTitle().exists());
    }
}
