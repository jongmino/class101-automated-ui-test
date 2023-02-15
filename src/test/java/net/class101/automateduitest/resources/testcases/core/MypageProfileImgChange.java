package net.class101.automateduitest.resources.testcases.core;

import com.codeborne.selenide.Condition;
import net.class101.automateduitest.resources.common.Utils;
import net.class101.automateduitest.resources.pages.plus.MyPage;
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
        MyPage.myPageCenterProfileImg().click();
        //Mypage에 이미지 4개를 선언해두고 램덤으로 가져오게 함.
        MyPage.myPageCenterProfileImgInput().uploadFile(new File(MyPage.setTestImages()));
        Utils.sleep(3000);
        // if문을 통해 변경된 이미지가 이전 이미지와 같으면 이미지를 다시 랜덤으로 가져와 업로드.
        {
            if (MyPage.setRecentLoadImage().equals(MyPage.getTestImages())){
                MyPage.myPageCenterProfileImgInput().uploadFile(new File(MyPage.setTestImages()));
            }
        }
        Utils.sleep(3000);
        MyPage.myPageInfoSave().shouldBe(Condition.enabled).click();
        Utils.sleep(3000);
        return this;

    }

    @Override
    public void validate() {
        // 이전에 등록된 이미지와 최근에 변경한 이미지가 다르면 이미지가 변경되었다는걸 확인.
        assertNotSame(MyPage.getRecentLoadImage(), MyPage.setTestImages());

    }

}
