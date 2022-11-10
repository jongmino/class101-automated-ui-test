package net.class101.automateduitest.Behaviors;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public final class Creator {
//    public static void creatorCenterCategory() throws InterruptedException {
//        List<By> categorySelectors = new ArrayList<>();
//        categorySelectors.add(Constants.FIRST_CATEGORY_SELECTOR);
//        categorySelectors.add(Constants.SECOND_CATEGORY_SELECTOR);
//        categorySelectors.add(Constants.THIRD_CATEGORY_SELECTOR);
//        categorySelectors.add(Constants.FOURTH_CATEGORY_SELECTOR);
//
//        $(Constants.CLASS101_EMAIL_INPUT_FIELD).sendKeys(Constants.CREATOR_USER_ID);
//        $(Constants.CLASS101_PASSWORD_INPUT_FIELD).sendKeys(Constants.CREATOR_PASSWORD);
//        $(Constants.LOGIN_PAGE_LOGIN_BUTTON).click();
//        Thread.sleep(5000);
//        $(Constants.CREATE_PRODUCT_BUTTON).should(Condition.enabled).click();
//        Thread.sleep(2000);
//        $(Constants.CREATE_CLASS_BUTTON).click();
//        $(Constants.CREATE_CLASS_PAGE_CATEGORY_SECTION).click();
//
//        for(By selectorXPath: categorySelectors) {
//            Thread.sleep(1000);
//            if($$(selectorXPath).size() > 0){
//                SelenideElement selector = $(selectorXPath);
//                int optionSize = selector.findAll("option").size();
//                selector.selectOption(new Random().nextInt(optionSize - 1));
//            }
//        }
//    }
}
