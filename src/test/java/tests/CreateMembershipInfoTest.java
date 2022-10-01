package tests;

import base.BaseTest;
import base.ResponseData;
import models.MembershipInfoData;
import models.ResponseMembershipInfoData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CreateMembershipInfoTest extends BaseTest {

    @Test
    @DisplayName("Verify create Identify API return 200 when using valid data")
    @Tag("positive")
    public void createMembershipInfo() {
        MembershipInfoData requestBody = new MembershipInfoData();
        ResponseData<ResponseMembershipInfoData> response = createMembershipInfoApi.createmembershipInfoData(requestBody);
        Assertions.assertEquals(200, response.getResponse().getStatusCode());
    }
}