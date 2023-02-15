package net.class101.automateduitest.tests.commerce;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.commerce.CheckMonthSubsription;
import net.class101.automateduitest.resources.testcases.core.LoginAsNonSubscriber;
import net.class101.automateduitest.resources.testcases.core.Logout;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class SubscribeMonthPlan {

    @BeforeAll
    static void beforeAll() {
        Utils.setTestConfig();
        SF.get(LoginAsNonSubscriber.class).proceed();
    }

    @AfterAll
    static void afterAll() {
        SF.get(Logout.class).proceed();
    }

    @Test
    void testMonthPlan() {
        SF.get(CheckMonthSubsription.class).proceed().validate();

    }
}
