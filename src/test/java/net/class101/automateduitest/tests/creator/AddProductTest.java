package net.class101.automateduitest.tests.creator;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import net.class101.automateduitest.resources.common.SF;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorHome;
import net.class101.automateduitest.resources.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.resources.testcases.core.Logout;
import net.class101.automateduitest.resources.testcases.creator.CheckAddClass;
import net.class101.automateduitest.resources.testcases.creator.CheckAddDigitalFile;
import net.class101.automateduitest.resources.testcases.creator.CheckAddEBook;
import net.class101.automateduitest.resources.testcases.creator.CheckRequestClassReview;
import net.class101.automateduitest.resources.testcases.creator.DeleteFirstProduct;
import net.class101.automateduitest.resources.testcases.creator.LoginAsCreatorNew;
import net.class101.automateduitest.resources.testcases.creator.LogoutCreatorCenter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class AddProductTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.timeout = 20000;
        CreatorHome.Actions.openPage();
        SF.get(LoginAsCreatorNew.class).proceed();
    }

    @AfterAll
    static void afterAll() {
        SF.get(LogoutCreatorCenter.class).proceed();
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
    void testAddClass() {
        SF.get(CheckAddClass.class).proceed().validate();
    }

    @Test
    void testAddDigitalFile() {
        SF.get(CheckAddDigitalFile.class).proceed().validate();
    }

    @Test
    void testAddEBook() {
        SF.get(CheckAddEBook.class).proceed().validate();
    }

    @Test
    void testRequestReview() {
        SF.get(CheckRequestClassReview.class).proceed().validate();
    }
}
