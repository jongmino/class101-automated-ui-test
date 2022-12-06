package net.class101.automateduitest.testSuites.core;

import net.class101.automateduitest.pages.plus.Home;
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
}
