package net.class101.automateduitest.testSuites.creator;

import net.class101.automateduitest.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.scenarios.creator.CheckAddClass;
import net.class101.automateduitest.scenarios.creator.CheckAddDigitalFile;
import net.class101.automateduitest.scenarios.creator.CheckAddEBook;
import net.class101.automateduitest.scenarios.creator.DeleteFirstProduct;
import net.class101.automateduitest.scenarios.creator.LoginAsCreatorNew;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddProduct {

    @BeforeAll
    static void beforeAll() {
        CreatorHome.Actions.openPage();
        LoginAsCreatorNew.getInstance().proceed().validate();
    }

    @BeforeEach
    void setUp() {
        CreatorProductPage.Elements.creatorCenterLogo().click();
    }

    @AfterEach
    void tearDown() {
        DeleteFirstProduct.getInstance().proceed();
    }

    @Test
    void addClass() {
        CheckAddClass.getInstance().proceed().validate();
    }

    @Test
    void addDigitalFile() {
        CheckAddDigitalFile.getInstance().proceed().validate();
    }

    @Test
    void addEBook() {
        CheckAddEBook.getInstance().proceed().validate();
    }
}
