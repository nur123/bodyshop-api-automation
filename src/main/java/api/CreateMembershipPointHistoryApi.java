package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.MembershipPointHistoryData;
import models.ResponseMembershipPointHistoryData;

import static constants.ServiceConstants.ENDPOINT_MEMBERSHIP_POINT_HISTORY;


public class CreateMembershipPointHistoryApi extends BaseRequest {

    public ResponseData<ResponseMembershipPointHistoryData> createmembershippointHistoryData(MembershipPointHistoryData membershipPointHistoryData ) {
        Response response = base()
                .body(membershipPointHistoryData)
                .get(ENDPOINT_MEMBERSHIP_POINT_HISTORY);

        response.then().log().all();
        ResponseMembershipPointHistoryData responseBody = response.as(ResponseMembershipPointHistoryData.class);
        return new ResponseData<>(response, responseBody);
    }
}