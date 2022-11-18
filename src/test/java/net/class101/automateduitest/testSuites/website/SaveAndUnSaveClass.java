package net.class101.automateduitest.testSuites.website;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.core.LoginAsNonSubscriber;
import net.class101.automateduitest.scenarios.website.SaveClass;
import net.class101.automateduitest.scenarios.website.UnSaveClass;
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
        LoginAsNonSubscriber.getInstance().proceed().validate();
        SaveClass.getInstance().proceed().validate();
        UnSaveClass.getInstance().proceed().validate();
    }

}
