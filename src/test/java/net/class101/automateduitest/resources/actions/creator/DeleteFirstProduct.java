package net.class101.automateduitest.resources.actions.creator;

import net.class101.automateduitest.resources.pages.creatorCenter.CreatorProductPage;
import net.class101.automateduitest.resources.actions.TestAction;

/**
 * 상품 관련 테스트케이스 실행 후 추가된 상품 제거용 시나리오
 *
 * Prerequisite:
 * 1) 상품이 생성되는 테스트 케이스를 실행한다
 * 2) 해당 시나리오를 불러준다 (tearDown에 넣어주거나 다음 라인에 추가해준다)
 */
public class DeleteFirstProduct implements TestAction {

    @Override
    public TestAction execute() {
        CreatorProductPage.Actions.deleteFirstProduct();
        return this;
    }

    @Override
    public void validate() {
    }
}
