package net.class101.automateduitest.Platforms.Website;

import net.class101.automateduitest.Behaviors.Website;
import net.class101.automateduitest.Pages.Plus.Home;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HeaderSearchBar {

    @BeforeAll
    static void beforeAll() {
        Home.openPage();
    }

    @Test
    void search_panel_is_visible() throws InterruptedException {
        Website.searchKeyword();
    }
}
