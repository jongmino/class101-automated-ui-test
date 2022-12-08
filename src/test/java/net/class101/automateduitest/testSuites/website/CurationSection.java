package net.class101.automateduitest.testSuites.website;

import com.codeborne.selenide.Configuration;
import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.core.LoginAsNonSubscriber;
import net.class101.automateduitest.scenarios.website.CheckCurationSection;
import net.class101.automateduitest.scenarios.website.CheckSubscriptionPlan;
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
        SF.getInstance(LoginAsNonSubscriber.class).proceed().validate();
        SF.getInstance(CheckCurationSection.class).proceed().validate();
        SF.getInstance(CheckSubscriptionPlan.class).proceed().validate();
    }
}
