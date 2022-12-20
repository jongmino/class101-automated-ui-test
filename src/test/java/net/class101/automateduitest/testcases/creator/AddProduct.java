package net.class101.automateduitest.testcases.creator;

import net.class101.automateduitest.common.SF;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.resources.actions.creator.CheckAddClass;
import net.class101.automateduitest.resources.actions.creator.CheckAddDigitalFile;
import net.class101.automateduitest.resources.actions.creator.CheckAddEBook;
import net.class101.automateduitest.resources.actions.creator.CheckRequestClassReview;
import net.class101.automateduitest.resources.actions.creator.DeleteFirstProduct;
import net.class101.automateduitest.resources.actions.creator.LoginAsCreatorNew;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddProduct {

    @BeforeAll
    static void beforeAll() {
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorNew.class).execute().validate();
    }

    @BeforeEach
    void setUp() {
        CreatorProductPage.Elements.creatorCenterLogo().click();
    }

    @AfterEach
    void tearDown() {
        SF.get(DeleteFirstProduct.class).execute();
    }

    @Test
    void addClass() {
        SF.get(CheckAddClass.class).execute().validate();
    }

    @Test
    void addDigitalFile() {
        SF.get(CheckAddDigitalFile.class).execute().validate();
    }

    @Test
    void addEBook() {
        SF.get(CheckAddEBook.class).execute().validate();
    }

    @Test
    void requestReview() {
        SF.get(CheckRequestClassReview.class).execute().validate();
    }
}
