package net.class101.automateduitest.Behaviors;


import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.Pages.Plus.AllLoginPage;
import net.class101.automateduitest.Pages.Plus.FaceBookLoginPage;
import net.class101.automateduitest.Pages.Plus.Home;
import net.class101.automateduitest.Pages.Plus.LoginPage;
import net.class101.automateduitest.Pages.Plus.MyPage;
import net.class101.automateduitest.Pages.Plus.NaverLoginPage;

public final class Core {

    /**
     * 자체 로그인 검증 Non-Subscribed User
     */
    public static void loginWithNonSubscribedUser() {
        //유저 네비게이션 우상단 로그인 버튼 클릭
        Home.loginButton().click();
        //다른 방법으로 로그인 버튼 클릭
        LoginPage.allLoginButton().click();
        AllLoginPage.loginWithNonSubscribedUser();
        //유저 네비게이션 우상단 프로필 이미지로 로그인 성공 확인
        Home.userProfileImg().shouldBe(Condition.visible).hover();
    }

    /**
     * 자체 로그인 검증 Subscribed User
     */
    public static void loginWithSubscribedUser() {
        Home.loginButton().click();
        LoginPage.allLoginButton().click();
        AllLoginPage.loginWithSubscribedUser();
        Home.userProfileImg().shouldBe(Condition.visible).hover();
    }

    /**
     * 페이스북 로그인 검증
     */
    public static void loginWithFaceBook() {
        Home.loginButton().click();
        LoginPage.allLoginButton().click();
        AllLoginPage.loginWithFaceBookButton().click();
        FaceBookLoginPage.defaultLogin();
        Home.userProfileImg().shouldBe(Condition.visible).hover();
    }

    /**
     * 네이버 로그인 검증
     * 네이버 로그인은 오토메이션을 잡아내기 때문에 클립보드를 이용하는 방법으로 우회
     */
    public static void loginWithNaver() throws InterruptedException {
        Home.loginButton().click();
        LoginPage.allLoginButton().click();
        AllLoginPage.loginWithNaverButton().click();
        NaverLoginPage.defaultLogin();
        Home.userProfileImg().shouldBe(Condition.visible).hover();
    }

    /**
     * Login Needed
     * 로그아웃 검증
     */
    public static void logout() {
        //우상단 유저 프로필 클릭
        Home.userProfileImg().click();
        //마이페이지 로그아웃 버튼 클릭
        MyPage.logoutButton().click();

        //인기 클래스 섹션 확인으로 정상 로그아웃 및 홈으로 이동 확인
        // - 정상 로그아웃 됐으나 이미지 프로필 컴포넌트가 업데이트 안되는 경우가 있어서 해당 방법으로 우회
        Home.trendingNowSectionTitle().shouldBe(Condition.visible);
    }

}
