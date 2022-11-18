package net.class101.automateduitest.scenarios.website;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.Home;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckMyClassSection implements TestScenario {

    private static CheckMyClassSection instance = null;

    public static CheckMyClassSection getInstance() {
        if(instance == null) {
            instance = new CheckMyClassSection();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {

        Home.Actions.openPage();

        return this;
    }

    @Override
    public void validate() {

        Home.Elements.myClassSectionTitle().shouldBe(Condition.visible);
    }
}
