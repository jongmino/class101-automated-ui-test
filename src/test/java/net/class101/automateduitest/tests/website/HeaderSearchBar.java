package net.class101.automateduitest.tests.website;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.testcases.website.SearchKeyword;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HeaderSearchBar {

    @BeforeAll
    static void beforeAll() {
        Home.Actions.openPage();
    }

    @Test
    void search_panel_is_visible() {
        SF.get(SearchKeyword.class).proceed().validate();
    }
}
