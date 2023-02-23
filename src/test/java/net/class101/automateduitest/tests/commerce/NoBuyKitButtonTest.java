package net.class101.automateduitest.tests.commerce;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.testcases.commerce.CheckNoBuyKitButton;
import net.class101.automateduitest.resources.testcases.core.LoginAsNonSubscriber;
import net.class101.automateduitest.resources.testcases.core.Logout;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NoBuyKitButtonTest {

    @BeforeAll
    static void beforeAll() {
        Utils.setTestConfig();
        SF.get(LoginAsNonSubscriber.class).proceed();
    }

    @AfterAll
    static void AfterAll() {SF.get(Logout.class).proceed();}

    @Test
    void NoBuyKitButtonTest() {SF.get(CheckNoBuyKitButton.class).proceed().validate(); }
}
