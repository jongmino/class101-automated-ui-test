package net.class101.automateduitest.tests.website;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.core.LoginAsSubscriber;
import net.class101.automateduitest.resources.testcases.website.CheckMyClassSection;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MyClassSection {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
    }

    @Test
    void my_class_section_is_visible() {
        SF.get(LoginAsSubscriber.class).proceed().validate();
        SF.get(CheckMyClassSection.class).proceed().validate();
    }
}
