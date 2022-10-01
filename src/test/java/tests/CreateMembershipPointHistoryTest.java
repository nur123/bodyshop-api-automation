package tests;

import base.BaseTest;
import base.ResponseData;
import models.MembershipPointHistoryData;
import models.ResponseMembershipPointHistoryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CreateMembershipPointHistoryTest extends BaseTest {

    @Test
    @DisplayName("Verify create Identify API return 200 when using valid data")
    @Tag("positive")
    public void createMembershipPointHistory() {
        MembershipPointHistoryData requestBody = new MembershipPointHistoryData();
        ResponseData<ResponseMembershipPointHistoryData> response = createMembershipPointHistoryApi.createmembershippointHistoryData(requestBody);
        Assertions.assertEquals(200, response.getResponse().getStatusCode());
    }
}