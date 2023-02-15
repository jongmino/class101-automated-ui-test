package net.class101.automateduitest.resources.pages.creatorCenter;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.resources.common.PropertyLoader;
import org.openqa.selenium.By;

public class CreatorHome {

    private static final String NAVIGATION_PROFILE_IMG = "img[alt='profile']";
    private static final By LOGOUT_BUTTON = byXpath("//p[text()='로그아웃']");

    public static SelenideElement profileImg() {
        return $(NAVIGATION_PROFILE_IMG).shouldBe(Condition.visible);
    }

    public static SelenideElement logoutButton() {
        return $(LOGOUT_BUTTON).shouldBe(Condition.visible);
    }

    public class Actions {
        public static void openPage() {
            final String CREATOR_CENTER_URL = PropertyLoader.getProperties().urls.get("creatorHome");
            open(CREATOR_CENTER_URL);
        }
    }

    public class ProductList {
        public static void openPage() {
            final String CREATOR_CENTER_PRODUCT_URL = PropertyLoader.getProperties().urls.get("creatorProduct");
            open(CREATOR_CENTER_PRODUCT_URL);
        }
    }

    public class DirectUrl {
        public static void openPage() {
            final String CREATOR_CENTER_PRODUCT_DIRECT_URL = CreatorNewClassPage.getCurrentUrl();
            open(CREATOR_CENTER_PRODUCT_DIRECT_URL);
        }
    }

    public class AdminClassesUrl {
        public static void openPage() {
            final String CREATOR_CENTER_ADMIN_CLASSES_URL = PropertyLoader.getProperties().urls.get("adminClasses");
            open(CREATOR_CENTER_ADMIN_CLASSES_URL);
        }
    }

}
