package net.class101.automateduitest.Platforms.Core;


import net.class101.automateduitest.Behaviors.Core;
import net.class101.automateduitest.Pages.Plus.Home;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class NaverLogin {

    @BeforeAll
    void setUp() {
        Home.openPage();
    }

    @Test
    @Order(1)
    void login_with_naver() throws InterruptedException {
        Core.loginWithNaver();
    }
}
