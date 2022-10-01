package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.ChangePasswordData;
import models.PasswordResetData;
import models.ResponseChangePasswordData;
import models.ResponsePasswordResetData;

import static constants.ServiceConstants.ENDPOINT_CHANGE_PASSWORD;

public class CreateChangePasswordApi extends BaseRequest {

    public ResponseData<ResponseChangePasswordData> createchangePasswordData(ChangePasswordData changePasswordData ) {
        Response response = base()
                .body(changePasswordData)
                .patch(ENDPOINT_CHANGE_PASSWORD);

        response.then().log().all();
        ResponseChangePasswordData responseBody = response.as(ResponseChangePasswordData.class);
        return new ResponseData<>(response, responseBody);
    }
}