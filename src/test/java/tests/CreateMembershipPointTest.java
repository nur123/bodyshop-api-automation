package tests;

import base.BaseTest;
import base.ResponseData;
import models.MembershipPointData;
import models.ResponseMembershipPointData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CreateMembershipPointTest extends BaseTest {

    @Test
    @DisplayName("Verify create Identify API return 200 when using valid data")
    @Tag("positive")
    public void createMembershipPoint() {
        MembershipPointData requestBody = new MembershipPointData();
        ResponseData<ResponseMembershipPointData> response = createMembershipPointApi.createmembershipPointData(requestBody);
        Assertions.assertEquals(200, response.getResponse().getStatusCode());
    }
}