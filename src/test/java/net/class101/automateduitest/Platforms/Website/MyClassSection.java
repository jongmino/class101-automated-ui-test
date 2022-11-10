package net.class101.automateduitest.Platforms.Website;

import net.class101.automateduitest.Behaviors.Core;
import net.class101.automateduitest.Behaviors.Website;
import net.class101.automateduitest.Pages.Plus.Home;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MyClassSection {

    @BeforeAll
    static void beforeAll() {
        Home.openPage();
    }

    @Test
    void my_class_section_is_visible() {
        Core.loginWithNonSubscribedUser();
        Website.verifyMyClassSection();
    }
}
