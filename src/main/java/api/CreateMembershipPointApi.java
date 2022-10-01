package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.MembershipPointData;
import models.ResponseMembershipPointData;

import static constants.ServiceConstants.ENDPOINT_MEMBERSHIP_POINT;

public class CreateMembershipPointApi extends BaseRequest {

    public ResponseData<ResponseMembershipPointData> createmembershipPointData(MembershipPointData membershipPointData ) {
        Response response = base()
                .body(membershipPointData)
                .get(ENDPOINT_MEMBERSHIP_POINT);

        response.then().log().all();
        ResponseMembershipPointData responseBody = response.as(ResponseMembershipPointData.class);
        return new ResponseData<>(response, responseBody);
    }
}