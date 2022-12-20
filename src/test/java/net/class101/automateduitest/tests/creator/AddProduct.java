package net.class101.automateduitest.tests.creator;

import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.resources.testcases.creator.CheckAddClass;
import net.class101.automateduitest.resources.testcases.creator.CheckAddDigitalFile;
import net.class101.automateduitest.resources.testcases.creator.CheckAddEBook;
import net.class101.automateduitest.resources.testcases.creator.CheckRequestClassReview;
import net.class101.automateduitest.resources.testcases.creator.DeleteFirstProduct;
import net.class101.automateduitest.resources.testcases.creator.LoginAsCreatorNew;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddProduct {

    @BeforeAll
    static void beforeAll() {
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorNew.class).proceed().validate();
    }

    @BeforeEach
    void setUp() {
        CreatorProductPage.creatorCenterLogo().click();
    }

    @AfterEach
    void tearDown() {
        SF.get(DeleteFirstProduct.class).proceed();
    }

    @Test
    void addClass() {
        SF.get(CheckAddClass.class).proceed().validate();
    }

    @Test
    void addDigitalFile() {
        SF.get(CheckAddDigitalFile.class).proceed().validate();
    }

    @Test
    void addEBook() {
        SF.get(CheckAddEBook.class).proceed().validate();
    }

    @Test
    void requestReview() {
        SF.get(CheckRequestClassReview.class).proceed().validate();
    }
}
