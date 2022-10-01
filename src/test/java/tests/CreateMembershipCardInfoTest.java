package tests;

import base.BaseTest;
import base.ResponseData;
import models.MembershipCardInfoData;
import models.ResponseMembershipCardInfoData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CreateMembershipCardInfoTest extends BaseTest {

    @Test
    @DisplayName("Verify create Identify API return 200 when using valid data")
    @Tag("positive")
    public void createMembershipCardInfo() {
        MembershipCardInfoData requestBody = new MembershipCardInfoData();
        ResponseData<ResponseMembershipCardInfoData> response = createMembershipCardInfoApi.createmembershipcardaInfoData(requestBody);
        Assertions.assertEquals(200, response.getResponse().getStatusCode());
    }
}