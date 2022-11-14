package net.class101.automateduitest.Behaviors;

import static net.class101.automateduitest.Common.Utils.urlContains;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.Pages.Plus.Home;
import net.class101.automateduitest.Pages.Plus.LecturePage;
import net.class101.automateduitest.Pages.Plus.MyPage;
import net.class101.automateduitest.Pages.Plus.ProductDetailPage;

public final class Classmate {
    public static void checkCashTab() {
        //유저 네비게이션 프로필 이미지 클릭
        Home.userProfileImg().click();
        //캐시탭 확인
        MyPage.cashTab().shouldBe(Condition.visible);
    }

    public static void checkSubscriptionStatusWithNonSubscribed() {
        //유저 네비게이션 프로필 이미지 클릭
        Home.userProfileImg().click();
        //캐시탭 확인
        MyPage.subscriptionStatusFalse().shouldBe(Condition.visible);
    }


    public static void checkSubscriptionStatusWithSubscribed() {
        //유저 네비게이션 프로필 이미지 클릭
        Home.userProfileImg().click();
        //캐시탭 확인
        MyPage.subscriptionStatusTrue().shouldBe(Condition.visible);
    }
    public static void checkMyPageMenu() throws InterruptedException {
        //유저 네비게이션 프로필 이미지 클릭
        Home.userProfileImg().click();
        //주문 및 배송 탭 확인
        MyPage.orderTab().click();
        Thread.sleep(500);
        assertTrue(urlContains("orders"));
        //친구초대 탭 확인
        MyPage.referralTab().click();
        Thread.sleep(500);
        assertTrue(urlContains("classmate-referral"));
        //크리에이터 센터 탭 확인
        MyPage.creatorCenterTab().click();
        Thread.sleep(500);
        assertTrue(urlContains("creator.class101.net"));
        //마이페이지로
        MyPage.openPage();
        //자주 묻는 질문 탭 확인
        MyPage.faqTab().shouldBe(Condition.visible);
        //1:1 문의 탭 확인
        MyPage.enquiryTab().click();
        Thread.sleep(500);
        MyPage.channelTalkModal().shouldBe(Condition.visible);
        //설정 탭 확인
        MyPage.settingTab().click();
        Thread.sleep(500);
        assertTrue(urlContains("setting"));
    }

    public static void changeServiceRegion() throws InterruptedException {
        //유저 네비게이션 프로필 이미지 클릭
        Home.userProfileImg().click();
        //설정 탭 클릭
        MyPage.settingTab().click();
        //지역변경 버튼 클릭
        MyPage.serviceRegionSettingButton().click();
        //영어로 변경
        MyPage.serviceRegionUSButton().click();

        Thread.sleep(1000);
        assertTrue(urlContains("en"));

        //KR 마이페이지로
        MyPage.openPage();
        //설정 탭 클릭
        MyPage.settingTab().click();
        //지역변경 버튼 클릭
        MyPage.serviceRegionSettingButton().click();
        //일본어로 변경
        MyPage.serviceRegionJPButton().click();

        Thread.sleep(1000);
        assertTrue(urlContains("ja"));

    }

    // 수강 페이지 영상 재생 확인
    public static void playClass() {
        Home.firstCurationItem().click();
        ProductDetailPage.playLectureButton().click();
        LecturePage.videoElementPlaying().shouldBe(Condition.visible);
    }


    public static void checkVideoPlayerFunctionality() throws InterruptedException {

        Home.firstCurationItem().click();
        ProductDetailPage.playLectureButton().click();
        LecturePage.videoElementPlaying().hover();
        LecturePage.playSpeedButton().shouldBe(Condition.visible);

        //재생 속도 변경 확인
        String playSpeedSvgPathBefore = LecturePage.getPlaySpeedSVGPathValue();
        Thread.sleep(1000);
        LecturePage.playSpeedButton().click();
        String playSpeedSvgPathAfter = LecturePage.getPlaySpeedSVGPathValue();
        assertNotEquals(playSpeedSvgPathBefore, playSpeedSvgPathAfter);

        //화질 변경 확인
        LecturePage.settingButton().shouldBe(Condition.visible).click();
        LecturePage.videoQualitySettingButton().click();
        String qualityOptionValue = LecturePage.firstUnCheckedRadioButton().find("input").getValue();
        LecturePage.firstUnCheckedRadioButton().click();
        LecturePage.settingButton().click();
        Thread.sleep(1000);
        String currentQuality  = LecturePage.currentVideoQualityText();
        assertTrue(currentQuality.contains(qualityOptionValue));

        //자동 재생 옵션 변경 확인
        LecturePage.autoPlaySettingButton().click();
        String autoPlayOptionText = LecturePage.unCheckedAutoPlayOptionText();
        LecturePage.firstUnCheckedRadioButton().click();
        LecturePage.settingButton().click();
        Thread.sleep(1000);
        String currentAutoPlayOption = LecturePage.currentAutoPlayText();
        assertTrue(currentAutoPlayOption.contains(autoPlayOptionText));
    }
}
