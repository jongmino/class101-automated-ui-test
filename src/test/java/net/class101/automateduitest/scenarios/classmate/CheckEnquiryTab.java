package net.class101.automateduitest.scenarios.classmate;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckEnquiryTab implements TestScenario {

    @Override
    public TestScenario proceed() {
        try {
            MyPage.Actions.openPage();

            //1:1 문의 탭 확인
            MyPage.Elements.enquiryTab().click();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public void validate() {
        MyPage.Elements.channelTalkModal().shouldBe(Condition.visible);
    }
}
