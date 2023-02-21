package net.class101.automateduitest.tests.core;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.testcases.core.LoginAsCommon;
import net.class101.automateduitest.resources.testcases.core.Logout;
import net.class101.automateduitest.resources.testcases.core.MypageNicknameChange;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NicknameChangeTest {

    @BeforeAll
    static void beforeAll() {
        Utils.setTestConfig();
        SF.get(LoginAsCommon.class).proceed();
    }

    @AfterAll
    static void afterAll() {
        SF.get(Logout.class).proceed();
    }

    @Test
    void testRandomNickname() {
        SF.get(MypageNicknameChange.class).proceed().validate();
    }
}
