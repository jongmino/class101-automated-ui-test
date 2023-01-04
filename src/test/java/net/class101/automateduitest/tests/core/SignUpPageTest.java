package net.class101.automateduitest.tests.core;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.common.Utils;
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
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class SignUpPageTest {

    @BeforeAll
    static void beforeAll() {
        Utils.setTestConfig();
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
    void testAppleLoginPage() {
        SF.get(CheckAppleLoginPage.class).proceed().validate();
    }

    @Test
    void testFacebookLoginPage() {
        SF.get(CheckFacebookLoginPage.class).proceed().validate();
    }

    @Test
    void testGoogleLoginPage() {
        SF.get(CheckGoogleLoginPage.class).proceed().validate();
    }

    @Test
    void testKakaoLoginPage() {
        SF.get(CheckKakaoLoginPage.class).proceed().validate();
    }

    @Test
    void testNaverLoginPage() {
        SF.get(CheckNaverLoginPage.class).proceed().validate();
    }

}
