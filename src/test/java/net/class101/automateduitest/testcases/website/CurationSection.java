package net.class101.automateduitest.testcases.website;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.actions.core.LoginAsNonSubscriber;
import net.class101.automateduitest.resources.actions.website.CheckCurationSection;
import net.class101.automateduitest.resources.actions.website.CheckSubscriptionPlan;
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
    }

    @Test
    void curation_section_is_visible() {
        SF.get(LoginAsNonSubscriber.class).execute().validate();
        SF.get(CheckCurationSection.class).execute().validate();
        SF.get(CheckSubscriptionPlan.class).execute().validate();
    }
}
