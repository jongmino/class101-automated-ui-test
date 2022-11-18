package net.class101.automateduitest.testSuites.core;

import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.core.LoginWithFacebook;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class FaceBookLogin {

    @BeforeAll
    void setUp() {
        Home.Actions.openPage();
    }

    @Test
    @Order(1)
    void login_with_facebook() {
        LoginWithFacebook.getInstance().proceed().validate();
    }

}