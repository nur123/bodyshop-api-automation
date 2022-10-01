package tests;

import base.BaseTest;
import base.ResponseData;
import models.MembershipShoppingHistoryData;
import models.ResponseMembershipShoppingHistoryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CreateMembershipShoppingHistoryTest extends BaseTest {

    @Test
    @DisplayName("Verify create Identify API return 200 when using valid data")
    @Tag("positive")
    public void createMembershipShoppingHistory() {
        MembershipShoppingHistoryData requestBody = new MembershipShoppingHistoryData();
        ResponseData<ResponseMembershipShoppingHistoryData> response = createMembershipShoppingHistoryApi.createmembershipshoppingHistoryData(requestBody);
        Assertions.assertEquals(200, response.getResponse().getStatusCode());
    }
}