package net.class101.automateduitest.testcases.creator;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.actions.creator.LoginAsCreatorHasClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EmailLogin {

    @BeforeAll
    static void beforeAll() {
        CreatorHome.Actions.openPage();
    }

    @Test
    void loginAsCreatorHasClass() {
        SF.get(LoginAsCreatorHasClass.class).execute().validate();
    }
}
