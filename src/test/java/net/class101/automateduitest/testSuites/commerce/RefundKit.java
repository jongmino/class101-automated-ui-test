package net.class101.automateduitest.testSuites.commerce;

import net.class101.automateduitest.common.SF;
import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.commerce.CheckRefundKit;
import net.class101.automateduitest.scenarios.core.LoginAsUserHasKit;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RefundKit {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 20000;
        Home.Actions.openPage();
        SF.get(LoginAsUserHasKit.class).proceed().validate();
    }

    @Test
    void refundKit() {
        SF.get(CheckRefundKit.class).proceed().validate();
    }
}
