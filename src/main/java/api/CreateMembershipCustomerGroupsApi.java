package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.MembershipCustomerGroupsData;
import models.ResponseMembershipCustomerGroupsData;

import static constants.ServiceConstants.ENDPOINT_MEMBERSHIP_CUSTOMERGROUPS;
public class CreateMembershipCustomerGroupsApi extends BaseRequest {

    public ResponseData<ResponseMembershipCustomerGroupsData> createmembershipcustomerGroupsData(MembershipCustomerGroupsData membershipCustomerGroupsData ) {
        Response response = base()
                .body(membershipCustomerGroupsData)
                .get(ENDPOINT_MEMBERSHIP_CUSTOMERGROUPS);

        response.then().log().all();
        ResponseMembershipCustomerGroupsData responseBody = response.as(ResponseMembershipCustomerGroupsData.class);
        return new ResponseData<>(response, responseBody);
    }
}