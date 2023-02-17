package net.class101.automateduitest.resources.pages.admin;

import net.class101.automateduitest.resources.common.PropertyLoader;

import static com.codeborne.selenide.Selenide.open;

public class adminClassesPage {

    public class AdminClassesUrl {
        public static void openPage() {
            final String CREATOR_CENTER_ADMIN_CLASSES_URL = PropertyLoader.getProperties().urls.get("adminClasses");
            open(CREATOR_CENTER_ADMIN_CLASSES_URL);
        }
    }
}
