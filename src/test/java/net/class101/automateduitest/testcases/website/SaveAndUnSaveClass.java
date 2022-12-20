package net.class101.automateduitest.testcases.website;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.actions.core.LoginAsNonSubscriber;
import net.class101.automateduitest.resources.actions.website.SaveClass;
import net.class101.automateduitest.resources.actions.website.UnSaveClass;
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
        SF.get(LoginAsNonSubscriber.class).execute().validate();
        SF.get(SaveClass.class).execute().validate();
        SF.get(UnSaveClass.class).execute().validate();
    }
}
