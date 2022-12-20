package net.class101.automateduitest.testcases.core;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.actions.core.CheckAppleLoginPage;
import net.class101.automateduitest.resources.actions.core.CheckEmailSignUpPage;
import net.class101.automateduitest.resources.actions.core.CheckFacebookLoginPage;
import net.class101.automateduitest.resources.actions.core.CheckGoogleLoginPage;
import net.class101.automateduitest.resources.actions.core.CheckKakaoLoginPage;
import net.class101.automateduitest.resources.actions.core.CheckNaverLoginPage;
import net.class101.automateduitest.resources.actions.core.CheckSignUpPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SignUpPage {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
    }

    @Test
    void signUpPage() {
        SF.get(CheckSignUpPage.class).execute().validate();
    }

    @Test
    void emailSignUp() {
        SF.get(CheckEmailSignUpPage.class).execute().validate();
    }

    @Test
    void thirdPartyPages() {
        SF.get(CheckAppleLoginPage.class).execute().validate();
        SF.get(CheckFacebookLoginPage.class).execute().validate();
        SF.get(CheckGoogleLoginPage.class).execute().validate();
        SF.get(CheckKakaoLoginPage.class).execute().validate();
        SF.get(CheckNaverLoginPage.class).execute().validate();
    }
}
