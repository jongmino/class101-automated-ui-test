package net.class101.automateduitest.testSuites.creator;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.scenarios.creator.LoginAsCreatorHasClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EmailLogin {

    @BeforeAll
    static void beforeAll() {
        CreatorHome.Actions.openPage();
    }

    @Test
    void loginAsCreatorHasClass() {
        SF.getInstance(LoginAsCreatorHasClass.class).proceed().validate();
    }
}
