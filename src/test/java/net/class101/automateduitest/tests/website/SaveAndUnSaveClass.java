package net.class101.automateduitest.tests.website;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.core.LoginAsNonSubscriber;
import net.class101.automateduitest.resources.testcases.website.SaveClass;
import net.class101.automateduitest.resources.testcases.website.UnSaveClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class SaveAndUnSaveClass {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
        Configuration.timeout = 20000;
    }

    @Test
    @Order(1)
    void verifySaveAndUnSaveClass() throws InterruptedException {
        SF.get(LoginAsNonSubscriber.class).proceed().validate();
        SF.get(SaveClass.class).proceed().validate();
        SF.get(UnSaveClass.class).proceed().validate();
    }
}
