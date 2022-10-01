package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.MembershipCardInfoData;
import models.ResponseMembershipCardInfoData;

import static constants.ServiceConstants.ENDPOINT_MEMBERSHIP_CARD_INFO;

public class CreateMembershipCardInfoApi extends BaseRequest {

    public ResponseData<ResponseMembershipCardInfoData> createmembershipcardaInfoData(MembershipCardInfoData membershipCardInfoData ) {
        Response response = base()
                .body(membershipCardInfoData)
                .get(ENDPOINT_MEMBERSHIP_CARD_INFO);

        response.then().log().all();
        ResponseMembershipCardInfoData responseBody = response.as(ResponseMembershipCardInfoData.class);
        return new ResponseData<>(response, responseBody);
    }
}