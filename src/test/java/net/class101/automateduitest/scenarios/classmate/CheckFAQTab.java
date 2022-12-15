package net.class101.automateduitest.scenarios.classmate;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.common.Utils;
import net.class101.automateduitest.pages.plus.MyPage;
import net.class101.automateduitest.scenarios.TestScenario;

public class CheckFAQTab implements TestScenario {

    @Override
    public TestScenario proceed() {
        MyPage.Actions.openPage();
        MyPage.Elements.faqTab().shouldBe(Condition.visible).click();
        Selenide.switchTo().window(1);
        return this;
    }

    @Override
    public void validate() {
        //자주 묻는 질문 탭 확인
        assertTrue(Utils.urlContains("class101faq"));
        Selenide.closeWindow();
        Selenide.switchTo().window(0);
    }
}
