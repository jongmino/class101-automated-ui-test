package net.class101.automateduitest.scenarios.creator;

import net.class101.automateduitest.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class DeleteFirstProduct implements TestScenario {

    @Override
    public TestScenario proceed() {
        CreatorProductPage.Actions.deleteFirstProduct();
        return this;
    }

    @Override
    public void validate() {
    }
}
