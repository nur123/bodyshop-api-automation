package tests;

import base.BaseTest;
import base.ResponseData;
import models.MembershipCustomerGroupsData;
import models.ResponseMembershipCustomerGroupsData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CreateMembershipCustomerGroupsTest extends BaseTest {

    @Test
    @DisplayName("Verify create Identify API return 200 when using valid data")
    @Tag("positive")
    public void createMembershipCustomerGroup() {
        MembershipCustomerGroupsData requestBody = new MembershipCustomerGroupsData();
        ResponseData<ResponseMembershipCustomerGroupsData> response = createMembershipCustomerGroupsApi.createmembershipcustomerGroupsData(requestBody);
        Assertions.assertEquals(200, response.getResponse().getStatusCode());
    }
}