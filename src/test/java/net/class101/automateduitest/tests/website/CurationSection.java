package net.class101.automateduitest.tests.website;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.core.LoginAsNonSubscriber;
import net.class101.automateduitest.resources.testcases.website.CheckCurationSection;
import net.class101.automateduitest.resources.testcases.website.CheckSubscriptionPlan;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class CurationSection {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 20000;
        Home.Actions.openPage();
        SF.get(LoginAsNonSubscriber.class).proceed();
    }

    @Test
    void curation_section_is_visible() {
        SF.get(CheckCurationSection.class).proceed().validate();
        SF.get(CheckSubscriptionPlan.class).proceed().validate();
    }
}
