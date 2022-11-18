package net.class101.automateduitest.scenarios.classmate;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckFAQTab implements TestScenario{

    private static CheckFAQTab instance = null;

    public static CheckFAQTab getInstance() {
        if(instance == null) {
            instance = new CheckFAQTab();
        }
        return instance;
    }

    @Override
    public TestScenario proceed() {

        MyPage.Actions.openPage();

        return this;
    }

    @Override
    public void validate() {

        //자주 묻는 질문 탭 확인
        MyPage.Elements.faqTab().shouldBe(Condition.visible);
    }
}
