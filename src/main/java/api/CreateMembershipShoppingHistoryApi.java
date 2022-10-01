package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.MembershipShoppingHistoryData;
import models.ResponseMembershipShoppingHistoryData;

import static constants.ServiceConstants.ENDPOINT_MEMBERSHIP_SHOPPING_HISTORY;


public class CreateMembershipShoppingHistoryApi extends BaseRequest {

    public ResponseData<ResponseMembershipShoppingHistoryData> createmembershipshoppingHistoryData(MembershipShoppingHistoryData membershipShoppingHistoryData ) {
        Response response = base()
                .body(membershipShoppingHistoryData)
                .get(ENDPOINT_MEMBERSHIP_SHOPPING_HISTORY);

        response.then().log().all();
        ResponseMembershipShoppingHistoryData responseBody = response.as(ResponseMembershipShoppingHistoryData.class);
        return new ResponseData<>(response, responseBody);
    }
}