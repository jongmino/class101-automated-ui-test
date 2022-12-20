package net.class101.automateduitest.resources.pages.creatorCenter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;
import net.class101.automateduitest.resources.common.PropertyLoader;

public class CreatorHome {

    private static final String NAVIGATION_PROFILE_IMG = "img[alt='profile']";

    public static SelenideElement profileImg() {
        return $(NAVIGATION_PROFILE_IMG);
    }

    public class Actions {
        public static void openPage() {
            final String CREATOR_CENTER_URL = PropertyLoader.getProperties().urls.get("creatorHome").staging;
            open(CREATOR_CENTER_URL);
        }
    }
}
