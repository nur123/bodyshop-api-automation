package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.MembershipInfoData;
import models.ResponseMembershipInfoData;

import static constants.ServiceConstants.ENDPOINT_MEMBERSHIP_INFO;

public class CreateMembershipInfoApi extends BaseRequest {

    public ResponseData<ResponseMembershipInfoData> createmembershipInfoData(MembershipInfoData membershipInfoData ) {
        Response response = base()
                .body(membershipInfoData)
                .get(ENDPOINT_MEMBERSHIP_INFO);

        response.then().log().all();
        ResponseMembershipInfoData responseBody = response.as(ResponseMembershipInfoData.class);
        return new ResponseData<>(response, responseBody);
    }
}