package net.class101.automateduitest.scenarios.creator;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.creatorCenter.CreatorGuideCenterPage;
import net.class101.automateduitest.pages.creatorCenter.CreatorLeftNavigation;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckCreatorGuideTab implements TestScenario {

    @Override
    public TestScenario proceed() {
        CreatorLeftNavigation.Elements.creatorGuideTab().shouldBe(Condition.enabled).click();
        return this;
    }

    @Override
    public void validate() {
        CreatorGuideCenterPage.Elements.creatorGuideCenterTitle().shouldBe(Condition.visible);
    }
}
