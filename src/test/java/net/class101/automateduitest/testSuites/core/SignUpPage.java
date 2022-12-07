package net.class101.automateduitest.testSuites.core;

import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.core.CheckAppleLoginPage;
import net.class101.automateduitest.scenarios.core.CheckFacebookLoginPage;
import net.class101.automateduitest.scenarios.core.CheckGoogleLoginPage;
import net.class101.automateduitest.scenarios.core.CheckKakaoLoginPage;
import net.class101.automateduitest.scenarios.core.CheckNaverLoginPage;
import net.class101.automateduitest.scenarios.core.CheckSignUpPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SignUpPage {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
    }

    @Test
    void signUpPage() {
        CheckSignUpPage.getInstance().proceed().validate();
    }

    @Test
    void thirdPartyPages() {
        CheckAppleLoginPage.getInstance().proceed().validate();
        CheckFacebookLoginPage.getInstance().proceed().validate();
        CheckGoogleLoginPage.getInstance().proceed().validate();
        CheckKakaoLoginPage.getInstance().proceed().validate();
        CheckNaverLoginPage.getInstance().proceed().validate();
    }
}
