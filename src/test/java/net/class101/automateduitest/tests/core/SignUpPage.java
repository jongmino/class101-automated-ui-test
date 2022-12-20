package net.class101.automateduitest.tests.core;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.core.CheckAppleLoginPage;
import net.class101.automateduitest.resources.testcases.core.CheckEmailSignUpPage;
import net.class101.automateduitest.resources.testcases.core.CheckFacebookLoginPage;
import net.class101.automateduitest.resources.testcases.core.CheckGoogleLoginPage;
import net.class101.automateduitest.resources.testcases.core.CheckKakaoLoginPage;
import net.class101.automateduitest.resources.testcases.core.CheckNaverLoginPage;
import net.class101.automateduitest.resources.testcases.core.CheckSignUpPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SignUpPage {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
    }

    @Test
    void signUpPage() {
        SF.get(CheckSignUpPage.class).proceed().validate();
    }

    @Test
    void emailSignUp() {
        SF.get(CheckEmailSignUpPage.class).proceed().validate();
    }

    @Test
    void thirdPartyPages() {
        SF.get(CheckAppleLoginPage.class).proceed().validate();
        SF.get(CheckFacebookLoginPage.class).proceed().validate();
        SF.get(CheckGoogleLoginPage.class).proceed().validate();
        SF.get(CheckKakaoLoginPage.class).proceed().validate();
        SF.get(CheckNaverLoginPage.class).proceed().validate();
    }
}
