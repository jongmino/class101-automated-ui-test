package net.class101.automateduitest.resources.pages.plus;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.Random;
import java.util.UUID;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MyPageEditProfile {

    private static final By MY_PAGE_PROFILE_BUTTON = byXpath("(//img[@alt='profile-picture'])[1]");
    private static final By MY_PAGE_NICKNAME_INPUT = byXpath("//input[@name='nickName']");
    public static final By MY_PAGE_INFO_SAVE = byXpath("//span[text()='저장하기']");
    public static final By MY_PAGE_LEFT_NICKNAME = byXpath("//*[@id=\"__next\"]/main/div/div[6]/div/div[3]/div/div/div[1]/div/div/div/a/div/div[1]/div/div[3]/div/div/div[1]/p");
    private static final By MY_PAGE_CENTER_PROFILE_IMG_INPUT = byXpath("//input[@type='file' and contains(@name,'photoUrl')]");


    public static SelenideElement myPageProfileButton() {return $(MY_PAGE_PROFILE_BUTTON).shouldBe(Condition.visible);}

    public static SelenideElement myPageNicknameInput() {return $(MY_PAGE_NICKNAME_INPUT).shouldBe(Condition.visible);}

    public static SelenideElement myPageInfoSave() {return $(MY_PAGE_INFO_SAVE).shouldBe(Condition.visible);}

    public static SelenideElement myPageLeftNickname() {return $(MY_PAGE_LEFT_NICKNAME).shouldBe(Condition.visible);}

    public static SelenideElement myPageCenterProfileImgInput() {return $(MY_PAGE_CENTER_PROFILE_IMG_INPUT);}

    public class Actions {
        // 닉네임 변경
        private static String RecentLoadNickname = "getRecentLoadNickname";
        public static String setNickname() {
            RecentLoadNickname = UUID.randomUUID().toString().replace("-", "").substring(0, 20);
            return RecentLoadNickname;
        }
        public static String getRecentLoadNickname() {
            return RecentLoadNickname;
        }

        // 프로필 이미지 변경
        public static final String[] TEST_IMAGE = { "src/test/images/1.jpeg", "src/test/images/2.jpeg", "src/test/images/3.jpeg", "src/test/images/4.jpeg" };
        public static String setTestImages() {
            Random random = new Random();
            int randomNum = random.nextInt(3);
            return TEST_IMAGE[randomNum];
        }

        public static String getTestImages() {
            return TEST_IMAGE[0];
        }

        public static String RecentLoadImage = "getRecentLoadImage";
        public static String setRecentLoadImage() {
            RecentLoadImage = setTestImages();
            return RecentLoadImage;
        }
        public static String getRecentLoadImage() {
            return RecentLoadImage;
        }
    }

}
