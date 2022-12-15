package net.class101.automateduitest.scenarios.classmate;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckEnquiryTab implements TestScenario {

    @Override
    public TestScenario proceed() {
        MyPage.Actions.openPage();
        MyPage.Elements.enquiryTab().click();

        return this;
    }

    @Override
    public void validate() {
        MyPage.Elements.channelTalkModal().shouldBe(Condition.visible);
    }
}
