package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.PasswordResetData;
import models.ResponsePasswordResetData;

import static constants.ServiceConstants.ENDPOINT_PASSWORD_RESET;


public class CreatePasswordResetApi extends BaseRequest {

    public ResponseData<ResponsePasswordResetData> createresetPasswordData(PasswordResetData passwordResetData ) {
        Response response = base()
                .body(passwordResetData)
                .post(ENDPOINT_PASSWORD_RESET);

        response.then().log().all();
        ResponsePasswordResetData responseBody = response.as(ResponsePasswordResetData.class);
        return new ResponseData<>(response, responseBody);
    }
}