package net.class101.automateduitest.resources.testcases.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.pages.plus.MyPageEditProfile;
import net.class101.automateduitest.resources.testcases.TestCase;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import java.io.File;

/**
 * @설명: 마이 페이지에서 프로필 이미지를 변경한다.
 * @분류: 마이 페이지 - 프로필 이미지 변경
 * @테스트_선행조건:
 *
 */

public class MypageProfileImgChange implements TestCase {

    @Override
    public TestCase proceed() {
        Home.userProfileImg().click();
        MyPageEditProfile.myPageCenterProfileImgInput().uploadFile(new File(MyPageEditProfile.Actions.setTestImages()));
        // if문을 통해 변경된 이미지가 이전 이미지와 같으면 이미지를 다시 랜덤으로 가져와 업로드.
        {
            if (MyPageEditProfile.Actions.setRecentLoadImage().equals(MyPageEditProfile.Actions.getTestImages())){
                MyPageEditProfile.myPageCenterProfileImgInput().uploadFile(new File(MyPageEditProfile.Actions.setTestImages()));
            }
        }
        MyPageEditProfile.myPageInfoSave().shouldBe(Condition.enabled).click();
        return this;

    }

    @Override
    public void validate() {
        // 이전에 등록된 이미지와 최근에 변경한 이미지가 다르면 이미지가 변경되었다는걸 확인.
        assertNotSame(MyPageEditProfile.Actions.getRecentLoadImage(), MyPageEditProfile.Actions.setTestImages());

    }

}
