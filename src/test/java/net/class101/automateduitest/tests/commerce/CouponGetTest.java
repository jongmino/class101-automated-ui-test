package net.class101.automateduitest.tests.commerce;


import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.testcases.commerce.CheckCouponGet;
import net.class101.automateduitest.resources.testcases.core.LoginAsCommon;
import net.class101.automateduitest.resources.testcases.core.Logout;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class CouponGetTest {

    @BeforeAll
    static void beforeAll() {
        SF.get(LoginAsCommon.class).proceed().validate();
        Utils.sleep(2000);
    }
    @AfterAll
    static void afterAll() {
        SF.get(Logout.class).proceed();
    }

    @Test
    void testCouponGet() { SF.get(CheckCouponGet.class).proceed().validate();}

}
