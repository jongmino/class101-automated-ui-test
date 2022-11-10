package net.class101.automateduitest.Platforms.Website;

import net.class101.automateduitest.Behaviors.Website;
import net.class101.automateduitest.Pages.Plus.Home;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class CurationSection {

    @BeforeAll
    static void beforeAll() {
        Home.openPage();
    }

    @Test
    void curation_section_is_visible() throws InterruptedException {
        Website.verifyCurationSectionAndClassInfo();
    }
}
