package net.class101.automateduitest.resources.testcases.website;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.TestCase;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @설명: 찜하기가 없는 상태에서 찜하기를 눌렀을 시 '찜한 클래스' 섹션이 정상 노출 되는지 테스트한다
 * @분류:
 *  1) 클래스 - 찜하기 - 추가 / 제거 - PLP에서 찜하기 추가/제거 확인 - 추가
 *  2) 클래스 - 찜하기 - 찜한 클래스 섹션 - 찜한 클래스 유무 = T - 찜한 클래스 목록 확인
 * @테스트_선행조건:
 *  1) 홈페이지를 연다
 *  2) 로그인한다
 */
public class SaveClass implements TestCase {

    @Override
    public TestCase proceed() {
        //실시간 인기 클래스 첫번째 아이템 찜하기
        Home.Actions.openPage();
        Utils.sleep(2000);
        Home.trendingNowSectionTitle().scrollIntoView(true);
        Home.firstSaveButtonOnTrendingNow().shouldBe(Condition.enabled).click();
        return this;
    }

    @Override
    public void validate() {
        //찜하기 섹션 생성 확인
        assertTrue(Home.savedClassesSectionTitle().exists());
    }
}
