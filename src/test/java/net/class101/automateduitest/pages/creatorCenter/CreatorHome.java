package net.class101.automateduitest.pages.creatorCenter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.common.PropertyLoader;

public class CreatorHome {

    public class Elements {
        private static final String NAVIGATION_PROFILE_IMG = "img[alt='profile']";

        public static SelenideElement profileImg() {
            return $(NAVIGATION_PROFILE_IMG);
        }

    }

    public class Actions {
        private static final String CREATOR_CENTER_STAGING_URL = PropertyLoader.getProperties().urls.get("creatorHome").staging;

        public static void openPage() {
            open(CREATOR_CENTER_STAGING_URL);
        }
    }

}
