package net.class101.automateduitest.testSuites.website;

import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.website.SearchKeyword;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HeaderSearchBar {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
    }

    @Test
    void search_panel_is_visible() {
        SearchKeyword.getInstance().proceed().validate();
    }
}
