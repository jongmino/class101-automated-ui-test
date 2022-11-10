package net.class101.automateduitest.Pages.CreatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;

import org.openqa.selenium.By;

public class CreatorNewClassPage {
    private static final By CREATE_CLASS_PAGE_CATEGORY_SECTION = byXpath("//p[text()='카테고리']");
    private static final By FIRST_CATEGORY_SELECTOR = byXpath("(//form[contains(.,'분야를 선택해주세요')]//select)[1]");
    private static final By SECOND_CATEGORY_SELECTOR = byXpath("(//form[contains(.,'분야를 선택해주세요')]//select)[2]");
    private static final By THIRD_CATEGORY_SELECTOR = byXpath("(//form[contains(.,'분야를 선택해주세요')]//select)[3]");
    private static final By FOURTH_CATEGORY_SELECTOR = byXpath("(//form[contains(.,'분야를 선택해주세요')]//select)[4]");
}
