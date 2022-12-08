package net.class101.automateduitest.testSuites.core;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.core.CheckAppleLoginPage;
import net.class101.automateduitest.scenarios.core.CheckEmailSignUpPage;
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
        SF.getInstance(CheckSignUpPage.class).proceed().validate();
    }

    @Test
    void emailSignUp() {
        SF.getInstance(CheckEmailSignUpPage.class).proceed().validate();
    }

    @Test
    void thirdPartyPages() {
        SF.getInstance(CheckAppleLoginPage.class).proceed().validate();
        SF.getInstance(CheckFacebookLoginPage.class).proceed().validate();
        SF.getInstance(CheckGoogleLoginPage.class).proceed().validate();
        SF.getInstance(CheckKakaoLoginPage.class).proceed().validate();
        SF.getInstance(CheckNaverLoginPage.class).proceed().validate();
    }
}
