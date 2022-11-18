package net.class101.automateduitest.testSuites.website;

import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.core.LoginAsSubscriber;
import net.class101.automateduitest.scenarios.website.CheckMyClassSection;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MyClassSection {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
    }

    @Test
    void my_class_section_is_visible() {
        LoginAsSubscriber.getInstance().proceed().validate();
        CheckMyClassSection.getInstance().proceed().validate();
    }
}
