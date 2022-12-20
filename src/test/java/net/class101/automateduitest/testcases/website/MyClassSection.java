package net.class101.automateduitest.testcases.website;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.actions.core.LoginAsSubscriber;
import net.class101.automateduitest.resources.actions.website.CheckMyClassSection;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MyClassSection {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
    }

    @Test
    void my_class_section_is_visible() {
        SF.get(LoginAsSubscriber.class).execute().validate();
        SF.get(CheckMyClassSection.class).execute().validate();
    }
}
