package net.class101.automateduitest.resources.testcases.core;

import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.plus.Home;
import net.class101.automateduitest.resources.pages.plus.MyPage;
import net.class101.automateduitest.resources.pages.plus.MyPageEditProfile;
import net.class101.automateduitest.resources.testcases.TestCase;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @설명: 마이 페이지에서 닉네임을 변경한다.
 * @분류: 마이 페이지 - 닉네임 변경
 * @테스트_선행조건:
 *
 */

public class MypageNicknameChange implements TestCase {

    @Override
    public TestCase proceed() {
        Home.userProfileImg().click();
        MyPageEditProfile.myPageProfileButton().click();
        MyPageEditProfile.myPageNicknameInput().clear();
        MyPageEditProfile.myPageNicknameInput().sendKeys(MyPageEditProfile.Actions.setNickname());
        MyPageEditProfile.myPageInfoSave().click();
        return this;

    }

    @Override
    public void validate() {
        assertEquals(MyPageEditProfile.myPageLeftNickname().text(), MyPageEditProfile.Actions.getRecentLoadNickname());
    }

}
