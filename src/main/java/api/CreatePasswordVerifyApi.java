package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.PasswordVerifyData;
import models.ResponsePasswordVerifyData;


import static constants.ServiceConstants.ENDPOINT_PASSWORD_VERIFY;

public class CreatePasswordVerifyApi extends BaseRequest {

    public ResponseData<ResponsePasswordVerifyData> createpasswordVerifyData(PasswordVerifyData passwordVerifyData ) {
        Response response = base()
                .body(passwordVerifyData)
                .post(ENDPOINT_PASSWORD_VERIFY);

        response.then().log().all();
        ResponsePasswordVerifyData responseBody = response.as(ResponsePasswordVerifyData.class);
        return new ResponseData<>(response, responseBody);
    }
}